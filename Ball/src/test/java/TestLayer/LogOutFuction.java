package TestLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pagelayer.DashBordPage;
import Pagelayer.LoginPage;
import Testbase.TestBase;
import Utility.UtilClass;

public class LogOutFuction extends TestBase{

	
	@Test
	public void verifyLogoutFuctionality() throws InterruptedException
	{
		String expexted_url="https://www.apps.dalalstreet.ai/logout";

		LoginPage log_obj=new LoginPage(driver);//login into Application
		UtilClass util_obj=new UtilClass();           //creating utility class object for scroll down
		           
		log_obj.clickEmail_textbox("1shinde123@gmail.com");
		log_obj.clickpassword_textbox("12345678@A");
		log_obj.clickLogibbutton();
		Thread.sleep(2000);
		
		DashBordPage  dash_obj=new DashBordPage(driver); 
		dash_obj.clickOnProfileDropdown();
		dash_obj.clickOnPoweroff();
		
		String actualUral=util_obj.getWebPageUrl();
		Assert.assertEquals(actualUral, expexted_url);
	}
}
