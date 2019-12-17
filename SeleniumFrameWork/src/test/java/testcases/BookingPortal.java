package testcases;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


import pages.LoginPage;
import pages.SearchPage;

public class BookingPortal{
	
	static WebDriver driver=null;
	WebDriverWait wait;
	
		
		@Parameters("Browser")
		@BeforeTest		
		public void browserSetup(String browsername)
		{
		 if(browsername.equalsIgnoreCase("chrome"))
		 {
			 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jeemol Jayakumar\\chromedriver.exe");
			 driver=new ChromeDriver();
			 driver.get("http://stagingportalf.oneviewitsolutions.com/login/Oneview/");
			 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			 
		 }
		 else 
		 	{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Jeemol Jayakumar\\geckodriver.exe");
			driver=new FirefoxDriver();
			
		 	}
		}
		@Test
		public void login() throws InterruptedException, IOException
		{
		driver.get("http://stagingportalf.oneviewitsolutions.com/login/Oneview/");
		LoginPage.agencyCode(driver).sendKeys("AGY75");
		LoginPage.username(driver).sendKeys("nancy");
		LoginPage.password(driver).sendKeys("9988");
		Thread.sleep(2000);
		//wait.until(ExpectedConditions.elementToBeClickable(LoginPage.submit(driver)));
		LoginPage.submit(driver).click();
		
		}
		
		@Test
		public void search() throws IOException, InterruptedException
		{
		SearchPage.fromAirport(driver).sendKeys("AUH");
		//wait.until(ExpectedConditions.elementToBeClickable(SearchPage.fromAirport(driver)));
		}
		
		/* @AfterTest
		public void browserClose()
		{
			driver.close();
		}*/

}
