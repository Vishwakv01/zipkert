package Baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.Status;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import generic_lib.Excel;
import generic_lib.constant;
import generic_lib.photo;

public class basic implements constant {
	
	public static WebDriver driver;
	@BeforeMethod
	public void before()
	{
		System.setProperty(key, value);
		driver=new ChromeDriver();
		String url = Excel.zipkar("sheet1", 16,3);
		driver.get(url);
	}
	@AfterMethod
	public void after(ITestResult testphoto)
	{
		String name = testphoto.getName();
		int status = testphoto.getStatus();
		if(status == 2)
		{
			photo.getphoto(driver, "path", name);
		}
		driver.quit();
	}

}