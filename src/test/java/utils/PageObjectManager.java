package utils;

import org.openqa.selenium.WebDriver;

import pageObjects.LandingPageObject;
import pageObjects.OffersPageObject;

public class PageObjectManager {
	LandingPageObject landingPageObject;
	OffersPageObject offersPageObject;
	public WebDriver driver;
	
	public PageObjectManager(WebDriver driver)
	{
		this.driver=driver;
		
	}
	
	public LandingPageObject getLandingPageObject()
	{
		landingPageObject = new LandingPageObject(driver);
		return landingPageObject;
	}

	public OffersPageObject getOffersPageObject()
	{
		offersPageObject = new OffersPageObject(driver);
		return offersPageObject;
	}
}
