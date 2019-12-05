package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage {
	
	static WebElement element=null;
	
	public static WebElement fromAirport(WebDriver driver)
	{
		element=driver.findElement(By.id("txtFrom"));
		return element;
	}
	
}
