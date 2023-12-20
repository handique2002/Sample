package coreJava_002;

import java.util.Arrays;

public class LargestSmallestNumber {

	public static void main(String[] args) {
		
		int[] a= {2,8,-7,9,-8};
		
		int largest=a[0];  //2
		int smallest=a[0]; //2
			
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>largest)  //8>2, true ; -7>8, false; 9>8, true; -8>9, false
			{
				largest=a[i];  // 8, 9
			}
			else if(a[i]<smallest)	//-7<2, true; -8<-7,true
			{
				smallest=a[i];   //-7, -8
			}
		}
		
		System.out.println("Largest is: "+largest);
		System.out.println("Smallest is: "+smallest);
		
	}

}
