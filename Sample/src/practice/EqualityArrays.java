package practice;

import java.util.Arrays;

public class EqualityArrays {

	public static void main(String[] args) {
		
		int[] num1= {1,2,3};
		int[] num2= {1,2,3};
		
		/*System.out.println(num1.equals(num2));
		
		System.out.println(Arrays.equals(num1, num2));
		Arrays.sort(num2);
		
		System.out.println(Arrays.toString(num2));*/
		
		int length1=num1.length;
		int length2=num2.length;
		
		boolean flag=true;
				
		if(length1==length2)
			{
			for(int i=0;i<length1;i++)
				{
					if(num1[i]!=num2[i])
					{
						flag=false;
				}
					}
			}	
				
			
			else
			{
				flag=false;
			}	
				
		if(flag==true)	
		{
			System.out.println("Arrays are equal");
		}
		else 
		{
			
				System.out.println("Arrays are NOT equal");
			
		}
		
		
	}
		

	

}
