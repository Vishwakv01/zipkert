package testNG;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class login {

	public  WebDriver driver;
	@BeforeMethod
	public void before()
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://courses.edx.org/login");
	}
	@Test
	public void sample()
	{
		driver.findElement(By.id("login-email")).sendKeys("vishwav284810@gmail.com");
		driver.findElement(By.id("login-password")).sendKeys("VISHWA@world?4%");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		String t=driver.getTitle();
		String u=driver.getCurrentUrl();
		Reporter.log(t,true);
		Reporter.log(u, true);
	}
	@AfterMethod
	public void after()
	{
		driver.quit();
	}
}
