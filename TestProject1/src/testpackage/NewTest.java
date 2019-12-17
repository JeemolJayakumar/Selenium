package testpackage;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public static void main(String[] args) throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jeemol Jayakumar\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
	   
		driver.get("http://stagingportalf.oneviewitsolutions.com/login/Oneview/");
		driver.findElement(By.id("txtAgencyCode")).sendKeys("AGY75");
		driver.findElement(By.id("txtUname")).sendKeys("Jeemol");
		driver.findElement(By.id("txtPwd")).sendKeys("oneviewitsolutions");
		
		WebElement loginButton = driver.findElement(By.xpath("//input[@value=\'LOGIN\']"));
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(loginButton));
		loginButton.click();
	  
  }
}
