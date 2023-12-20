package Revise;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		
		//Sum of digits in number
		
		System.out.print("Enter number: ");
		Scanner scan=new Scanner(System.in);		
		int num=scan.nextInt();
		scan.close();
		
		int sum=0;
		
		while(num>0)
		{
			sum=sum+(num%10);  //0+3=3,12; 3+2=5,1;5+1=6,
			num=num/10;
		}

		System.out.println("Sum of the digits is: "+sum);
		
	}

}
