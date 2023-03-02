package TestLayer;

import org.testng.annotations.Test;

import Pagelayer.CreateAccount;
import Pagelayer.LoginPage;
import Testbase.TestBase;


public class Create_account extends TestBase{

	@Test
	public void verifyAccountCreation() throws InterruptedException
	{
		LoginPage log_obj=new LoginPage(driver);
		
		//UtilClass util_obj=new UtilClass(); //scrolling
		Thread.sleep(3000);
		log_obj.clickSign_link();
		
		
		 CreateAccount creatAcc_obj=new  CreateAccount(driver);
		creatAcc_obj.enter_firstname("Radhika");
		creatAcc_obj.enter_lastname("Shinde");
		creatAcc_obj.enter_email("1shinde123@gmail.com");
		creatAcc_obj.enter_password("12345678@A");
		creatAcc_obj.click_checkbox();
		creatAcc_obj.click_journy_btn();
		
	}
	
}
