package script;

import org.testng.annotations.Test;

import Baseclass.basic;
import POM.account_informationpage;
import POM.customer_loginpage;
import POM.my_accountpage;
import generic_lib.Excel;

public class zipkar_changepwd extends basic {

	@Test
	public void change_pwd()
	{
		String username=Excel.zipkar("sheet1",87,3);
		String password=Excel.zipkar("sheet1",88,3);
		String pass=Excel.zipkar("sheet1", 92, 3);
		String pass1=Excel.zipkar("sheet1", 94, 3);
		String pass2=Excel.zipkar("sheet1", 96, 3);
		customer_loginpage l=new customer_loginpage(driver);
		l.username(username);
		l.password(password);
		l.sign();
		my_accountpage m=new my_accountpage(driver);
		m.edit1();
		account_informationpage a=new account_informationpage(driver);
		a.change();
		a.current(pass);
		a.current1(pass1);
		a.current2(pass2);
		a.save();
		basic b=new basic();
		//b.after(testphoto);
		b.before();
		customer_loginpage lo=new customer_loginpage(driver);
		lo.username(username);
		lo.password(password);
		lo.sign();
	}
}
