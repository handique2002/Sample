package practice;

public class ReverseWordArray {

	public static void main(String[] args) {
		
		String s1="Java World";
		String[] sa=s1.split(" ");
		//System.out.println(sa);
		System.out.println(sa.length);
		
		System.out.println("***************");
		
		//String[] s0= {"Java","World"};
		String reverseString="";
		
		
		for(String s2:sa)
		{
			//System.out.println(s2);
			String reverseWord="";
			for(int i=s2.length()-1;i>=0;i--)  //Java
			{
				reverseWord=reverseWord+s2.charAt(i); // rw=a; rw=avaJ
				
			}
			
			reverseString=reverseString+reverseWord+" ";
			
		}
		
		System.out.println(reverseString);
		

	}

}
