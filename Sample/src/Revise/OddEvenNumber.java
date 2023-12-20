package Revise;

import java.util.Scanner;

public class OddEvenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("Enter number: ");
		Scanner scan=new Scanner(System.in);		
		int num=scan.nextInt();
		scan.close();
		
		if(num%2==0)
		{
			System.out.println(num+" is even number");
		}
		else if(num%2!=0)
		{
			System.out.println(num+ " is odd number");
		}
		
		
	}

}
