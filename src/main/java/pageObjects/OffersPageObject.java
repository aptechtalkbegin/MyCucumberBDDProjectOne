package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OffersPageObject {
	
	public WebDriver driver;
	
	public OffersPageObject(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	

	
	@FindBy(xpath="//input[@id='search-field']")
	WebElement loc_txt_offersPageSearchBox;
	
	@FindBy(css="tr td:nth-child(1)")
	WebElement loc_label_offersPageSearchProductResult;
	
	
	
	
	public void enterOffersPageProductNameForSearch(String shortName)
	{
		loc_txt_offersPageSearchBox.sendKeys(shortName);
	}

	public String getOffersPageSearchProductResult()
	{
		String offersPageSearchProductResult= loc_label_offersPageSearchProductResult.getText();
		return offersPageSearchProductResult;
	}
}
