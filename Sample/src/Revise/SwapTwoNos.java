package Revise;

public class SwapTwoNos {

	public static void main(String[] args) {
		
		int a=40;
		int b=20;		
		System.out.println("Before swap a is "+a+" and b is "+b);
		
		int temp;
		
		temp=a;
		a=b;
		b=temp;
				
		System.out.println("After  swap a is "+a+" and b is "+b);
		
		System.out.println("");
		System.out.println("*******Approach 2*******");
		System.out.println("");
		
		//Approach 2
		int x=3;
		int y=4;
		System.out.println("Before swap x is "+x+" and y is "+y);
		
		x=x+y;
		y=x-y;
		x=x-y;
		
		System.out.println("After  swap x is "+x+" and y is "+y);		

	}

}
