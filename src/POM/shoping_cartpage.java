package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class shoping_cartpage {

	@FindBy(xpath="//a[.='≪ Continue Shopping ']")
	private WebElement cartbt;
	@FindBy(xpath="(//a[.='Remove Item'])[2]")
	private WebElement remove;
	@FindBy(xpath="//a[.='≪ Continue Shopping']")
	private WebElement shop;
	
	public shoping_cartpage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void cart()
	{
		cartbt.click();
	}
	public void remove()
	{
		remove.click();
	}
	public void shop()
	{
		shop.click();
	}
}