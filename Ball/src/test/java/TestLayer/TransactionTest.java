package TestLayer;

import org.testng.annotations.Test;

import Pagelayer.DashBordPage;
import Pagelayer.LoginPage;
import Pagelayer.TrasationPage;
import Testbase.TestBase;
import Utility.UtilClass;

public class TransactionTest extends TestBase{

	@Test
	public void getDatafromTrastionPage() throws InterruptedException
	{
		LoginPage log_obj=new LoginPage(driver);//login into Application
		UtilClass util_obj=new UtilClass();           //creating utility class object for scroll down
		
		DashBordPage  dash_obj=new DashBordPage(driver);
		TrasationPage trans_obj=new TrasationPage(driver);       
		log_obj.clickEmail_textbox("1shinde123@gmail.com");
		log_obj.clickpassword_textbox("12345678@A");
		log_obj.clickLogibbutton();
		Thread.sleep(2000);
		
		 
		dash_obj.clickOnTrasatonlink();
		
		trans_obj.getAllData();
	}
}
