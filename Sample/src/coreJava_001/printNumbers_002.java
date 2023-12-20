/**
 * 
 */
package coreJava_001;

import java.util.Scanner;

/**
 * @author pranj
 *
 */
public class printNumbers_002 {

	public static void main(String[] args) {
		
		//Enter 2 numbers from user and print sum of it
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter 1st number: ");
		int a=scan.nextInt();
		System.out.println("Entered 1st number is: "+a);
		
		System.out.print("Enter 2nd number: ");
		int b=scan.nextInt();
		System.out.println("Entered 2nd number is: "+b);
		
		System.out.println("Sum of both the numbers is: "+(a+b));
		
		scan.close();  
		// to avoid memory leak, A Memory Leak is a situation where there are objects present in the heap
		//that are no longer used, but the garbage collector is unable to remove them from memory, and therefore, 
		//they're unnecessarily maintained. 
		//A memory leak is bad because it blocks memory resources and degrades system performance over time
		
	}

}
