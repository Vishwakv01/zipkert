package POM;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic_lib.synchronization;

public class watch_page {

	@FindBy(xpath="//button[@title='Add To Cart']")
	private WebElement add;
	@FindBy(id="btnchngzip")
	private WebElement change;
	@FindBy(id="strPinCode")
	private WebElement text;
	@FindBy(id="btnPostCheck")
	private WebElement post;
	@FindBy(xpath="//button[@title='Buy Now']")
	private WebElement buy;
	
	public watch_page(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void cartbt1()
	{
		add.click();
	}
	public void change()
	{
		change.click();
	}
	public void text(String s) throws InterruptedException 
	{
		//synchronization.sync();
		Thread.sleep(3000);
		text.sendKeys(Keys.CONTROL+"a");
		text.sendKeys(Keys.BACK_SPACE);
		text.sendKeys(s);
	}
	public void post()
	{
		post.click();
	}
	public void buy()
	{
		buy.click();
	}
}
