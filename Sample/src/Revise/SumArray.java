package Revise;

import java.util.Arrays;

public class SumArray {

	public static void main(String[] args) {
		
		//Sum of array elements
		int[] a= {10,11,12};
		
		int length=a.length;
		
		int sum=0;
		
		for(int i=0;i<length;i++)
		{
			sum=sum+a[i];
		}
		
		System.out.println("Sum of the digits is: "+sum);

	}
	
	
	
	

}
