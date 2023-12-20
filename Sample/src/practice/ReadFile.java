package practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {
	
	public static void main(String[] args) throws IOException {
	
		//FileReader,FileBuffer
		
		/*FileReader fr=new FileReader("C:\\Users\\pranj\\git\\sample\\Sample\\src\\FileTest\\TextTest.txt");
		//BufferedReader br=new BufferedReader(fr);
		BufferedReader br=new BufferedReader(fr);
		
		String str;
		while((str=br.readLine())!=null)
		{
			System.out.println(str);
		}
		
		br.close();*/
		
		File fl=new File("C:\\Users\\pranj\\git\\sample\\Sample\\src\\FileTest\\TextTest.txt");
		Scanner scan=new Scanner(fl);
		
		while(scan.hasNextLine())
		{
			System.out.println(scan.nextLine());
		}
		
		
		System.out.println("************************");
		
		scan.close();
		
		FileWriter fw=new FileWriter("C:\\Users\\pranj\\git\\sample\\Sample\\src\\FileTest\\TextTest.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		bw.append("Selenium");
		bw.append(" \n");
		bw.append("Test Java");
		bw.append(" \n");
		bw.append("TestNG");
		
		System.out.println("Done writing");
		bw.close();
		
		
		
		
		
	}
	

}
