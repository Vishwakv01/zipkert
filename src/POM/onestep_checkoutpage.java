package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class onestep_checkoutpage {

	@FindBy(id="couponcode")
	private WebElement coupon;
	@FindBy(xpath="//button[.='Apply Coupon']")
	private WebElement apply;
	
	public onestep_checkoutpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void coupon(String c)
	{
		coupon.sendKeys(c);
	}
	public void apply()
	{
		apply.click();
	}
}
