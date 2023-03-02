package Utility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import Testbase.TestBase;



public class UtilClass extends TestBase{
	
	public UtilClass()
	{
		PageFactory.initElements(driver,this);
	}
	
	
	public String getWebPageUrl()
	{
		String url=driver.getCurrentUrl();
		return url;
	}
	
	public void Scrolling_down()
	{
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,600)");
	}
		
	
}
