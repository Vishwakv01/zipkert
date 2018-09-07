package generic_lib;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Baseclass.basic;

public class synchronization extends basic {
	
	public static void sync()
	{
		WebDriverWait wait=new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@type='text'])[4]")));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@type='text'])[6]")));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("region_id")));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@type='text'])[8]")));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@type='tel'])[1]")));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("btnPostCheck")));
	}
	public static void sync1()
	{
		WebDriverWait wait=new WebDriverWait(driver, 3);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@type='text'])[1]")));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@type='text'])[2]")));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@type='email'])[1]")));
	}
	public static void sync2()
	{
		WebDriverWait wait=new WebDriverWait(driver, 3);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("current_password")));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password")));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("confirmation")));
	}
}
