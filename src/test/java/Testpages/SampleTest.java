package Testpages;

import org.openqa.selenium.support.PageFactory;

import org.testng.annotations.Test;

import com.Base.GoogleHomePage;


import SetupConfig.BaseTest;
import SetupConfig.SyncUtil;

public class SampleTest extends BaseTest{

	@Test
	public void GoogleHome()
	{
		
		driver().get("https://www.google.com/");
		
		GoogleHomePage home=PageFactory.initElements(driver(), GoogleHomePage.class);
		
		home.performSearch("Vinod Mete");
		
        SyncUtil.wait(3);
		
		//String expectedURL="https://www.google.com/";
		
		//Assert.assertTrue(home.getURL().startsWith(expectedURL),"Inavlid URL is entered..Please enter correct URL");
		
		
		//Assert.assertEquals(resultpage.getSearchedTextResult(),"Vinod","Incorrect text is typed..Please type correct text");
	}
}
