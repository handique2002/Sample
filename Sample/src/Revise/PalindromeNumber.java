package Revise;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		
		//Reverse number
		//Program to check if a number is palindrome
		//A number is palindrome when the value is same on reverse
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the number: ");
		int a=scan.nextInt();
		
		scan.close();
		//int a=121;
		int orig_num=a;
		
		//Find reverse of the number		
		int rev=0;
		
		
		while(a!=0)
		{
			rev=(rev*10)+(a%10);  //0*12=1,12; 10+2=12,1;120+1=121,0
			a=a/10;
					
		}
		
		System.out.println("Reverse of number : "+orig_num+" is "+rev);
		
		if(orig_num==rev)
		{
			System.out.println("Number is palindrome");
		} 
			else if(orig_num!=rev)
			{
			System.out.println("Number is Not palindrome");
			} 
		
		/*do
		{
			rev=(rev*10)+(a%10);
			a=a/10;
		}
			while(a!=0);
		
		System.out.println("Reverse of number : "+orig_num+" is "+rev);
		
		if(orig_num==rev)
		{
			System.out.println("Number is palindrome");
		} 
			else if(orig_num!=rev)
			{
			System.out.println("Number is Not palindrome");
			}*/
		
	}

}
