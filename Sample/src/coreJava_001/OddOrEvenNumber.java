/**
 * 
 */
package coreJava_001;

import java.util.Scanner;

/**
 * @author pranj
 *
 */
public class OddOrEvenNumber {

		public static void main(String[] args) {
		
			Scanner scan=new Scanner(System.in);
			
			System.out.print("Enter a number: ");
			int a=scan.nextInt();
			
			if(a%2==0)
			{
				System.out.println("Entered number is a even number");
			}
			else
			{
				System.out.println("Entered number is a odd number");
			}
			scan.close();

	}

}
