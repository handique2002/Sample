package coreJava_002;

public class StringManipulation {

	public static void main(String[] args) {
		
		String s=" Hello world! How is it going?"   ;
		
		int length=s.length();
		/*System.out.println(length);
		
		System.out.println(s.charAt(1));

		System.out.println(s.indexOf("e"));
		
		System.out.println(s.indexOf("l"));
		System.out.println(s.indexOf("l",(s.indexOf("l"))+1 ));*/
		
		/*System.out.println(s.lastIndexOf("i"));
		System.out.println(s.lastIndexOf("i", (s.lastIndexOf("i")-1)));
		
		System.out.println(s.indexOf("world"));		
		System.out.println(s.indexOf("test"));*/
		
		System.out.println(s.substring(5));
		System.out.println(s.substring(6, 12));
		
		/*System.out.println(s.trim());
		System.out.println(s.replace(" ", "#"));
		
		String[] s1=s.split(" ");
		for(String st:s1)
		{
			System.out.println(st);
		}*/
		
		
		
	}

}
