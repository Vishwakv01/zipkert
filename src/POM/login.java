package POM;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class login {
	//declaration
	@FindBy(xpath="(//input[@autocomplete='off'])[2]")
	private WebElement ustb;
	@FindBy(xpath="//input[@type='password']")
	private WebElement pass;
	@FindBy(id="submit")
	private WebElement log;
	//initialization
	public login(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	//utilization
	public void username(String username) {
		ustb.sendKeys("abc");
	}
	public void password(String password) {
		pass.sendKeys("xyz");
	}
	public void signin() {
		log.click();
	}
}
