package collections;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;

public class Collections_hashMap {

	public static void main(String[] args) {
		
		HashMap<String,Integer> h1=new HashMap<String,Integer>();
		h1.put("qa", 2);
		h1.put("uat", 1);
		h1.put("prod", 1);
		h1.put("cvt", 1);
		h1.put("uat", 1);
		
		System.out.println(h1);
		System.out.println(h1.size());
		
		System.out.println((h1.containsKey("qa")));
		System.out.println((h1.containsKey("qa1")));
		
		System.out.println(h1.get("qa")+1);
		
		System.out.println("************");
		
		/*h1.clear();
		System.out.println(h1);
		System.out.println(h1.size());*/
		
		/*		
		for(String s2:h1.keySet())
		{
			String s3=h1.get(s2);
			System.out.println(s3);
						
		}*/
		
		
		
		
		
		
	
		
		
	}

}
