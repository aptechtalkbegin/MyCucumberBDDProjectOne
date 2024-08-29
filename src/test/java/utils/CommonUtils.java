package utils;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class CommonUtils {
	public WebDriver driver;
	public CommonUtils(WebDriver driver)
	{
		this.driver=driver;
	}

	public void switchtoChildWindow()
	{
		Set<String> wh = driver.getWindowHandles();
		Iterator<String> it = wh.iterator();
	    String parentWindow = it.next();
	    String childWindow = it.next();
	   driver.switchTo().window(childWindow);
	}
}
