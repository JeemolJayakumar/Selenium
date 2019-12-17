package testpackage;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LogIn 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jeemol Jayakumar\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebDriverWait wait = new WebDriverWait(driver, 20);

		driver.get("http://stagingportalf.oneviewitsolutions.com/login/Oneview/");
		driver.findElement(By.id("txtAgencyCode")).sendKeys("AGY75");
		driver.findElement(By.id("txtUname")).sendKeys("Jeemol");
		driver.findElement(By.id("txtPwd")).sendKeys("oneviewitsolutions");

		WebElement loginButton = driver.findElement(By.xpath("//input[@value=\'LOGIN\']"));
		wait.until(ExpectedConditions.elementToBeClickable(loginButton));
		loginButton.click();

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
		WebElement Airline= driver.findElement(By.className("ui-menu-item"));
		Airline.click();

		driver.findElement(By.xpath("//input[@value='SEARCH']")).click();
		driver.findElement(By.id("btnSubmit")).click();

		//driver.switchTo().alert().accept();
		//driver.findElement(By.xpath("//div[2]/button")).click();
		driver.findElement(By.cssSelector(".ajs-ok")).click();

		Select title = new Select(driver.findElement(By.id("ddltitleADT1")));
		title.selectByVisibleText("Ms");

		driver.findElement(By.id("txtFnameADT1")).sendKeys("Jeemol");
		driver.findElement(By.id("txtSnameADT1")).sendKeys("Jayakumar");

		Select Country = new Select(driver.findElement(By.id("txtnationalityADT1")));
		Country.selectByVisibleText("India");

		driver.findElement(By.id("chkAgree")).click();
		driver.findElement(By.id("btnBook")).click();

		//driver.switchTo().alert().accept();
		WebElement alertOK = driver.findElement(By.xpath("//div[8]/div[2]"));
		wait.until(ExpectedConditions.elementToBeClickable(alertOK));
		alertOK.click();

		WebElement IssueTick = driver.findElement(By.id("btnIssueTkt"));
		wait.until(ExpectedConditions.elementToBeClickable(IssueTick));
		IssueTick.click();

		driver.findElement(By.cssSelector("#ticket_issue_popup .btn:nth-child(2)")).click();

		WebElement issueOK = driver.findElement(By.cssSelector(".ajs-button"));
		wait.until(ExpectedConditions.elementToBeClickable(issueOK));
		issueOK.click();
	}
}
