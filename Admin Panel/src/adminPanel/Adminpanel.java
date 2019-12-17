package adminPanel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Adminpanel {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jeemol Jayakumar\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		WebDriverWait wait= new WebDriverWait(driver,20);
		
		driver.get("http://stagingprm-b2b.oneviewitsolutions.com:8080/premier-v3/login.xhtml");
		driver.findElement(By.id("form1:j_idt17")).sendKeys("AGY20237");
		driver.findElement(By.id("form1:j_idt21")).sendKeys("SQAHQ");
		driver.findElement(By.id("form1:pwd")).sendKeys("SQAHQ");
		driver.findElement(By.id("form1:submit")).click();
		
		
		WebElement submit=driver.findElement(By.xpath("//a[@id='treeForm:treee:nodeAgencyA']/span"));
		Actions action=new Actions(driver);
		action.contextClick(submit).perform();
		
		driver.findElement(By.xpath("//div[@id='treeForm:_context_menu']/ul/li[2]/a/span[2]")).click();
		driver.findElement(By.id("dlgAddAgency:Agencynm")).sendKeys("SQATestAgency");
		driver.findElement(By.cssSelector("#dlgAddAgency\\3A Email")).sendKeys("jeemol@oneviewit.com");
		
		driver.findElement(By.xpath("//div[@id='dlgAddAgency:Country']/div/input")).sendKeys("ind");
		driver.findElement(By.id("dlgAddAgency:Country_focus")).sendKeys(Keys.ENTER);
		
		driver.findElement(By.id("dlgAddAgency:city_input")).sendKeys("mum");
		WebElement city=driver.findElement(By.cssSelector(".ui-state-highlight > td"));
		city.click();
		
		driver.findElement(By.id("dlgAddAgency:lang_focus")).sendKeys("arab");
	    driver.findElement(By.id("dlgAddAgency:lang_focus")).sendKeys(Keys.ENTER);
	    
	    driver.findElement(By.id("dlgAddAgency:mobileContact")).sendKeys("9744354531");
	    
	    driver.findElement(By.id("dlgAddAgency:title_label")).click();
	    WebElement title= driver.findElement(By.xpath("//li[contains(.,'Miss')]"));
	    wait.until(ExpectedConditions.elementToBeClickable(title));
	    title.click();
	    
	    driver.findElement(By.id("dlgAddAgency:firstnameA")).sendKeys("Jeemol");
	    driver.findElement(By.id("dlgAddAgency:lastnameA")).sendKeys("Jayakumar");
	 
	    driver.findElement(By.id("dlgAddAgency:loginnameA")).sendKeys("SQATestAgency");
	    driver.findElement(By.id("dlgAddAgency:passwordA")).sendKeys("SQATestAgency");
	    
	    driver.findElement(By.id("dlgAddAgency:EmailuserA")).sendKeys("jeemol@oneviewit.com");
	    
	    driver.findElement(By.id("dlgAddAgency:contactuserA")).sendKeys("SQA Engineer");
	    driver.findElement(By.cssSelector(".ui-chkbox-icon")).click();
	    driver.findElement(By.cssSelector("#dlgAddAgency\\3Asubmit > .ui-button-text")).click();
			
	}

}
