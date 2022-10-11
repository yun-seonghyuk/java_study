package ex01;

public class Student {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	
	public Student(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	public int getTotal() {
		int total = this.kor + this.eng + this.math;
		return total;
	}
	public float getAvg() {
		float avg = (float) (getTotal()/3.0);
		return avg;
	}
	public void info() {
		System.out.println("이름 : "+this.name);
		System.out.println("반 : "+this.ban);
		System.out.println("번호 : "+this.no);
		System.out.println("국어점수 : "+this.kor);
		System.out.println("영어점수 : "+this.eng);
		System.out.println("수학점수 : "+this.math);
		System.out.println("총점 : "+getTotal());
		System.out.println("평균 : "+getAvg());
	}
}
