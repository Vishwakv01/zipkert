package Baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import junit.framework.Assert;

public class basepage {

	public void Elementpresent(WebElement element,WebDriver driver)
	{
		try 
		{
			WebDriverWait w=new WebDriverWait(driver, 5)
					w.until(ExpectedConditions.visibilityOf(element));
			Reporter.log(s, logToStandardOut);
		}
		catch(Exception e)
		{
			Reporter.log("element not present", this);
			Assert.fail();
		}
	}
}
