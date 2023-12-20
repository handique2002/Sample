package coreJava_001;

import java.util.Scanner;

public class PowerOfNumber {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter number: ");
		int num=scan.nextInt();
		int initial_num=num;
		
		System.out.print("Enter power: ");
		int power=scan.nextInt();
		
		scan.close();
		
		/*for(int i=1;i<power;i++)   //
		{
			num=initial_num*num;  // i=1,num=3x3=9,i=2,num=3x9=27, //2^4; num=2,init=2;power=4
			//i=1,1<4,num=2x2=4, i=2,2<4,num=2x4=8; i=3,3<4,num=2x8=16 ; i=4,4<4 false
			
		}
		
		System.out.println("Value is: "+num);*/
		
		int j=1;
		while(j<power)
		{
			j++;
			num=initial_num*num;
			
		}
		
		System.out.println("Value is: "+num);

	}

}
