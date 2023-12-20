package practice;

public class CharOccurence {

	public static void main(String[] args) {
		
		String s1="Java is a lang";		
		
		System.out.println(s1);
		int TotalLength=s1.length();
		System.out.println(TotalLength);
		System.out.println("*************");
		
		s1=s1.replace("a","");
		System.out.println(s1);
		int AfterLength=s1.length();
		System.out.println(AfterLength);
		System.out.println("*************");
		
		int diff=TotalLength-AfterLength;
		System.out.println("Count of 'a' character is: "+diff);
		

	}

}
