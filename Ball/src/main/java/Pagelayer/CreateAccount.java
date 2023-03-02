package Pagelayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccount{

	public CreateAccount(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(xpath="//input[@id='formrow-firstname-Input']")
	private WebElement first_name_txt_box;
	
	@FindBy(xpath="//input[@id='formrow-lastname-Input']")
	private WebElement last_name_txt_box;
	
	@FindBy(xpath="//input[@name='email']")
	private WebElement yEmail_it_txt_box;
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement ypassword_txt_box;
	
	@FindBy(xpath=" //input[@id='customControlInline']")
	private WebElement checkbox;
	
	@FindBy(xpath="//button[@class='btn btn-success btn-block']")
	private WebElement journy_btn;
	
	//========Action---------------
	
	public void enter_firstname(String Fname)
	{
		first_name_txt_box.sendKeys(Fname);
	}
	
	public void enter_lastname(String Lname)
	{
		last_name_txt_box.sendKeys(Lname);	
	}
	public void enter_email(String mail)
	{
		yEmail_it_txt_box.sendKeys(mail);	
	}
	public void enter_password(String pwd)
	{
		ypassword_txt_box.sendKeys(pwd);	
	
	}
	
	public void click_checkbox()
	{
		checkbox.click();
	}
	
	public void click_journy_btn()
	{
		journy_btn.click();
	}
}
