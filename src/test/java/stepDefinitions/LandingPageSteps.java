package stepDefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageObjects.LandingPageObject;
import utils.TestContextSetup;

public class LandingPageSteps {
	public WebDriver driver;
	String landingPageProductName;
	String offersPageProductName;
	TestContextSetup testContextSetup;
	LandingPageObject landingPageObject;
	
	public LandingPageSteps(TestContextSetup testContextSetup)
	{
		this.testContextSetup=testContextSetup;
	}
	
	
	@Given("User is on GreenCart Landing page")
	public void user_is_on_green_cart_landing_page() {
	
	
	}

	@When("^user searched with Shortname (.+) and extracted actual name of product$")
	public void user_searched_with_shortname_and_extracted_actual_name_of_product(String shortName) throws InterruptedException {

		landingPageObject=testContextSetup.pageObjectManager.getLandingPageObject();
		landingPageObject.enterLandingPageProductNameForSearch(shortName);
		Thread.sleep(5000);
		testContextSetup.landingPageProductName = landingPageObject.getLandingPageSearchProductResult().split("-")[0].trim();
		
	}
	
}
