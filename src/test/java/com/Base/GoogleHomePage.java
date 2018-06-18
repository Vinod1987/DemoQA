package com.Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import SetupConfig.BasePage;

public class GoogleHomePage extends BasePage{
	
	public GoogleHomePage(WebDriver driver) {
		super(driver);
		
	}


	@FindBy(name="q")
	WebElement textToQury;
	
	
	public void performSearch(String query)
	{
		textToQury.sendKeys(query);
		textToQury.submit();
		
		//return PageFactory.initElements(driver(),GoogleSearchResultPage.class);
	}

}
