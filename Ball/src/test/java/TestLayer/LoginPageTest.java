package TestLayer;

import org.testng.Assert;
import org.testng.annotations.Test;
import Pagelayer.LoginPage;
import Testbase.TestBase;
import Utility.UtilClass;

public class LoginPageTest extends TestBase{

	@Test
	public void verifyLoginwithCorrectCred() throws InterruptedException
	{
		String expected_url="https://www.apps.dalalstreet.ai/dashboard";
		
		LoginPage log_obj=new LoginPage(driver);
		
		UtilClass util_obj=new UtilClass(); //scrolling
		util_obj.Scrolling_down();
		Thread.sleep(5000);
		log_obj.clickEmail_textbox("1shinde123@gmail.com");
		log_obj.clickpassword_textbox("12345678@A");
		log_obj.clickLogibbutton();
		
		
		Thread.sleep(5000);
		System.out.println(util_obj.getWebPageUrl());
		
		String actual_output_url=util_obj.getWebPageUrl();
		
		Assert.assertEquals(actual_output_url, expected_url);
	}
}
