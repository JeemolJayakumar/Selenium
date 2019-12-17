package nextGneration;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NewTest 
{
  
  public WebDriver driver;
  WebDriverWait wait;
   
  @Test (priority=1)
   public void login() 
  			{
		
			driver.findElement(By.id("txtAgencyCode")).sendKeys("AGY75");
			driver.findElement(By.id("txtUname")).sendKeys("Jeemol");
			driver.findElement(By.id("txtPwd")).sendKeys("oneviewitsolutions");
//			driver.findElement(By.xpath("//input[@value=\'LOGIN\']"));
			
			WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value=\'LOGIN\']")));
			loginButton.click();
		    }
   @Test (priority=2)
	public void search() 
   			{		
			driver.findElement(By.id("txtFrom")).sendKeys("AUH");
			WebElement listitems = driver.findElement(By.id("ui-id-14"));
			listitems.click();
			
			driver.findElement(By.id("txtTo")).sendKeys("LHR");
			WebElement liit = driver.findElement(By.id("ui-id-16"));
			liit.click();
			
			driver.findElement(By.id("deptDate01")).click();
			driver.findElement(By.xpath("//a[contains(text(),'30')]")).click();
			//driver.findElement(By.cssSelector(".ui-state-hover")).click();
			
			driver.findElement(By.id("lblSuppliersSelected")).click();
			driver.findElement(By.id("chkSelectAll")).click();
		    driver.findElement(By.xpath("//input[@value='1']")).click();
		    
		    driver.findElement(By.id("ddlAirline")).click();
		    driver.findElement(By.id("ddlAirline")).sendKeys("British Airways");
		    WebElement Airline= driver.findElement(By.xpath("//div[contains(.,'British Airways(BA)')]"));
		    wait.until(ExpectedConditions.elementToBeClickable(Airline));
		    Airline.click();
		    
			driver.findElement(By.xpath("//input[@value='SEARCH']")).click();
   			}
   @Test (priority=3)
   public void bookNow()
   			{
			driver.findElement(By.id("btnSubmit")).click();
   			}
			//driver.switchTo().alert().accept();
			//driver.findElement(By.xpath("//div[2]/button")).click();
   @Test (priority=4) 
   public void traveller()
   			{
			WebElement alert= driver.findElement(By.cssSelector(".ajs-ok"));
			wait.until(ExpectedConditions.elementToBeClickable(alert));
			alert.click();
			
			Select title = new Select(driver.findElement(By.id("ddltitleADT1")));
			title.selectByVisibleText("Ms");
			
			driver.findElement(By.id("txtFnameADT1")).sendKeys("Jeemol");
			//WebElement firnam= driver.findElement(By.id("txtFnameADT1")).sendKeys("Jeemol");
			//wait.until(ExpectedConditions.elementToBeClickable(firnam));
			//firnam.sendKeys("Jeemol");
			WebElement lasnam=driver.findElement(By.id("txtSnameADT1"));
			lasnam.sendKeys("Jayakumar");
			
			Select Country = new Select(driver.findElement(By.id("txtnationalityADT1")));
			Country.selectByVisibleText("India");
			
			driver.findElement(By.id("chkAgree")).click();
			driver.findElement(By.id("btnBook")).click();
			
			//driver.switchTo().alert().accept();
			WebElement alertOK = driver.findElement(By.xpath("//div[8]/div[2]"));
			wait.until(ExpectedConditions.elementToBeClickable(alertOK));
			alertOK.click();
   			}
   @Test (priority=5)
   public void issueTicket()
   			{
			WebElement IssueTick = driver.findElement(By.id("btnIssueTkt"));
			wait.until(ExpectedConditions.elementToBeClickable(IssueTick));
			IssueTick.click();
			
			driver.findElement(By.cssSelector("#ticket_issue_popup .btn:nth-child(2)")).click();
			
			WebElement issueOK = driver.findElement(By.cssSelector(".ajs-button"));
			wait.until(ExpectedConditions.elementToBeClickable(issueOK));
			issueOK.click();
   			}

		 

  @BeforeClass
  public void startBrowserDriver() 
  {
		
			System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Jeemol Jayakumar\\\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get("http://stagingportalf.oneviewitsolutions.com/login/Oneview/");

			wait = new WebDriverWait(driver,40);
			WebElement loginButton = driver.findElement(By.xpath("//input[@value=\'LOGIN\']"));
			wait.until(ExpectedConditions.elementToBeClickable(loginButton));
		}
 }

  




