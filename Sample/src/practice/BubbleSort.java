package practice;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		
		int[] array= {5,1,4,7};
		int n=array.length;
		
		System.out.println(Arrays.toString(array));
		
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-1;j++)
			{
				if(array[j]>array[j+1])
				{
					int temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
					
			}
			
			}	
		}
			
			System.out.println(Arrays.toString(array));

	}

}
