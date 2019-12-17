package adminPanel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class Adminpanel {
	
	WebDriver driver;
	WebDriverWait wait;
	
		@Test (priority=1, groups= "sanity")
		public void login()
		{
	    driver.findElement(By.id("form1:j_idt16")).sendKeys("AGY20237");
		driver.findElement(By.id("form1:j_idt20")).sendKeys("SQAHQ");
		driver.findElement(By.id("form1:pwd")).sendKeys("SQAHQ");
		driver.findElement(By.id("form1:submit")).click();
		}
		
		@Test (priority=2, groups= {"sanity", "smoke"})
		public void configuration()
		{
		WebElement submit=driver.findElement(By.xpath("//a[@id='treeForm:treee:nodeAgencyA']/span"));
		Actions action=new Actions(driver);
		action.contextClick(submit).perform();
		}
		
	@Test (priority=3)
		public void newAgency()
		{
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
		}
		
		@Test (priority=4)
		public void adminUser() throws InterruptedException
		{
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
	    
	    driver.findElement(By.xpath("//table[@id='dlgAddAgency:settment']/tbody/tr[2]/td/div/div[2]/span")).click();
	   Thread.sleep(2000);
	    driver.findElement(By.id("dlgAddAgency:creditLimitAgency_input")).sendKeys("80000");
	    driver.findElement(By.cssSelector("#dlgAddAgency\\3Asubmit > .ui-button-text")).click();
	    
	    
		}
		
		@BeforeClass(groups= "smoke")
		public void startBrowser() 
		{
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jeemol Jayakumar\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			wait= new WebDriverWait(driver,20);
			
			driver.get("http://stagingprm-b2b.oneviewitsolutions.com:8080/premier-v3/login.xhtml");
		}
}


