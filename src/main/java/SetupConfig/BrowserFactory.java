package SetupConfig;

import SetupConfig.Constant;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BrowserFactory {
	
	public static WebDriver getInstance()
	{
		WebDriver driver = null;
		
		if(Constant.BROWSER_NAME.toUpperCase() != null)
		{
			System.setProperty("webdriver.chrome.driver", Constant.CHROME_PATH);
			driver=new ChromeDriver();
			driver.manage().window().maximize();
		}
		
		return driver;
		
	}

}
