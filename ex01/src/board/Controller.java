package board;

import java.util.Scanner;

public class Controller {
	Scanner scan;
	MemberDAO memberDAO;
	
	public void init() {
		scan = new Scanner(System.in);
		memberDAO = new MemberDAO();
		memberDAO.init(100);
	}
	
		void run() {
		while(true) {
			System.out.println("===게시판===");
			System.out.println("***************");
			System.out.println("1. 게시글보기");
			System.out.println("2. 글 작성");
			System.out.println("3. 글 삭제");
			System.out.println("4. 글 수정");
			System.out.println("0.프로그램 종료.");
			int sel = scan.nextInt();
			if(sel == 1) {
				memberDAO.viewPosts();
			}else if(sel == 2) {
				memberDAO.writing();
			}else if(sel == 3) {
				memberDAO.delete();
			}else if(sel == 4) {
				memberDAO.update();
			}else if(sel == 0) {
				System.out.println("프로그램 종료.");
				break;
			}else {
				System.out.println("잘못 입력하셨습니다.");
			}
		}
	}

}
