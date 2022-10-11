package board2;

import java.util.Scanner;

import board.Board2;

public class BoardDAO {

	Scanner scan;
	Board[] boardList;
	Member member = new Member();
	int boardCount;
	int max;
	public void init(int size) {
		scan = new Scanner(System.in);
		max = size;
		boardList = new Board[max];
		
		boardCount = 0;
	}
	public void viewPosts() {
		if(boardCount == 0) {
			System.out.println("게시물이 없습니다.");
			System.out.println("==================");
		}else{
			for(int i = boardCount-1; i >= 0; i--) {
				boardList[i].prt();
			}
		}
	}
	public void myViewPosts(Member memberlog) {
		boolean check = false;
		for(int i = boardCount-1; i >= 0; i--) {
			if(boardList[i].getWriter().equals(memberlog.getId())) {
				boardList[i].prt();
				check = true;
			}
		}
		if(check == false) {
			System.out.println("게시물이 없습니다.");
		}
	}


	public void writing(Member memberlog) {
		System.out.println("제목 입력 : ");
		String title = scan.next();

		System.out.println("글 내용 입력 : ");
		String content = scan.next();
		Board member = new Board(title,memberlog.getId(),content);
		boardList[boardCount] = member;
		boardCount+=1;
		System.out.println("게시글 작성완료");
		System.out.println("==================");
		
	}

	

	public void update() {
		System.out.println("수정할 게시글번호 : ");
		int index = -1;
		
		index = boardNumCheck(index);
		if(index == -1) {
			System.out.println("번호가 맞지 않습니다.");
		}else {
			System.out.println("수정할 글 입력 : ");
			String content = scan.next();
			boardList[index].setContent(content);
			System.out.println("수정완료.");
		}
	}
	public int boardNumCheck(int index) {
		int num = scan.nextInt();
		for(int i = 0; i < boardCount; i++) {
			if(boardList[i].getBoardNum() == num) {
				index = i;
				break;
			}
		}
		return index;
	}
	public void delete() {
		System.out.println("게시글 번호입력 : ");
		int index = -1;
		index = boardNumCheck(index);
		if(index == -1) {
			System.out.println("번호가 맞지 않습니다.");
		}else {
			for(int i = index; i < boardCount; i++) {
				boardList[i] = boardList[i + 1];
			}
			boardCount-=1;
			System.out.println("게시글이 삭제되었습니다.");
		}
		System.out.println("==================");
	
	}
		
	


}
