package Revise;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		
		
		
		Scanner scan=new Scanner(System.in);	
		System.out.print("Enter number: ");
		int num=scan.nextInt();
		scan.close();
		
		int factorial=1;  // 4!= 1*2*3*4=24
		
		for(int i=1;i<=num;i++)
		{
			factorial=factorial*i;
		}
		
		System.out.println("Factorial of "+num+" is "+factorial);

	}

}
