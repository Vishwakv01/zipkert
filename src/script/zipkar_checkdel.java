package script;

import org.testng.annotations.Test;

import Baseclass.basic;
import POM.customer_loginpage;
import POM.my_accountpage;
import POM.search_resultpage;
import POM.shoping_cartpage;
import POM.watch_page;
import POM.zipkar_homepage;
import generic_lib.Excel;

public class zipkar_checkdel extends basic {

	@Test
	public void cart() throws InterruptedException {
	String username=Excel.zipkar("sheet1",45,3);
	String password=Excel.zipkar("sheet1",46,3);
	String search=Excel.zipkar("sheet1",50 ,3);
	String pin=Excel.zipkar("sheet1",55 , 3);
	customer_loginpage l=new customer_loginpage(driver);
	l.username(username);
	l.password(password);
	l.sign();
	my_accountpage m=new my_accountpage(driver);
	m.cartbt();
	shoping_cartpage s=new shoping_cartpage(driver);
	s.cart();
	zipkar_homepage z1=new zipkar_homepage(driver);
	z1.searchtb(search);
	search_resultpage sea=new search_resultpage(driver);
	sea.anr();
	watch_page w=new watch_page(driver);
	//w.change();
	w.text(pin);
	w.post();
	}
}
