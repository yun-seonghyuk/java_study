package account;

import java.util.Scanner;

public class Controller {
	Scanner scan;
	AccountDAO accountDAO;
	Account account;
	int accIndex;
	public void init() {
		scan = new Scanner(System.in);
		accountDAO = new AccountDAO();
		account = new Account();
		accountDAO.init();
	}

	public void run() {
		mainMenu();
	}

	private void mainMenu() {
		while(true) {
			System.out.println("====그린뱅크====");
			System.out.println("1.계좌생성");
			System.out.println("2.은행업무");
			System.out.println("3.종료");
			System.out.println();
			int sel = scan.nextInt();
			
			if(sel == 1) {
				accountDAO.creatAccount();
			}else if(sel == 2) {
				accountDAO.accountCheck();
			}else if(sel == 3) {
				System.out.println("종료");
				break;
			}else {
				
			}
		}
	}




}
