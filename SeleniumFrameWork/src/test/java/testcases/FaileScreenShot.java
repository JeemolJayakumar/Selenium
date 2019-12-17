package testcases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.SearchPage;
import utils.TakeScreenShot;

public class FaileScreenShot extends TakeScreenShot {
	WebDriverWait wait;

	@BeforeTest
	public void browserSetup() throws IOException {
		browseSetup();
		System.out.println(driver);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	@Test
	public void login() throws InterruptedException, IOException {
		driver.get("http://stagingportalf.oneviewitsolutions.com/login/Oneview/");
		LoginPage.agencyCode(driver).sendKeys("AGY75");
		LoginPage.username(driver).sendKeys("nancy");
		LoginPage.password(driver).sendKeys("9988");
		Thread.sleep(2000);
		// wait.until(ExpectedConditions.elementToBeClickable(LoginPage.submit(driver)));
		LoginPage.submit(driver).click();

	}

	@Test
	public void search() throws IOException, InterruptedException {
		SearchPage.fromAirport(driver).sendKeys("AUH");
		takescreenshot("Sample");
		// wait.until(ExpectedConditions.elementToBeClickable(SearchPage.fromAirport(driver)));
	}

	/*
	 * @AfterTest public void browserClose() { driver.close(); }
	 */

}
