package coreJava_002;

import java.util.HashSet;

public class DuplicateInArray {

	public static void main(String[] args) {
		
		int a=2;
		int Integer=24;
		int ab = 100;
		
		System.out.println(Math.floor(3.6));
		
		String[] str= {"Java","C","Python","Java","C"}; 
		
		short x = 10;
        x =  (short) (x * 5);
        System.out.print(x);
		
		//Part 1
		/*for(int i=0;i<str.length;i++)
			for(int j=i+1;j<str.length;j++)
				
			{
				if(str[i].equals(str[j]))
				{
					System.out.println("Duplicate is: "+str[i]);
				}
			}*/
		
		//Part 2
		HashSet<String> part2=new HashSet<String>();
		
		for(String s1:str)
		{
			if(part2.add(s1)==false)
			{
				System.out.println("Duplicate value is: "+s1);
			}
			//System.out.println(s1);
		}

	}

}
