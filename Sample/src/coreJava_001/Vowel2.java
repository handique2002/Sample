package coreJava_001;

import java.util.Scanner;

public class Vowel2 {

	public static void main(String[] args) {

		// aeiou/AEIOU

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter any char: ");
		char s = scan.next().charAt(0);

		switch (s) {
		
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':

		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':

		{
			System.out.println(s + " is vowel");
			break;
		}

		default: {
			System.out.println(s + " is Not vowel");
		}

		}

	}

}
