package collections;

import java.util.ArrayList;

public class Collections_arrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList al=new ArrayList<>();
		
		al.add(29);
		al.add("Test");
		al.add("%#");
		al.add(29);
		al.add("Test");
		
		/*int size=al.size();
		
		System.out.println(al);
		System.out.println(size);
		
		al.remove(1);
		int size1=al.size();
		System.out.println(size1);
		System.out.println(al);
		
		System.out.println(al.get(1));
		for(int i=0;i<al.size();i++)
		{
			
			System.out.println("for loop print: "+al.get(i));
		}*/
		
		for(Object a:al)
		{
			System.out.println("enhanced for loop: "+a);
			
		}
		
		

	}

}
