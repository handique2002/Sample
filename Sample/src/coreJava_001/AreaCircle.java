package coreJava_001;

import java.util.Scanner;

public class AreaCircle {

	public static void main(String[] args) {
		
		double pi=Math.PI;
		System.out.println("Value of PI: "+pi);
		
		System.out.println("*******************");
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter radius: ");
		double radius=scan.nextDouble();
		
		scan.close();
		
		double area_circle=pi*radius*radius;
		System.out.println("Area of circle is: "+area_circle);
		
		
		

	}

}
