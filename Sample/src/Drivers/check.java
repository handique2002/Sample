package Drivers;

public class check {

	public static void main(String[] args) {
		
		String browser="chrome";  //chrome browser
		webdriver driver; //define webdriver from selenium
				
		if(browser.equalsIgnoreCase("Chrome"))
		{
		driver=new chromeDriver();	
		driver.get();		
		driver.findElement();				
		driver.quit();
		}
		
		else if(browser.equalsIgnoreCase("edge"))
		{
			driver=new edgeDriver();	
			driver.get();		
			driver.findElement();				
			driver.quit();
		}
		
	}

}
