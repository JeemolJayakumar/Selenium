package testpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class AlertMessage {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jeemol Jayakumar\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	String AlertMessage="";
	
	driver.get("http://jsbin.com/usidix/1");
    driver.findElement(By.cssSelector("input[value=\"Go!\"]")).click();
    AlertMessage=driver.switchTo().alert().getText();
    driver.switchTo().alert().accept();
    
    System.out.println(AlertMessage);
    driver.close();

	}

}
