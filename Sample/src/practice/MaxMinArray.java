package practice;

public class MaxMinArray {

	public static void main(String[] args) {
		
		int[] num= {2,5,7,3};
		
		int max=num[0];
		
		for(int i=1;i<num.length;i++)
		{
			if(num[i]>max)
			{
				max=num[i];
			}
		}
		
		System.out.println("Max number is: "+max);
		
		System.out.println("****************");
		
		int min=num[0];
		for(int i=1;i<num.length;i++)
		{
			if(num[i]<min)
			{
				min=num[i];
			}
		}
		
		System.out.println("Min num is: "+min);

	}

}
