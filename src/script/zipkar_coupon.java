package script;

import org.testng.annotations.Test;

import Baseclass.basic;
import POM.customer_loginpage;
import POM.my_accountpage;
import POM.onestep_checkoutpage;
import POM.search_resultpage;
import POM.shoping_cartpage;
import POM.watch_page;
import POM.zipkar_homepage;
import generic_lib.Excel;

public class zipkar_coupon extends basic {

	@Test
	public void coupon()
	{
		String username=Excel.zipkar("sheet1",71,3);
		String password=Excel.zipkar("sheet1",72,3);
		String search=Excel.zipkar("sheet1", 76, 3);
		String coupon=Excel.zipkar("sheet1", 82, 3);
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
		w.buy();
		onestep_checkoutpage o=new onestep_checkoutpage(driver);
		o.coupon(coupon);
		o.apply();
	}
}