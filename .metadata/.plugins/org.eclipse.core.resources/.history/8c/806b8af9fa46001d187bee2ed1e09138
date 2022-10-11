package K4_스태틱_알고리즘_스택틱사용후_Bank;

import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

public class AccountDAO{
	static private Scanner scan  = new Scanner(System.in);
	static private Vector<Account> accountlist = new Vector<Account>();
	static public void dataSetting(String data){
		String token[] = data.split("\n");
		for(int i = 0; i < token.length; i++) {
			Account ac = new Account();
			String token2[] = token[i].split("/");
			ac.setUserId(token2[0]);
			ac.setAccountId(token2[1]);
			ac.setMoney(Integer.parseInt(token2[2]));
			

			accountlist.add(ac);
		}
	}	
	static public Vector<Account> getPersonalAccount(String id){
		Vector<Account> personalList = new Vector<Account>();
		for(int i = 0; i < accountlist.size(); i++) {
			if(accountlist.get(i).getUserId().equals(id)) {
				personalList.add(accountlist.get(i));
			}
		}
		return personalList;
	}
	static public void openAccount(String id) {
		Random ran = new Random();
		String acId = "";
		for(int i = 0; i < 3; i++) {
			int r1 = ran.nextInt(10);
			acId += r1;
			int r2 = ran.nextInt(10);
			acId += r2;
			int r3 = ran.nextInt(10);
			acId += r3;
			int r4 = ran.nextInt(10);
			acId += r4;
			if(i < 3 - 1) {
				acId += "-";
			}
		}
		System.out.println(id + " : " + acId);
		Account ac = new Account();
		ac.setAccountId(acId);
		ac.setUserId(id);
		ac.setMoney(0);
	
		accountlist.add(ac);
	}
	static public void deposit( ) {
		System.out.println("[입금] id 를 입력하세요. ");
		String id = scan.next();
		System.out.println("[입금] pw 를 입력하세요. ");
		String pw = scan.next();
		if(UserDAO.checkLogin(id, pw)) {
			System.out.println("[입금] 계좌번호를 선택하세요");
			Vector<Account> personalAccount = getPersonalAccount(id);
			for(int i = 0; i < personalAccount.size(); i++) {
				System.out.print("[" + i + "] " + personalAccount.get(i).getAccountId() + " : ");
				System.out.println(personalAccount.get(i).getMoney());
			}
			int sel = scan.nextInt();
			System.out.println("[입금] 금액을 입력하세요.");
			int money = scan.nextInt();
			int depositMoney = personalAccount.get(sel).getMoney();
			personalAccount.get(sel).setMoney(depositMoney + money);
		}
	}
	static public void checkBalance( ) {
		System.out.println("[입금] id 를 입력하세요. ");
		String id = scan.next();
		System.out.println("[입금] pw 를 입력하세요. ");
		String pw = scan.next();
		if(UserDAO.checkLogin(id, pw)) {			
			Vector<Account> personalAccount = getPersonalAccount(id);
			for(int i = 0; i < personalAccount.size(); i++) {
				System.out.print("[" + i + "] " + personalAccount.get(i).getAccountId() + " : ");
				System.out.println(personalAccount.get(i).getMoney());
			}			
		}
	}
} 