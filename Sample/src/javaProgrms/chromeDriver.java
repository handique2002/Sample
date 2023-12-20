package javaProgrms;

public class chromeDriver implements webdriver{

	@Override
	public void get() {
		System.out.println("Launch Chrome browser");
		
	}

	@Override
	public void quit() {
		System.out.println("Quit Chrome browser");
		
	}

	@Override
	public void findElement() {
		System.out.println("Findelement in Chrome");
		
	}
	
	

}
