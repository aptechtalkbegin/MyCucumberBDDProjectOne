package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class TestBase {
	public WebDriver driver;
	public TestContextSetup testContextSetup;
	public Properties prop;
	public FileInputStream fis;

	public TestBase() throws IOException
	{
//		 File file= new File(System.getProperty("user.dir")+"src/test/resource/propertiesFiles/globalProperties.properties");
		File file= new File("C:\\Users\\Priji\\eclipse-workspace\\MyCucumberBDDProjectOne\\src\\test\\resource\\propertiesFiles\\globalProperties.properties");
		 fis = new FileInputStream(file);
		 prop = new Properties();
		 prop.load(fis);
	}
	
    public WebDriver IntializeWebDriver()
    {
    	if(driver==null)
    	{
    		String browserName =prop.getProperty("browser");
    		if(browserName.equalsIgnoreCase("chrome"))
    		{
	            driver = new ChromeDriver();
    		}
    		else if(browserName.equalsIgnoreCase("firefox"))
    		{
    			driver= new FirefoxDriver();
    		}
    		else if(browserName.equalsIgnoreCase("edge"))
    		{
    			driver= new EdgeDriver();
    		}
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	String appURL= prop.getProperty("url");
	driver.get(appURL);
    	}
    	return driver;
    }
  

}
