package com.Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import SetupConfig.BasePage;

public class GoogleSearchResultPage extends BasePage {
	
	public GoogleSearchResultPage(WebDriver driver) {
		super(driver);
		
	}


	@FindBy(css="div#resultStats")
	WebElement Searchtextresult;
	
	@FindBy(css="input.gsfi[name='q']")
	WebElement searchtextbox;
	
	
	public String getSearchedTextResult()
	{
		return searchtextbox.getAttribute("value");
	}

}
