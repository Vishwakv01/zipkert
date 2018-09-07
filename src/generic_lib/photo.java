package generic_lib;

import java.io.File;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

public class photo {

	public WebDriver driver;
	public static String getphoto(WebDriver driver,String folder,String testcasename)
	{
	String path="";
	try
	{
		Date d=new Date();
		String date1=d.toString().replace(":","-");
		path=folder+testcasename+date1+".png";
		TakesScreenshot a=(TakesScreenshot)driver;
		File src=a.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File(path));
	}
	catch(Exception e)
	{
		Reporter.log("photo is taken");
	}
	return path;
	}
	
}
