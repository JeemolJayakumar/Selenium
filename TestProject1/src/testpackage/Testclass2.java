package testpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Testclass2 {

	public static void main(String[] args) 
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Jeemol Jayakumar\\chromedriver.exe");	
	WebDriver driver = new ChromeDriver();
	String baseURL="https://accounts.google.com/";
	String Name="";
	String Title="";
	//String pagesource="";
	String currentURL="";
	
	driver.get(baseURL);
	Title=driver.getTitle();
	//pagesource=driver.getPageSource();
	currentURL=driver.getCurrentUrl();
	Name=driver.findElement(By.id("identifierId")).getTagName();
	System.out.println(Name);
	System.out.println(Title);
	System.out.println(currentURL);
	//System.out.println(pagesource);
	//driver.close();
	}

}
