package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class customer_loginpage {
		
	@FindBy(id="email")
	private WebElement user;
	
	@FindBy(id="pass")
	private WebElement pass;
	
	@FindBy(name="send")
	private WebElement send;
	
	public customer_loginpage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void username(String us)
	{
		user.sendKeys(us);
	}
	public void password(String pwd)
	{
		pass.sendKeys(pwd);
	}
	public void sign()
	{
		send.click();
	}
}
