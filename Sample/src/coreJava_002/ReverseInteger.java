package coreJava_002;

public class ReverseInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=1234;
		System.out.println("Before reverse: "+num);
		
		int rev=0;
		
		while(num!=0)
		{
			rev=rev*10 + num%10;  //rev=0+3=3,12; rev=30+2=32,1; 320+1=321
			num=num/10;
		}
		
		System.out.println("After reverse: "+rev);

	}

}
