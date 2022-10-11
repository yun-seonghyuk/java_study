package account;

import java.util.Scanner;

public class AccountDAO {
	Scanner scan;
	Controller con;
	public void init() {
		scan = new Scanner(System.in);
		con = new Controller();
	}

	
	public void accountCheck() {
		System.out.println("계좌번호 입력 : ");
		String accountNumber = scan.next();
		
		int accIndex =-1;
		for(int i = 0; i < Main.accounts.length; i++) {
			if(Main.accounts[i] !=null && Main.accounts[i].getAccountNumber().equals(accountNumber)) {
				accIndex = i;
				break;
			}
		}
		
		if(accIndex==-1) {
			System.out.println("계좌 번호를 잘못 입력했거나 \n해당 계좌가 존재하지 않습니다.");
		}else {
			bankWork(accIndex);
			
		}
	}
	public void creatAccount() {
		System.out.println("예금주 입력 : ");
		String holder = scan.next();
		System.out.println("계좌번호 입력 : ");
		String accountNumber = scan.next();
		System.out.println("초기금액 : ");
		int money = scan.nextInt();
		
		Account acc = new Account(holder, accountNumber, money);
		
		boolean check = false;
		
		for(int i = 0; i < Main.accounts.length; i++) {
			if(Main.accounts[i] !=null && Main.accounts[i].getAccountNumber().equals(accountNumber)) {
				check = true;
				break;
			}
		}
		if(check == true) {
			System.out.println("계좌번호 중복");
		}else {
			Main.accounts[Main.count] = acc; 
			Main.count+=1;
			System.out.println("계좌생성");
		}
	}
	public void bankWork(int accIndex) {
		System.out.println(accIndex);
		boolean workRun = true; 
		while(workRun) {
			System.out.println("----------------------------------------");
			System.out.println(Main.accounts[accIndex].getHolder()+"님 환영합니다.");
			System.out.println("메뉴를 선택해주세요.");
			System.out.println("1. 잔액 조회");
			System.out.println("2. 입금");
			System.out.println("3. 출금");
			System.out.println("4. 이전 메뉴 돌아가기");
			System.out.print("선택>>");
			int selectMenu = scan.nextInt();
			int money = 0;
			switch(selectMenu) {
			case 1:// 잔액 조회 기능
				Main.accounts[accIndex].checkBalance();//
				break;
			case 2:// 입금
				System.out.println("--------------------------------");
				System.out.println("입금할 급액을 입력하세요.");
				System.out.print("입금액 : ");
				money = scan.nextInt();
				Main.accounts[accIndex].deposit(money);
				System.out.println("--------------------------------");
				break;
			case 3:// 출금
				System.out.println("--------------------------------");
				System.out.println("출금할 급액을 입력하세요.");
				System.out.print("출금액 : ");
				money = scan.nextInt();
				Main.accounts[accIndex].withdraw(money);
				System.out.println("--------------------------------");
				break;
			case 4:// 이전메뉴 돌아가기
				System.out.println("이전 메뉴로 돌아갑니다.");
				workRun = false;
				System.out.println("--------------------------------");
				break;
			default :
				System.out.println("오류");
			}
			
			
		}
		
		
	}

}
