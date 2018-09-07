package testNG;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class login1 {

	public  WebDriver driver;
	@BeforeMethod
	public void before()
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://courses.edx.org/login");
	}
	@Test
	public void sample() throws InterruptedException
	{
		driver.findElement(By.id("login-email")).sendKeys("vishwav284810@gmail.com");
		driver.findElement(By.id("login-password")).sendKeys("VISHWA@world?4%");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		String t=driver.getTitle();
		String u=driver.getCurrentUrl();
		Reporter.log(t,true);
		Reporter.log(u, true);
		org.testng.Assert.assertEquals(t,"Dashboard | edX");
	}
	@AfterMethod
	public void after()
	{
		driver.quit();
	}
}
