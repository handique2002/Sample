package practice;

public class EvenOddArray {

	public static void main(String[] args) {
		
		int[] num= {7,1,3,4,2};
		
		
		
		for(int i=0;i<num.length;i++)
		{
			if(num[i]%2==0)
			{
				System.out.println(num[i]+" :is an even number");
			}
			
			else if(num[i]%2!=0)
			{
				System.out.println(num[i]+" :is an odd number");
			}
		}
		

	}

}
