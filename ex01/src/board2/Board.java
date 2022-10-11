package board2;

public class Board {
	private String title;
	private String writer;
	private String content;
	private static int serialNum = 0;
	private int boardNum;
	
	public int getBoardNum() {
		return boardNum;
	}
	public void setBoardNum(int getBoardNum) {
		this.boardNum = getBoardNum;
	}
	public Board() {
		
	}
	public Board(String title, String writer, String content) {
		serialNum++;
		boardNum = serialNum;
		this.title = title;
		this.writer = writer;
		this.content = content;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public void prt() {
		System.out.println("============================");
		System.out.println("제목 : "+this.title);
		System.out.println("작성자 : "+this.writer);
		System.out.println("글내용");
		System.out.println(this.content);
		System.out.println("게시글번호 : "+getBoardNum());
	}
}
