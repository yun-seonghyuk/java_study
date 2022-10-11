package I2_클래스배열매소드2_프로젝트1_멤버1;
import java.util.Scanner;
public class MemberDAO {
	Scanner scan;
	int max;
	Member[] memberList;
	int memberCount;
	
	void init(int size) {
		scan = new Scanner(System.in);
		max = size;
		memberList = new Member[max];
		memberCount = 0;
	}
	
	void printMemberList() {
		for(int i = 0; i < memberCount; i++) {
			memberList[i].printMember();
		}
	}
	void join() {
		System.out.println("아이디 입력 : ");
		String id = scan.next();
		
		boolean result = false;		
		for(int i = 0; i < memberCount; i++) {
			if(memberList[i].id.equals(id)) {
				result =  true;
			}
		}	
		
		if(result == true) {
			System.out.println("아이디 중복");
		}else {
			System.out.println("비밀번호 입력 : ");
			String pw = scan.next();
			System.out.println("이름 입력 : ");
			String name = scan.next();
			Member member = new Member();
			member.id = id;
			member.pw = pw;
			member.name = name;
			memberList[memberCount] = member;
			memberCount += 1;
			System.out.println("회원가입을 축하합니다.");
		}
	}
	void delete() {
		System.out.println("삭제할 아이디입력 : ");
		String id = scan.next();
		
		boolean result = false;		
		for(int i = 0; i < memberCount; i++) {
			if(memberList[i].id.equals(id)) {
				result =  true;
			}
		}	
		
		if(result == false) {
			System.out.println("삭제할 아이디가 다릅니다");
		}else {
			
			int index = 0;
			for(int i = 0; i < memberCount; i++) {
				if(memberList[i].id.equals(id)) {
					index = i;
					
				}
			}
						
			for(int i = index; i < memberCount - 1 ; i++) {
				memberList[i] = memberList[i + 1];
			}
			memberCount -= 1;
			
			System.out.println("삭제가완료 되었습니다.");
		}
	}
	void update() {
		System.out.println("아이디 입력 : ");
		String id = scan.next();
		System.out.println("비밀번호 입력 :  ");
		String pw = scan.next();
		
		
		boolean result = false;
		
		for(int i = 0; i < memberCount; i++) {
			if(memberList[i].id.equals(id) &&
					memberList[i].pw.equals(pw)) {
				result =  true;
			}
		}		
		
		if(result == false) {
			System.out.println("아이디랑 비밀번호가 일치하지 않습니다");
		}else {
			
			
			System.out.println("수정할 아이디 입력 : ");
			String name = scan.next();
			
			Member member = null;
			for(int i = 0; i < memberCount; i++) {
				if(memberList[i].id.equals(id)) {
					member = memberList[i];
					break;
				}
			}
			
			if(member != null) {
				member.name = name;
				System.out.println("수정완료");
			}
			else {
				System.out.println("수정이 불가합니다");
			}
		}
	}
	void printAll() {
		printMemberList();
	}
	
}
