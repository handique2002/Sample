package coreJava_001;

import java.util.Scanner;

public class Multiplication_table {

	public static void main(String[] args) {
		
		System.out.println(5*1);
		System.out.println(5*2);
		System.out.println(5*3);
		System.out.println(5*4);
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n=scan.nextInt();
		
		/*for(int i=1;i<=10;i++)
		{
			System.out.println(n+"x"+i+"="+(n*i));
		}
		
		System.out.println("******************************");
		
		int j=1;
		while(j<=10)
		{
			
			System.out.println(n+"x"+j+"="+(n*j));
			j++;
		}*/
		
		
		
		System.out.println("******************************");
		int k=1;
		do
		{
			
			System.out.println(n+"x"+k+"="+(n*k));
			k++;
			
		}
		while(k<=10);
		
		scan.close();

	}

}
