package I2_클래스배열매소드2_프로젝트1_멤버1;

import java.util.Scanner;

public class MemberController {
	Scanner scan;
	MemberDAO memberDAO;
	
	void init() {
		scan = new Scanner(System.in);
		memberDAO = new MemberDAO();
		memberDAO.init(100);
	}
	void run() {
		while(true) {
			System.out.println("1.회원가입 2. 삭제 3.수정 4.회원목록");
			int sel = scan.nextInt();
			if(sel == 1) {
				memberDAO.join();
			}else if(sel == 2) {
				memberDAO.delete();
			}else if(sel == 3) {
				memberDAO.update();
			}else if(sel == 4) {
				memberDAO.printAll();
			}else if(sel == 0) {
				System.out.println("종료");
				break;
			}
		}
	}
}
