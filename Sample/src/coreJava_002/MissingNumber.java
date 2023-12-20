package coreJava_002;

public class MissingNumber {

	public static void main(String[] args) {
		
		int sum=0;
		for(int i=1;i<=6;i++)
		{
			sum=sum+i;
		}
		
		System.out.println(sum);
		
		int a[]= {1,2,4,5,6};
		//System.out.println("1st value: "+a[0]);
		//WSystem.out.println("1st value: "+a[4]);
		
		int sum1=0;
		int size=a.length;
		
		System.out.println("Size of array is: "+size);
		System.out.println("*******************");
		
		for(int i=0;i<size;i++)
		{
			sum1=sum1+a[i];
			
		}
		
		System.out.println(sum1);
		
		System.out.println("Missing number is: "+(sum-sum1));
		
		
	}

}
