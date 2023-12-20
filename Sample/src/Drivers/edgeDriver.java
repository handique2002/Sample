package Drivers;

public class edgeDriver implements webdriver{

	@Override
	public void get() {
		System.out.println("Launch Edge browser");
		
	}

	@Override
	public void quit() {
		System.out.println("Quit Edge browser");
		
	}

	@Override
	public void findElement() {
		System.out.println("Findelement in Edge");
		
	}

	@Override
	public void findElements() {
		System.out.println("Findelements in Edge");
		
	}
	
	

}
