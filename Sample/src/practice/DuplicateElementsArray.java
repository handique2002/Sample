package practice;

import java.util.HashSet;

public class DuplicateElementsArray {

	public static void main(String[] args) {
		
		String[] s1= {"Java","C","PHP","Selenium","PHP","Java"};
		
		HashSet<String> hs=new HashSet<String>();
		boolean status=false;
		
		for(String s_obj:s1)
		{
			if(hs.add(s_obj)==false)
			{
				status=false;
				System.out.println("Duplicate element is: "+s_obj);
				
			}
			
			else
			{
				status=true;
			}
			
			
	
		}
		
		if(status==true)
		{
			System.out.println("No duplicate");
		}
		

	}

}
