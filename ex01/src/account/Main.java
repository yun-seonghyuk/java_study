package account;


public class Main {
	static Account[] accounts = new Account[100];
	static int count = 0;
	public static void main(String[] args) {
		Controller con = new Controller();
		con.init();
		con.run();
	}
}
