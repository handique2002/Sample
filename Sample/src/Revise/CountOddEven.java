package Revise;

import java.util.Scanner;

public class CountOddEven {

	public static void main(String[] args) {
		
		System.out.print("Enter number: ");
		Scanner scan=new Scanner(System.in);		
		int num=scan.nextInt();
		scan.close();
		
		int even_count=0;
		int odd_count=0;
		
		while(num>0)
		{
			int rem=num%10;
			
			if(rem%2==0)
			{
				even_count++;
			}
			else if(rem%2!=0)
			{
				odd_count++;
			}
			
			num=num/10;
			
		}
		
		System.out.println("Even count of digits "+even_count);
		System.out.println("Odd  count of digits "+odd_count);
		

	}

}
