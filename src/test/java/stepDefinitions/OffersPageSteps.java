package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Then;
import pageObjects.LandingPageObject;
import pageObjects.OffersPageObject;
import utils.TestContextSetup;

public class OffersPageSteps {
	public WebDriver driver;
	String landingPageProductName;
	String offersPageProductName;
	public TestContextSetup testContextSetup;
	public OffersPageObject offersPageObject;
	public LandingPageObject landingPageObject;
	
	public OffersPageSteps(TestContextSetup testContextSetup)
	{
		this.testContextSetup=testContextSetup;
	}
	
		@Then("^user searched for (.+) shortname in offers page$")
	public void user_searched_for_shortname_in_offers_page(String shortName) throws InterruptedException {
			
	    switchToOffersPage();
	    testContextSetup.commonUtils.switchtoChildWindow();
	    offersPageObject = testContextSetup.pageObjectManager.getOffersPageObject();
	    offersPageObject.enterOffersPageProductNameForSearch(shortName);
	    Thread.sleep(5000);
	    offersPageProductName = offersPageObject.getOffersPageSearchProductResult();

	}
		public void switchToOffersPage()
		{
			landingPageObject= testContextSetup.pageObjectManager.getLandingPageObject();		
			landingPageObject.selectTopDealsLink();
		}

	@Then("validate product name in offers page matches with Landing Page")
	public void validate_product_name_in_offers_page_matches_with_landing_page() {

		Assert.assertEquals(testContextSetup.landingPageProductName, offersPageProductName);
		
	}
}
