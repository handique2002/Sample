package javaProgrms;

public class array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a=new int[3];
		a[0]=24;
		a[1]=45;
		a[2]=76;
		//a[3]=45;
		
		//System.out.println(a[5]);
		int ab=a.length;
		System.out.println(ab);
		
		/*for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}*/
		
		int i=0;
		while(i<ab)
		{
			System.out.println(a[i]);
			i++;
		}
		
		/*int[] c= {2,7,8,12};
		int ac=c.length;
		System.out.println(ac);
		*/
		
	}

}
