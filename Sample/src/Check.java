import java.util.HashMap;
import java.util.Set;

public class Check {

	public static void main(String[] args) {
		
		String str="Chromedriver is the class which is extending remotewebdriver";

		char[] cr1=str.toCharArray();

		HashMap<Character,Integer> hm=new HashMap<Character,Integer>();

		for(Character cr2:cr1)
		{

		if(hm.containsKey(cr2))
			{

			hm.put(cr2, (hm.get(cr2)+1));
			}

		else
			{
		hm.put(cr2,1);
			}
		}
		

		Set<Character> st=hm.keySet();

		for(Character cr3:st)
		{
		if(hm.get(cr3)>1)
			{
				//System.out.println("Char value: "+cr3+" is repeated "+hm.get(cr3)+" times");			
			}
		}
		
		System.out.println(hm);

		}	

}
