package Revise;

import java.util.Scanner;

public class CountDigits {

	public static void main(String[] args) {
		
		//Count number of digits
		
		System.out.print("Enter number: ");
		Scanner scan=new Scanner(System.in);		
		int num=scan.nextInt();
		scan.close();
		
		int count=0;
		
		while(num>0)
		{
			num=num/10;
			count++;
		}
		
		System.out.println("Number of digits is: "+count);
		

	}

}
