package coreJava_001;

import java.util.Scanner;

public class SumOfEven_001 {
	
	

	public static void main(String[] args) 
	{
		//Scanner scan=new Scanner(System.in);
		//System.out.print("Enter number: ");
		//int sum=scan.nextInt();
		//int initial_value=sum;
		//scan.close();
		int sum=0;
		
		for(int i=0;i<=10;i++)
		{
			if(i%2==0)
			{
			sum=sum+i;
			}
		}
		
		System.out.println(sum);
		
		
		
	}

}
