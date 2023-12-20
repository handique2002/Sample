package Revise;

public class Fibonnaci {

	public static void main(String[] args) {
		
		//Fibonacci series
		
		int n1=0;
		int n2=1;
		System.out.println(n1+" "+n2);
		
		int sum=0;
		
		for(int i=1;i<=5;i++)
		{
			sum=n1+n2;
			System.out.print(sum+" ");
			n1=n2;
			n2=sum;
			
		}
		
		

	}

}
