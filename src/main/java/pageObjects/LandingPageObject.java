package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPageObject {
	
	public WebDriver driver;
	
	public LandingPageObject(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@type='search']")
	WebElement loc_txt_landingPageSearchBox;

	
	@FindBy(css="h4.product-name")
	WebElement loc_label_landingPageSearchProductResult;
	
	@FindBy(xpath="//a[contains(text(),'Top Deals')]")
	WebElement loc_link_topDeals;
	
	public void enterLandingPageProductNameForSearch(String shortName)
	{
		loc_txt_landingPageSearchBox.sendKeys(shortName);
	}
	
	public String getLandingPageSearchProductResult()
	{
		String landingPageSearchProductResult= loc_label_landingPageSearchProductResult.getText();
		return landingPageSearchProductResult;
	}
	
	public void selectTopDealsLink()
	{
		loc_link_topDeals.click();
	}
}
