package POM;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic_lib.synchronization;

public class account_informationpage {

	@FindBy(xpath="//input[@title='First Name']")
	private WebElement first1;
	@FindBy(xpath="//input[@title='Last Name']")
	private WebElement last1;
	@FindBy(id="change_password")
	private WebElement chang;
	@FindBy(id="current_password")
	private WebElement pass;
	@FindBy(id="password")
	private WebElement pass1;
	@FindBy(id="confirmation")
	private WebElement pass2;
	@FindBy(xpath="//button[@type='submit']")
	private WebElement save;
	
	public account_informationpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void first(String f)
	{
		synchronization.sync1();
		first1.sendKeys(Keys.CONTROL+"a");
		first1.sendKeys(Keys.BACK_SPACE);
		first1.sendKeys(f);
	}
	public void last(String l)
	{	
		synchronization.sync1();
		last1.sendKeys(Keys.CONTROL+"a");
		last1.sendKeys(Keys.BACK_SPACE);
		last1.sendKeys(l);
	}
	public void change()
	{
		chang.click();
	}
	public void current(String p)
	{
		synchronization.sync2();
		pass.sendKeys(Keys.CONTROL+"a");
		pass.sendKeys(Keys.BACK_SPACE);
		pass.sendKeys(p);
	}
	public void current1(String p1)
	{
		synchronization.sync2();
		pass1.sendKeys(Keys.CONTROL+"a");
		pass1.sendKeys(Keys.BACK_SPACE);
		pass1.sendKeys(p1);
	}
	public void current2(String p2)
	{
		synchronization.sync2();
		pass2.sendKeys(Keys.CONTROL+"a");
		pass2.sendKeys(Keys.BACK_SPACE);
		pass2.sendKeys(p2);
	}
	public void save()
	{
		save.click();
	}
}
