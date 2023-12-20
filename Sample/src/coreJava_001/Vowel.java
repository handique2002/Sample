package coreJava_001;

import java.util.Scanner;

public class Vowel {

	public static void main(String[] args) {

		// aeiou/AEIOU

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter any char: ");
		char s = scan.next().charAt(0);
		scan.close();
		
		boolean isVowel=false;
		
		if((s=='a' || s=='e' || s=='i' || s=='o' || s=='u')||
		   (s=='A' || s=='E' || s=='I' || s=='O' || s=='U'))

		{
			//System.out.println(s + " is vowel");
			isVowel=true;
			
		}

		else {
			//System.out.println(s + " is Not vowel");
			isVowel=false;
		}

		if(isVowel)
		{
			System.out.println(s + " is vowel");
		}
		else
		{
			System.out.println(s + " is Not vowel");
		}
		
		}

	

}
