package K4_스태틱_알고리즘_스택틱사용후_Bank;

import java.util.Scanner;
import java.util.Vector;

public class UserDAO{
	static  private Scanner scan  = new Scanner(System.in);
	static  private Vector<User> userlist = new Vector<User>();
	static  public void dataSetting(String data){
		String token[] = data.split("\n");
		for(int i = 0; i < token.length; i++) {
			User user = new User();
			String token2[] = token[i].split("/");
			user.setId(token2[0]);
			user.setPw(token2[1]);
			user.setName(token2[2]);
			
			userlist.add(user);
		}
	}	
	static public boolean checkId(String id) {
		for(int i =0; i < userlist.size(); i++) {
			if(id.equals(userlist.get(i).getId())) {
				return true;
			}
		}
		
		return false;
	}
	static public boolean checkLogin(String id , String pw) {
		for(int i =0; i < userlist.size(); i++) {
			if(id.equals(userlist.get(i).getId()) && 
					pw.equals(userlist.get(i).getPw())) {
				return true;
			}
		}
		
		return false;
	}
	
	static public void join() {
		System.out.println("[회원가입] id 를 입력하세요. ");
		String id = scan.next();
		if(checkId(id)) {
			System.out.println("중복id 입니다.");
		}else {
			System.out.println("[회원가입] 비밀번호를 입력하세요. ");
			String pw = scan.next();
			System.out.println("[회원가입] 이름을 입력하세요. ");
			String name = scan.next();
			User user =new User();
			user.setId(id);
			user.setPw(pw);
			user.setName(name);
			
			userlist.add(user);
			AccountDAO.openAccount(id);
			System.out.println("회원가입을 축하합니다.");
		}
	}
}