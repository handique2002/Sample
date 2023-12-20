package Drivers;

public class remoteWebdriver implements webdriver{

	@Override
	public void findElement() {
		System.out.println("Findelement in remoteWebdriver");
		
	}

	@Override
	public void findElements() {
		System.out.println("Findelements in remoteWebdriver");
		
	}

	@Override
	public void get() {
		System.out.println("Launch browser");
		
	}

	@Override
	public void quit() {
		System.out.println("Quit browser");
		
	}
	
	//remoteWebdriver is a class which has implemented methods
	


}
