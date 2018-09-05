package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class my_accountpage {

	@FindBy(xpath="(//a[.='Edit Address'])[1]")
	private WebElement edit;
	@FindBy(xpath="//div[@class='bag_cart']")
	private WebElement cart;
	@FindBy(xpath="(//a[.='Edit'])[1]")
	private WebElement edit1;
	
	public my_accountpage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void editpage()
	{
		edit.click();
	}
	public void cartbt()
	{
		cart.click();
	}
	public void edit1()
	{
		edit1.click();
	}
}
