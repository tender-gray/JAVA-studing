package ch03;

public class StringBuilderTest {

	public static void main(String[] args) {

		String java = new String("java");
		String android = new String("android");
		
		StringBuilder a = new StringBuilder(java);
		System.out.println(System.identityHashCode(a));
		
		a.append(android);
		System.out.println(System.identityHashCode(a));
		
		String test = a.toString();
		System.out.println(test);
		
		
		
	}

}
