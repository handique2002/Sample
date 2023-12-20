package practice;

public class JunkReplace_SpaceReplace {

	public static void main(String[] args) {
		
		
		String s1="Java World Test Selenium";
		System.out.println(s1.replaceAll(" ", ""));
		
		String s2="Java&^@!World&^ Test *&%";
		System.out.println(s2.replaceAll("[^a-zA-Z0-9]", " "));

	}

}
