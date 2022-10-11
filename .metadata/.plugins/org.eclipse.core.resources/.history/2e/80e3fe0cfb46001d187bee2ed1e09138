package K4_스태틱_알고리즘_스택틱사용후_Bank;

import java.util.Scanner;

public class Controller {
	
	static private Scanner scan  = new Scanner(System.in);
	
	static public void setSampleData() {
		String userdata = "test01/pw1/김철수\n";
		userdata += "test02/pw2/이영희\n";
		userdata += "test03/pw3/신민수\n";
		userdata += "test04/pw4/최상민";
				
		String accountdata = "test01/1111-1111-1111/8000\n";
		accountdata += "test02/2222-2222-2222/5000\n";
		accountdata += "test01/3333-3333-3333/11000\n";
		accountdata += "test03/4444-4444-4444/9000\n";
		accountdata += "test01/5555-5555-5555/5400\n";
		accountdata += "test02/6666-6666-6666/1000\n";
		accountdata += "test03/7777-7777-7777/1000\n";
		accountdata += "test04/8888-8888-8888/1000";		
		// 1) test01 김철수 는 계좌를 3개 가지고있다.
		// 2) test02 이영희 는 계좌를 2개 가지고있다.
		// 3) test03 신민수 는 계좌를 2개 가지고있다.
		// 4) test04 최상민 은 계좌를 1개 가지고있다. 
		
		UserDAO.dataSetting(userdata);
		AccountDAO.dataSetting(accountdata);
	}
	
	static public void run() {
		
		while(true) {
			System.out.println("(1)회원가입  (2)입금 (3)조회 (4)계좌추가 (5)이체 (6)회원탈퇴 (7)계좌삭제 (0)종료");
			int sel = scan.nextInt();
			if(sel == 1) {
				UserDAO.join();				
			}
			else if(sel == 2) {
				AccountDAO.deposit();
			}
			else if(sel == 3) {
				AccountDAO.checkBalance();
			}
			else if(sel == 4) {
				//만들어보세요.
                //회원탈퇴시 (가지고있는계좌도 전부삭제)
			}
			else if(sel == 0) {
				System.out.println("종료");
				break;
			}
		}		
	}
}
