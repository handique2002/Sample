package coreJava_001;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PrintDuplicateChars {

	public static void main(String[] args) {
		
		String s1="java programming";
		char[] c1=s1.toCharArray();
		int length=c1.length;
		System.out.println(length);
		
		HashMap<Character, Integer> m=new HashMap<Character, Integer>();
		
		for(Character c:c1)
		{
			if(m.containsKey(c))
			{
				m.put(c, m.get(c)+1);
			}
			else
			{
				m.put(c, 1);
			}
		}
		
		Set<Character> sc=m.keySet();
		
		for(Character c2: sc)
		{
			if(m.get(c2)>1)
			{
				System.out.println("Character "+c2+" is repeated "+m.get(c2)+" times");
			}
		}
		
	}

}
