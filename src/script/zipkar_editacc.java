package script;

import org.testng.annotations.Test;

import Baseclass.basic;
import POM.account_informationpage;
import POM.customer_loginpage;
import POM.my_accountpage;
import generic_lib.Excel;

public class zipkar_editacc extends basic {

	@Test
	public void edit_acc()
	{
		String username=Excel.zipkar("sheet1",60,3);
		String password=Excel.zipkar("sheet1",61,3);
		String first=Excel.zipkar("sheet1", 64, 3);
		String last=Excel.zipkar("sheet1", 65, 3);
		customer_loginpage l=new customer_loginpage(driver);
		l.username(username);
		l.password(password);
		l.sign();
		my_accountpage m=new my_accountpage(driver);
		m.edit1();
		account_informationpage a=new account_informationpage(driver);
		a.first(first);
		a.last(last);
		a.save();
	}
}