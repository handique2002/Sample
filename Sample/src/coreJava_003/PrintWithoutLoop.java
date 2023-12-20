package coreJava_003;

public class PrintWithoutLoop {

	public static void main(String[] args) {
	
		//reoccur(1);
		range(1, 10);

	}

	/*public static void reoccur(int num)
	{
		if(num<=10)
		{
			System.out.println(num);
			num++;
			reoccur(num);
		}
	}*/
	
	public static void range(int start_num,int end_num)
	{
		if(start_num<=end_num)
		{
			System.out.println(start_num);
			start_num++;
			range(start_num,end_num);
		}
	}
	
}
