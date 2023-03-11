package multipleInheritance;

public class SafariDriver implements WebDriver {
	
	public void getaddress()
	{
		System.out.println("SafariDriver...getaddress");
	}
	
	public void navigate()
	{
		System.out.println("SafariDriver...navigate");
	}

	@Override
	public void findelement() {
System.out.println("SafariDriver...findelement");		
	}

	@Override
	public void findelements() {
		System.out.println("SafariDriver...findelements");			
	}

	@Override
	public void getTitle() {
		System.out.println("SafariDriver... getTitle");			
	}

	@Override
	public void quit() {
		System.out.println("SafariDriver...quit");			
	}

	@Override
	public void close() {
		System.out.println("SafariDriver...close");			
	}

	@Override
	public void getWindowhandle() {
		System.out.println("SafariDriver...getWindowhandle");			
	}

}
