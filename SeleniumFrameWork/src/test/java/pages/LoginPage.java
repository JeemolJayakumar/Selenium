package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	static WebElement element=null;

	public static WebElement agencyCode(WebDriver driver)
	{
		
		element=driver.findElement(By.id("txtAgencyCode"));
		return element;
	}
	
	public static WebElement username(WebDriver driver)
	{
		element=driver.findElement(By.id("txtUname"));
		return element;
	}
	
	public static WebElement password(WebDriver driver)
	{
		element=driver.findElement(By.id("txtPwd"));
		return element;
	}
	public static WebElement submit(WebDriver driver)
	{
		element=driver.findElement(By.xpath("//input[@value=\'LOGIN\']"));
		return element;
	}
	
	
}
