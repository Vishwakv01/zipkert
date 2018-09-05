package script;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Baseclass.basic;
import POM.customer_loginpage;
import POM.edit_addrespage;
import POM.my_accountpage;
import generic_lib.Excel;
import generic_lib.constant;

public class zipkar_addr extends basic {

		@Test(priority=2)
		public void addr() throws InterruptedException {
		String username=Excel.zipkar("sheet1",3, 3);
		String password=Excel.zipkar("sheet1",4,3);
		String streat=Excel.zipkar("sheet1",7,3);
		String city=Excel.zipkar("sheet1",8,3);
		String tel=Excel.zipkar("sheet1", 9, 3);
		String state=Excel.zipkar("sheet1",10,3);
		String pin=Excel.zipkar("sheet1",11,3);
		customer_loginpage l=new customer_loginpage(driver);
		l.username(username);
		l.password(password);
		l.sign();
		my_accountpage a=new my_accountpage(driver);
		a.editpage();
		edit_addrespage e=new edit_addrespage(driver);
		e.streettb(streat);
		e.citytb(city);
		e.pintb(pin);
		e.teltb(tel);
		e.area(state);
		e.savebtn();
	}
}