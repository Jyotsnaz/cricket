package Testbase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
 public static WebDriver driver;
 
	@BeforeMethod
	public void setUp()
	{
		String browser="chrome";
		if (browser.equalsIgnoreCase("chrome"))
		{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox")) 
		{
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("edge")) 
		{
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		}
		else
		{
			System.out.println("Plz provide currect browser name");
		}
		
		
		driver.get("https://www.apps.dalalstreet.ai/login");
		driver.manage().deleteAllCookies();
		driver.manage().window().fullscreen();
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	}
	
	
	@AfterMethod
	 
	public void shoutDown()
	 {
		//driver.quit();
	 }
	
	
}
