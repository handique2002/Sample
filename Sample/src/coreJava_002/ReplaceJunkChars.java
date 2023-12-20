package coreJava_002;

public class ReplaceJunkChars {

	public static void main(String[] args) {
		
		
		String s1="%$# Hello *&World ()&^";
		
		s1=s1.replaceAll("[^a-zA-Z0-9]", " ");
		System.out.println(s1);
		
		String s2="Java World";
		s2=s2.replace("v", "i");
		System.out.println(s2);
		
	

	}

}
