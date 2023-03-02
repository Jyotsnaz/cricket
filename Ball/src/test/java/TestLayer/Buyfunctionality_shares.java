package TestLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pagelayer.DashBordPage;
import Pagelayer.ExchangePage;
import Pagelayer.LoginPage;
import Testbase.TestBase;
import Utility.UtilClass;

public class Buyfunctionality_shares extends TestBase {

	@Test
	public void VerifiedBuyFunctionalityofShares() throws InterruptedException
	{    
		String expected_result="Order Created successfully";
        LoginPage log_obj=new LoginPage(driver);
        UtilClass util_obj=new UtilClass();
        DashBordPage  dash_obj=new DashBordPage(driver); 
        ExchangePage exchange_obj=new ExchangePage(driver);
		
		log_obj.clickEmail_textbox("1shinde123@gmail.com");
		log_obj.clickpassword_textbox("12345678@A");
		log_obj.clickLogibbutton();
		Thread.sleep(2000);
		//------------------------------
		
		dash_obj.enter_Compary_name_search_box("wipro");
		dash_obj.click_on_option();
		Thread.sleep(2000);
		//___________________
		exchange_obj.clickOnBuyButton1();
		exchange_obj.enterValueQuantitybox("1");
		util_obj.Scrolling_down();
		//Thread.sleep(6000);
		exchange_obj.clickOnBuyButton2();
		
		
		Thread.sleep(3000);
		String acttual_result=exchange_obj.getBuyMessage1();
		Assert.assertEquals(acttual_result,expected_result);
	}
	
}
