package practice;

public class SearchElementArray {

	public static void main(String[] args) {
		
		int[] array= {4,34,6,8,9,2};
		
		int search_num=34;
		boolean flag=false;
		
		for(int i=0;i<array.length;i++)
		{
			System.out.println(array[i]);
			if(array[i]==search_num)
			{
				System.out.println("Element found at position: "+(i+1));
				flag=true;
				break;
			}
		}	
			
			if(flag==false)
			{
				System.out.println("Element not found");
			}
		
		}
		
		//System.out.println("Element found at position: "+i);
		

	

}
