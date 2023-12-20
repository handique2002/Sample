package coreJava_001;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter digits: ");
		int num=scan.nextInt();
		int sum=0;
		
		//612
		//3,3,2//2,3+2=5,
		
		while(num!=0)
		{
			int reminder=num%10;
			sum=sum+reminder;  //0+3=3,3+2=5,5+1=6,
			num=num/10;
						
		}
		
		System.out.println(sum);

	}

}
