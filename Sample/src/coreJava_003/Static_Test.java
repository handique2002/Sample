package coreJava_003;

public class Static_Test {

	static 
	{
		System.out.println("Test");
	}
	
	public static void display()
	{
		System.out.println("Display"); 
	}
	
	public static void main(String[] args)
	{
		System.out.println("Main method");
		display();
	}
	
}
