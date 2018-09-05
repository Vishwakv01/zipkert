package POM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class login_drive {

		@Test
		public void login()
		{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("(//input[@autocomplete='off'])[2]"));
		driver.navigate().refresh();
		login p=new login(driver);
		p.username("username");
		p.password("password");
		p.signin();

		}

}
