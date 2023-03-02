package TestLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pagelayer.DashBordPage;
import Pagelayer.ExchangeSell_IntradayCustomerLimit;
import Pagelayer.LoginPage;
import Testbase.TestBase;
import Utility.UtilClass;

public class SellFunctionalityIntradayLimit extends TestBase {

@Test	
	public void verify_Sell_OnLimitOrder () throws InterruptedException
	{
	String expected_string="Limit Order Created Successfully";
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
	 
	 ExchangeSell_IntradayCustomerLimit Sell_custlimit_obj=new ExchangeSell_IntradayCustomerLimit(driver);
	 Sell_custlimit_obj.clickOnSell_Button1();
	 Sell_custlimit_obj.clickOnIntraDayButton();
	 Sell_custlimit_obj.clickOnCustomerLimitButton();
	 Sell_custlimit_obj.enterTheNOofQuantity("2");
	 util_obj.Scrolling_down();
	 Sell_custlimit_obj.clickOnSell_Button2();
	Thread.sleep(2000);
	
	String actual_string=Sell_custlimit_obj.getmsg();
	Assert.assertEquals(actual_string, expected_string);
	}
	
	
}
