package javaProgrms;

public class Method001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Method001 a=new Method001();
		a.displayName();
		a.showName();
		String s1=a.showName();
		System.out.println(s1);
		
		visibleName();
		String s4=visibleName1();
		System.out.println(s4);

	}

	public void displayName()
	{
		System.out.println("Pranjal");
	}
	
	public String showName()
	{
		String s="Handique";
		return s;
	}
	
	public static void visibleName()
	{
		System.out.println("Munmi");
	}
	
	public static String visibleName1()
	{
		String s3="Boruah";
		return s3;
		
	}
	
	
}
