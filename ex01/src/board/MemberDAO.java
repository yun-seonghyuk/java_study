package board;

import java.util.Scanner;

import board2.Controller;

public class MemberDAO extends Controller{
	Scanner scan;
	Board2[] memberList;
	int memberCount;
	int max;
	public void init(int size) {
		scan = new Scanner(System.in);
		max = size;
		memberList = new Board2[max];
		memberCount = 0;
	}
	public void viewPosts() {
		if(memberCount == 0) {
			System.out.println("게시물이 없습니다.");
			System.out.println("==================");
		}else {
			for(int i = 0; i < memberCount; i++) {
				memberList[i].prt2();
			}
			System.out.println("게시글 번호입력 : ");
			int num = scan.nextInt();
			int index = -1;
			for(int i = 0; i < memberCount; i++) {
				if(memberList[i].getBoardNum() == num) {
					index = i;
					break;
				}
			}
			if(index == -1) {
				System.out.println("해당번호가 없습니다");
			}else {
				memberList[index].prt();
			}
		}
	}
	public void writing() {
		System.out.println("제목 입력 : ");
		String title = scan.next();
		System.out.println("작성자 입력 : ");
		String writer = scan.next();
		System.out.println("글 내용 입력 : ");
		String content = scan.next();
		System.out.println("비밀번호 입력 : ");
		String password = scan.next();
		Board2 member2 = new Board2(title,writer,content,password);
		memberList[memberCount] = member2;
		memberCount+=1;
		System.out.println("게시글 작성완료");
		System.out.println("==================");
	}
	public void delete() {
		for(int i = 0; i < memberCount; i++) {
			memberList[i].prt();
		}
		System.out.println("작성자 입력 : ");
		String writer = scan.next();
		System.out.println("비밀번호 입력 : ");
		String password = scan.next();
		
		boolean check = false;
		int index = -1;
		for(int i = 0; i < memberCount; i++) {
			if(memberList[i].writer.equals(writer) &&
				memberList[i].password.equals(password)	) {
				check = true;
				index = i;
				break;
			}
		}
		if(check == true) {
			for(int i = index; i < memberCount; i++) {
				memberList[i] = memberList[i + 1];
			}
			memberCount-=1;
			System.out.println("게시글이 삭제되었습니다.");
			System.out.println("==================");
		}else {
			System.out.println("정보가 다릅니다.");
		}
	}
	public void update() {
		for(int i = 0; i < memberCount; i++) {
			memberList[i].prt();
		}
		System.out.println("수정할 게시글번호 : ");
		int num = scan.nextInt();
		System.out.println("비밀번호 : ");
		String password = scan.next();
		int index = -1;
		for(int i = 0; i < memberCount; i++) {
			if(memberList[i].getBoardNum() == num &&
				memberList[i].password.equals(password)) {
				index = i;
				break;
			}
		}
		if(index == -1) {
			System.out.println("해당번호가 일치하지 않습니다.");
		}else{
			System.out.println("수정할 글 입력 : ");
			String content = scan.next();
			memberList[index].content = content;
			System.out.println("수정완료.");
		}
	}
}
