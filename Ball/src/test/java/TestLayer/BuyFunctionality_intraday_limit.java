package TestLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pagelayer.DashBordPage;
import Pagelayer.ExchangeBuyIntradayCustomLimit;
import Pagelayer.LoginPage;
import Testbase.TestBase;
import Utility.UtilClass;

public class BuyFunctionality_intraday_limit extends TestBase{

	
	@Test
	
	public void verify_Buy_fun_intraday_limit() throws InterruptedException
	{
		
		String expected_String_limit_msg="Limit Order Created Successfully";  //Providing expected String
		
		LoginPage log_obj=new LoginPage(driver);//login into Application
		
		UtilClass util_obj=new UtilClass();           //creating utility class object for scroll down
		log_obj.clickEmail_textbox("1shinde123@gmail.com");
		log_obj.clickpassword_textbox("12345678@A");
		log_obj.clickLogibbutton();
		Thread.sleep(2000);
		
		 DashBordPage  dash_obj=new DashBordPage(driver);  //selecting comany share
		 dash_obj.enter_Compary_name_search_box("Wipro");
		 dash_obj.click_on_option();
		 Thread.sleep(2000);
		 
		 ExchangeBuyIntradayCustomLimit cust_limit_obj=new  ExchangeBuyIntradayCustomLimit(driver);
		 cust_limit_obj.clickOnBuyButton1();       //buy share with limit order
		 cust_limit_obj.clickOnIntraDayButton();
		 cust_limit_obj.clickCustomerLimitButton();
		 cust_limit_obj.enterValueQuantitybox("2");
		 util_obj.Scrolling_down();            // Scroll down
		 cust_limit_obj.clickOnBuyButton2();
		 
		 Thread.sleep(4000);
		 String acual_limit_msg=cust_limit_obj.getBuyMsgIntradayLimit(); //comparing limit order msg
		 Assert.assertEquals(acual_limit_msg, expected_String_limit_msg);
		 
		
	}
	
	
	
}
