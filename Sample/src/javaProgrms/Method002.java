package javaProgrms;

public class Method002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Method002 a=new Method002();
		a.show("Display");
		String s3=a.show1("Pranjal");
		System.out.println(s3);
		
		Method002 b=new Method002();
		b.show("Circus");
		String s4=a.show1("Handique");
		System.out.println(s4);
		
	}

	public void show(String s1)
	{
		System.out.println(s1);
	}
	
	public String show1(String s2)
	{
		return s2;
	}
	
}
