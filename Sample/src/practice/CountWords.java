package practice;

public class CountWords {

	public static void main(String[] args) {
		
		String s0="Test Java";
		
		char c0=s0.charAt(0);
		System.out.println(c0);
		System.out.println(s0.length());
		
		int count=1;
		
		for(int i=0;i<s0.length();i++)
		{
			if((s0.charAt(i)==' ') && (s0.charAt(i+1)!=' '))
			{
				count++;
			}
			
		}
		
		System.out.println("Count of words: "+count);
		

	}

}
