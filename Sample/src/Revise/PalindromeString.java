/**
 * 
 */
package Revise;

import java.util.Scanner;

/**
 * @author pranj
 *
 */
public class PalindromeString {

	public static void main(String[] args) {
		
		//Reverse string
		//Check String is palindrome or not
		
		//String str="java";
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the string: ");
		String str=scan.next();
		
		scan.close();
		
		String orig_str=str;
		
		int length=str.length();
		String rev="";
		
		for(int i=length-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
			
		}
		
		System.out.print("Reverse of the string is: "+rev);
		System.out.println();
		System.out.println("Original string is: "+orig_str);
		
		if(rev.equals(orig_str))
		{
			System.out.println("String is palindrome");
		}
		else if(rev.equals(orig_str))
		{
			System.out.println("String is not a palindrome");
		}
		
		int num1=3;
		
		for(int i=1;i<=num1;i++)
		{
			
		}
		
		
	}

}
