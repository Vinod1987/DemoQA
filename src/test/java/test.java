import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import SetupConfig.Constant;

public class test {

	@Test
	public void test1()
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Drivers\\Latest Chrome Driver\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
	}
	
}
