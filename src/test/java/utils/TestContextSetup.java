package utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

public class TestContextSetup {
	public WebDriver driver;
	public String landingPageProductName;
	public PageObjectManager pageObjectManager;
	public TestBase testBase;
	public CommonUtils commonUtils;
	
	public TestContextSetup() throws IOException
	{
		testBase = new TestBase();
		pageObjectManager = new PageObjectManager(testBase.IntializeWebDriver());
		commonUtils= new CommonUtils(testBase.IntializeWebDriver());
	}
	
}
