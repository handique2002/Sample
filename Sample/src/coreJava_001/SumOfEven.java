package coreJava_001;

public class SumOfEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum=0;
		
		
		for(int i=0;i<=10;i++)
		{
			if(i%2==0)
			{
			sum=sum+i;
			}
		}
		
		System.out.println(sum);

	}

}
