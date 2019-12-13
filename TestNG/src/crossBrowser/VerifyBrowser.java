package crossBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class VerifyBrowser {
	
	WebDriver driver;
	
	@Test
	@Parameters ("browser")
	public void verifyPageTitle(String browserName)
	{
		
	if(browserName.equalsIgnoreCase("firefox"))
	{
		driver=new FirefoxDriver();
	}
	else if(browserName.equalsIgnoreCase("chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jeemol Jayakumar\\chromedriver.exe");
		driver= new ChromeDriver();
	}
	
	driver.get("http://stagingportalf.oneviewitsolutions.com/login/Oneview/");
	System.out.println(driver.getTitle());

	}
}
