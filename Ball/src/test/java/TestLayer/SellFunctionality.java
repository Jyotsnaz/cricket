package TestLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pagelayer.DashBordPage;
import Pagelayer.Exchange_Sell_Page;
import Pagelayer.LoginPage;
import Testbase.TestBase;
import Utility.UtilClass;

public class SellFunctionality extends TestBase{

	
	@Test
	public void verifiedSellFunctionalityofShare() throws InterruptedException
	{     
		String expected_Str="Order Created successfully"; //expected string
		
		LoginPage log_obj=new LoginPage(driver);  //login function
		UtilClass util_obj=new UtilClass();
		log_obj.clickEmail_textbox("1shinde123@gmail.com");
		log_obj.clickpassword_textbox("12345678@A");
		log_obj.clickLogibbutton();
		Thread.sleep(2000);
		
		DashBordPage dash_obj=new DashBordPage(driver);// Enter shares company name
		dash_obj.enter_Compary_name_search_box("Wipro");
		dash_obj.click_on_option();
		Thread.sleep(3000);
		
		
		
		Exchange_Sell_Page exc_sell_obj=new Exchange_Sell_Page(driver);//Selling Share
		exc_sell_obj.clickOnSellButton();
		exc_sell_obj.eneterValueQuantitybox("2");
		util_obj.Scrolling_down();
		exc_sell_obj.clickOnSellbutton2();
		Thread.sleep(3000);
		
		String actual_result_string=exc_sell_obj.getSellMessage2(); //geting string throug function
		Assert.assertEquals(actual_result_string, expected_Str); //comparing actual string & expected str 
		
		
		
		
				
		
	}
	
	
	
	
}

