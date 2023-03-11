package multipleInheritance;

public class Demomain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		WebDriver driver1 = new FirefoxDriver();
		WebDriver driver2 = new SafariDriver();
		driver.findelements();
		driver1.findelements();
		driver2.findelements();
		

	}

}
