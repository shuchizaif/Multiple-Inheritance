package multipleInheritance;

public class FirefoxDriver implements WebDriver {
	
	
	
	public void getContext()
	{
		System.out.println("Firefoxdriver....getContext");
	}
	public void getFullPageScreenshotAs()
	{
		System.out.println("FirefoxDriver....getFullPageScreenshotAs");
	}
	@Override
	public void findelement() {
		System.out.println("FirefoxDriver....findElement");
	}
	@Override
	public void findelements() {
		System.out.println("FirefoxDriver....findElements");		
	}
	@Override
	public void getTitle() {
		System.out.println("FirefoxDriver....getTitle");		
	}
	@Override
	public void quit() {
		System.out.println("FirefoxDriver....quit");			
	}
	@Override
	public void close() {
		System.out.println("FirefoxDriver....close");
		
	}
	@Override
	public void getWindowhandle() {
		System.out.println("FirefoxDriver....getWindowhandle");		
	}


}
