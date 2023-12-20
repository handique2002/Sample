package practice;

public class MissingNumberArray {

	public static void main(String[] args) {
		
		int[] a= {1,2,4,5};
		int sum1=0;
		int sum2=0;
		
		
		for(int i=0;i<a.length;i++)
		{
			sum1=sum1+a[i];  //0+2=2,2+
		}
		
		for(int i=1;i<=5;i++)
		{
			sum2=sum2+i;  //0+2=2,2+
		}

		int sum3=sum2-sum1;
		System.out.println(sum3);
		

	}

}
