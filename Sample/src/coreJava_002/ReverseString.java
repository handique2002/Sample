package coreJava_002;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
		
		//Part 1: using for loop
		
		String s="Hello";
		int s_length=s.length();
		
		String rev="";
		
		for(int i=s_length-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
						
		}
		
		System.out.println(rev);
		
		//Part 2: using StringBuffer
		
		String s2="World";
		StringBuffer sb=new StringBuffer(s2);
		//StringBuffer s3=sb.reverse();
		//System.out.println(s3);
		System.out.println(sb.reverse());
		
		//Part 3:
		/*Scanner scan=new Scanner(System.in);
		System.out.println("Enter the string: ");
		//String s3=scan.nextLine();
		scan.s
		
		int s_length1=s3.length();
		
		String rev1="";
		
		for(int i=s_length1-1;i>=0;i--)
		{
			rev1=rev1+s.charAt(i);
						
		}
		
		System.out.println(rev1);*/
		

	}

}
