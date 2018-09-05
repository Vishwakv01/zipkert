package POM;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class search_resultpage {
	
	@FindBy(xpath="(//h2[@class='product-name'])[9]")
	private WebElement watch;
	@FindBy(xpath="(//a[.='Ethnic Yard Beige Faux Georgette Semi-Stitched Anarkali Salwar Suit'])[1]")
	private WebElement anarkali;
	public search_resultpage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void watchp()
	{
		watch.click();
	}
	public void anr()
	{
		anarkali.click();
	}
}
