package SetupConfig;

import org.openqa.selenium.WebDriver;

/**
 * All common codes should goes here
 * @author Vinod
 *
 */

public class BasePage {
	
	private WebDriver driver;
	
	public BasePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	protected WebDriver driver()
	{
		return driver;
	}
	
	public String getURL()
	{
		return driver.getCurrentUrl();
	}

}
