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

public class zipkart_remov extends basic {
	@Test(priority=0)
	public void cart() {
	String username=Excel.zipkar("sheet1",31,3);
	String password=Excel.zipkar("sheet1",32,3);
	String search=Excel.zipkar("sheet1",22 ,3);
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
	sea.watchp();
	watch_page w=new watch_page(driver);
	w.cartbt1();
	s.remove();
	}
}
