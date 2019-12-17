package testpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class Flight 
{
		 
	public static void main(String[] args)
		{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jeemol Jayakumar\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
			String baseURL = "http://demo.guru99.com/test/newtours/";
			String expectedTitle = "Welcome: Tours";
	        String actualTitle = "";
	        driver.get(baseURL);
	        actualTitle = driver.getTitle();
	        if (actualTitle.contentEquals(expectedTitle)){
	            System.out.println("Test Passed!");
	        } else {
	            System.out.println("Test Failed");
	        }
	      driver.close();  
		}	
}
	