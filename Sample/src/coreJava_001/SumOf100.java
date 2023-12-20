package coreJava_001;

import java.util.Scanner;

public class SumOf100 {

	public static void main(String[] args) {
		
		int sum=0;
		
		for(int i=1;i<=10;i++)
		{
			sum=i+sum;
		}
		
		System.out.println(sum);
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num=scan.nextInt();
		num=0;
		scan.close();
		
		for(int i=1;i<=10;i++)
		{
			num=i+num;
		}
		
		System.out.println(num);
		
	}

}
