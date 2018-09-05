package POM;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic_lib.select_class;
import generic_lib.synchronization;

public class edit_addrespage extends synchronization {

	@FindBy(xpath="(//input[@type='text'])[4]")
	private WebElement street;
	@FindBy(xpath="(//input[@type='text'])[6]")
	private WebElement city;
	@FindBy(name="region_id")
	private WebElement state;
	@FindBy(xpath="(//input[@type='text'])[6]")
	private WebElement pin;
	@FindBy(xpath="(//input[@type='tel'])[1]")
	private WebElement tel;
	@FindBy(xpath="//span[.='Save Address']")
	private WebElement save;
	@FindBy(name="region_id")
	private WebElement ele;
	
	public edit_addrespage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void streettb(String st) throws InterruptedException 
	{
		//synchronization.sync();
		Thread.sleep(3000);
		street.sendKeys(Keys.CONTROL+"a");
		street.sendKeys(Keys.BACK_SPACE);
		street.sendKeys(st);
	}
	public void citytb(String ct) throws InterruptedException 
	{
		//synchronization.sync();
		Thread.sleep(3000);
		city.sendKeys(Keys.CONTROL+"a");
		city.sendKeys(Keys.BACK_SPACE);
		city.sendKeys(ct);
	}
	public void pintb(String a) throws InterruptedException 
	{
		//synchronization.sync();
		Thread.sleep(3000);
		pin.sendKeys(Keys.CONTROL+"a");
		pin.sendKeys(Keys.BACK_SPACE);
		pin.sendKeys(a);
	}
	public void teltb(String b) throws InterruptedException 
 	{
		//synchronization.sync();
		Thread.sleep(3000);
		tel.sendKeys(Keys.CONTROL+"a");
		tel.sendKeys(Keys.BACK_SPACE);
		tel.sendKeys(b);
	}
	public void savebtn()
	{
		save.click();
	}
	public void area(String str)
	{
		select_class.sel(ele, str);
	}
}
