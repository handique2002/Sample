package coreJava_002;

public class SwapIntegers {

	public static void main(String[] args) {
		
		int a=6;
		int b=4;

		//a=a+b=10
		//b=a-b=10-4=6
		//a=a-b=10-6=4
		
		/*a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("a: "+a);
		System.out.println("b: "+b);*/
		
		//a=a*b=6*4=24
		//b=a/b=24/4=6
		//a=a/b=24/6=4
		
		a=a*b;
		b=a/b;
		a=a/b;
		
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		
	}

}
