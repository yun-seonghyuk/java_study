package board;

public class Board2 {
	String title;
	String writer;
	String content;
	String password;
	private static int serialNum = 0;
	private int boardNum;
	
	public int getBoardNum() {
		return boardNum;
	}
	public void setBoardNum(int getBoardNum) {
		this.boardNum = getBoardNum;
	}
	public Board2(String title, String writer, String content,String password) {
		serialNum++;
		boardNum = serialNum;
		this.title = title;
		this.writer = writer;
		this.content = content;
		this.password = password;
	}
	
	
	public void prt() {
		System.out.println("제목 : "+this.title);
		System.out.println("작성자 : "+this.writer);
		System.out.println("글내용");
		System.out.println(this.content);
		System.out.println("게시글번호 : "+getBoardNum());
	}
	public void prt2() {
		System.out.print("제목 : "+this.title+" ");
		System.out.println("게시글번호 : "+getBoardNum());
		
	}
	
	
}
