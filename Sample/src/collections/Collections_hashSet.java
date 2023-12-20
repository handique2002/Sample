package collections;

import java.util.HashSet;

public class Collections_hashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> s1=new HashSet<String>();
		
		s1.add("Pranjal");
		s1.add("Handique");
		s1.add("Munmi");
		s1.add("Boruah");
		s1.add("Pranjal");
		
		System.out.println(s1);
		System.out.println(s1.size());
		
		for(String store:s1)
		{
			System.out.println(store);
		}

		/*if(s1.contains("Pranjal1"))
		{
			System.out.println("Contains");
		}
		else
		{
			System.out.println("Do not contains");
		}
		
		HashSet<String> s2=new HashSet<String>();
		s2.add("Pranjal");
		s2.add("Handique");
		s2.add("Munmi");
		boolean status2=s2.add("Boruah");
		boolean status3=s2.add("Pranjal");
		
		
		boolean status1=s1.equals(s2);
		System.out.println("Boolean status1 "+status1);
		System.out.println("Boolean status1 "+status2);
		System.out.println("Boolean status1 "+status3);*/
		
		
		
	}

}
