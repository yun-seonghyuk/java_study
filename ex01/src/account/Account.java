package account;

public class Account {
	private String holder;
	private String accountNumber;
	private int balance;
	
	public Account() {
		
	}
	public Account(String holder, String accountNumber, int balance) {
		this.holder = holder;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public void checkBalance() {
		System.out.println("----------------------------------");
		System.out.println("잔액을 조회합니다.");
		System.out.println("잔액 : "+this.balance+"원");
		System.out.println("----------------------------------");
	}
	

	public void deposit(int money) {
		this.balance += money;
		System.out.println("입금이 완료되었습니다.");
		
	}

	public void withdraw(int money) {
		if((this.balance-money)<0) {
			System.out.println("한도 초과");
		}else {
			this.balance -= money;
			System.out.println("정상 출금이 완료되었습니다.");
		}
		
		
	}
}
