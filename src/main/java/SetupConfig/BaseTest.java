package SetupConfig;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
	
	
	//private WebDriver driver;
	
	ThreadLocal<WebDriver>drivermap=new ThreadLocal<WebDriver>();
	
	@BeforeMethod
	public void setup()
	{
		WebDriver driver=BrowserFactory.getInstance();
		drivermap.set(driver);
	}
	
	
	@AfterMethod
	public void cleanUp()
	{
		if(driver()!=null)
		{
			driver().quit();
		}
	}

	protected WebDriver driver()
	{
		return drivermap.get();
				
				
	}
}
