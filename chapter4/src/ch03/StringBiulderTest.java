package ch03;

public class StringBiulderTest {

	public static void main(String[] args) {
		
		String java = new String("java");
		String android = new String("android");
		
		StringBuilder buffer = new StringBuilder(java);
		System.out.println();
		buffer.append(android);
		
		String test = buffer.toString();
		System.out.println(test);
	}

}
