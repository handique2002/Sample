package Revise;

import java.util.Random;
import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
				
		//prime no- >0 , num/i==0, counter =1
		
		int num=4;
		int counter=0;
		
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				counter++;
				//continue;
			}			
		}
		
		System.out.println("Counter is: "+counter);
		
		if(counter==2)
		{
			System.out.println(num+" is a Prime number");
		} else if(counter>2)
		{
			System.out.println(num+" is Not a Prime number");
		}
			
		
		
	
		
	}
}
