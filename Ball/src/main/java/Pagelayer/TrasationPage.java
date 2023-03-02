package Pagelayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class TrasationPage {

	private WebDriver driver;
	public TrasationPage(WebDriver driver)
	{   this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
	public void getDatafromTable()
	{
	String data=driver.findElement(By.xpath("//table/tbody/tr[1]/td[3]")).getText();
	System.out.println(data);
	}
	
	
	public void getAllData()
	{
		for(int i=0;i<=10;i++)
		{
			for(int j=0;j<=9;j++)
			{
				String data=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td["+j+"]")).getText();
				System.out.println(data);
			}
			//System.out.println();
		}
	}

}
