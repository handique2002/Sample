package coreJava_003;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Break {
	
	 public static void main(String[] args) {
		
		Collection sl=new HashSet();
		sl.add(21);
		sl.add("Pranjal");
		sl.add("Handique");
		sl.add(3);
		sl.add("Munmi");
		
		HashSet s2=new HashSet();
		s2.add(3);
		s2.add("Pranjal");
		s2.add("Handique");
		s2.add(3);
		s2.add("Munmi");
		
		System.out.println(sl);
		
		System.out.println(sl.contains(s2));
		
		for(Object obj:sl) 
		{
			System.out.println(obj);
		}
			
		for(int i=0;i<sl.size();i++)
		{
			
		}
		
		System.out.println("*************");
		
		ArrayList al=new ArrayList();
		al.add(3);
		al.add("Pranjal");
		al.add("Handique");
		al.add(3);
		al.add("Munmi");
		
		System.out.println(al);
		
		System.out.println("*************");
		
		HashMap hm=new HashMap();
		hm.put("Name", "Pranjal");
		hm.put(2, 4);
		hm.put("Name", "Handique");
		hm.put("Surname", "Pranjal");
		hm.put("Name", "Java");
		
		System.out.println(hm);
		
		System.out.println("*************");
		
		Set s1=hm.keySet();
		
		System.out.println(s1);
		
		System.out.println("*************");
		for(Object obj2:s1)
		{
			System.out .println(obj2);
		}
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		 
		 
		 
		 
		 
		 

	}

}
