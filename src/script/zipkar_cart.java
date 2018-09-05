package script;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Baseclass.basic;
import POM.customer_loginpage;
import POM.my_accountpage;
import POM.search_resultpage;
import POM.shoping_cartpage;
import POM.watch_page;
import POM.zipkar_homepage;
import generic_lib.Excel;
import generic_lib.constant;

public class zipkar_cart extends basic  {
	  
		@Test(priority=-1)
		public void cart() {
		String username=Excel.zipkar("sheet1",17,3);
		String password=Excel.zipkar("sheet1",18,3);
		String search=Excel.zipkar("sheet1",22 ,3);
		customer_loginpage l=new customer_loginpage(driver);
		l.username(username);
		l.password(password);
		l.sign();
		my_accountpage m=new my_accountpage(driver);
		m.cartbt();
		shoping_cartpage s=new shoping_cartpage(driver);
		s.shop();
		zipkar_homepage z1=new zipkar_homepage(driver);
		z1.searchtb(search);
		search_resultpage sea=new search_resultpage(driver);
		sea.watchp();
		watch_page w=new watch_page(driver);
		w.cartbt1();
	}

}
