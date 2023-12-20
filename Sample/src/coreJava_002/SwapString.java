package coreJava_002;

public class SwapString {

	public static void main(String[] args) {
		
		String a="Hello";
		String b="World" ;

		String s1="Nowis the";
		System.out.println(s1.substring(1));
		System.out.println(s1.substring(1, 4));
		
		
		a=a+b;
		System.out.println(a);
		
		a.length();
		b=a.substring(0, (a.length()-b.length()));
		System.out.println("b value is: "+b);
		
		a=a.substring(b.length());
		
		System.out.println("a value is: "+a);
		
		
		
	}

}
