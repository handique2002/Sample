package javaProgrms;

public class SingleArray {

	static int b;
	static String s2;
	
	public static void main(String[] args) {
		
		int a;
		//a=20;
		//System.out.println(a);
		
		String s1;
		s1="welcome";
		System.out.println(s1);
		
		System.out.println(b);
		System.out.println(s2);
		System.out.println("///////////");
		
		int c[]=new int[3];
		c[0]=34;
		c[2]=90;
		
		System.out.println(c);
		System.out.println(c[0]);
		System.out.println("///////////");
		
		for(int i=0;i<c.length;i++)
		{
			System.out.println(c[i]);
		}
		
		System.out.println("///////////");
		for(int i:c)
		{
			System.out.println(i);
		}
		
		System.out.println("///////////");
		
		String s3[]=new String[4];
		s3[1]="Pranjal";
		s3[3]="8800131898";
				
		for(String i1:s3)
		{
			System.out.println(i1);
		}
		
		System.out.println("///////////");
		
		Object o1[]=new Object[3];
		o1[0]="NL";
		o1[2]=787001;
		
		for(Object i2:o1)
		{
			System.out.println(i2);
		}
		
		System.out.println("///////////");
		
		int ab[]= {21,87,90,67};
		
		for(int i3:ab)
		{
						
			System.out.println(i3);
			
			if(i3==87)
			{
				break;
			}
			
			//System.out.println("test");
		}
		
	}

}
