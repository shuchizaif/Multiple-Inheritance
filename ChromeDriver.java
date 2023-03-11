package multipleInheritance;

public class ChromeDriver implements WebDriver {
	
	public void CreateElement()
	{
		System.out.println("ChromeDriver.....CreateElement");
	}
	
	public void Dispose()
	{
		System.out.println("ChromeDriver...Dispose");
	}

	@Override
	public void findelement() {
		System.out.println("ChromeDriver....findElement");
		
	}

	@Override
	public void findelements() {
		System.out.println("ChromeDriver....findElements");
		
	}

	@Override
	public void getTitle() {
		System.out.println("ChromeDriver....getTitle");
	}

	@Override
	public void quit() {
		System.out.println("ChromeDriver...quit");
		
	}

	@Override
	public void close() {
		System.out.println("ChromeDriver...close");
		
	}

	@Override
	public void getWindowhandle() {
       System.out.println("ChromeDriver...getWindowhandle");		
	}

}
