package javaProgrms;

public class StringFunctions {

	public static void main(String[] args) {
	
		/*String s1="Welcome";
		String s2="Java";
		String s3="welcome";
		
		
		boolean status1=s1.equals(s3);
		System.out.println(status1);
		
		boolean status2=s1.equalsIgnoreCase(s3);
		System.out.println(status2);*/
		
		String str4=new String();
		str4="PH";
		
		String str5="PH";
		String str6=new String("PH");
		
		System.out.println(str4);
		System.out.println(str5);
		
		System.out.println(str4==str5);
		System.out.println(str4==str6);
		
		String str7="Pranjal";
		str7.concat("Handique");
		
		System.out.println(str7);
		
		String str8="Munmi";
		String str9=str8.concat(" Boruah");
		System.out.println(str9);
		
		String str10=str9;
		System.out.println(str9);
		
		int ab=2;
		System.out.println(ab);
		
		int ac=3;
		ab=ac;
		
		str8=str7;
		System.out.println(str7);
		
		System.out.println(ab);
		
		
		String result=(ab>ac) ? "ab > ac" : "ab<ac";
		System.out.println(result);
		
		
		
		
		
		
		
		
		
			
		

	}

}
