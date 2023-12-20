package Revise;

import java.util.Random;
import java.util.Scanner;

public class LargestOfThree {

	public static void main(String[] args) {
		
		Random rn=new Random();
		System.out.println(rn.nextInt(78));
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter 1st number: ");
		int a=scan.nextInt();	
		System.out.print("Enter 2nd number: ");
		int b=scan.nextInt();
		System.out.print("Enter 3rd number: ");
		int c=scan.nextInt();
		scan.close();
		
		//Largest of 3 numbers
		/*int a=32;
		int b=78;
		int c=657;*/
		
		int largest;
		
		/*if(a>b && a>c)
		{
			System.out.println("1st is largest");
		}
		else if(b>c && b>a) 
		{
			System.out.println("2nd is largest");
		}
		else if(c>a && c>b)
		{
			System.out.println("3rd is largest");
		}*/
		
		int largest1=a>b?a:b;
		int largest2=largest1>c?largest1:c;
		
		System.out.println(largest2);
		
		

	}

}
