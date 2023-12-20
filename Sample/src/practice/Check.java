/**
 * 
 */
package practice;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Check {	

	public static void main(String[] args)  {
	
	String input="black black one is two two two";
		String c1[]=input.split(" ");
			
	Map<String, Integer> m=new HashMap<String, Integer>();
	
	for(String c:c1)
	{
		if(m.containsKey(c))
		{
			m.put(c.toLowerCase(), m.get(c)+1);
		}
		else
		{
			m.put(c, 1);
		}
	}
	
	Set<String> sc=m.keySet();
	
	for(String c2: sc)
	{
		if(m.get(c2)>1)
		{
			System.out.println("String "+c2+" is repeated "+m.get(c2)+" times");
		}
	}
	

}	
	
}
