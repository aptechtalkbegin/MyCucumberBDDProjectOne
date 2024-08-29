package stepDefinitions;

import io.cucumber.java.After;
import utils.TestContextSetup;

public class MyHooks {

	public TestContextSetup testContextSetup;
	
	public MyHooks(TestContextSetup testContextSetup)
	{
		this.testContextSetup=testContextSetup;
	}
	
	@After
	public void tearDown()
	{
		testContextSetup.testBase.IntializeWebDriver().quit();
	}
}
