package coreJava_001;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Leap year should be divisible by 4
		//Leap year should be divisible by 4 and not divisible by 100
		//Leap year should be divisible by 4 and 100
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the year: ");
		int year=scan.nextInt();
		
		scan.close();
		
		boolean leap_year=false;
		
		if(year%4==0)
		{
			// if the year is century
			if(year%100==0)
			{
				if(year%400==0)
				{
					leap_year=true;
				}
				else
				{
					leap_year=false;
				}
				
			}
			
			// if the year is Not century
			else
			{
				leap_year=true;
			}
		}
		
		else
		{
			leap_year=false;
		}
			
		
		
		if(leap_year)
		{
			System.out.println("Leap Year");
		}
		
		else
		{
			System.out.println("Not a Leap Year");
		}

	}

}
