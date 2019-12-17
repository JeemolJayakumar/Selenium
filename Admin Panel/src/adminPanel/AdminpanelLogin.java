package adminPanel;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AdminpanelLogin {

	WebDriver driver;
	WebDriverWait wait;
	ExcelUtility excelUtility;

	@BeforeClass
	public void setupBrowser() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jeemol Jayakumar\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		wait = new WebDriverWait(driver, 20);
		driver.get("http://stagingprm-b2b.oneviewitsolutions.com:8080/premier-v3/oneviewB2B.xhtml");
	}

	@Test(dataProvider = "getData")
	public void logIn(String agency, String username, String password) throws InterruptedException {
		driver.findElement(By.id("form1:j_idt17")).sendKeys(agency);
		driver.findElement(By.id("form1:j_idt21")).sendKeys(username);
		driver.findElement(By.id("form1:pwd")).sendKeys(password);
		driver.findElement(By.id("form1:submit")).click();
		Thread.sleep(5000);
	}

	@DataProvider(name = "getData")
	public Object[][] getData() throws IOException {

		String excelPath = "C:\\Users\\Jeemol Jayakumar\\eclipse-workspace\\Admin Panel\\src\\testData\\TestData.xlsx";
		String sheetname = "Sheet1";
		excelUtility = new ExcelUtility(excelPath, sheetname);

		Object data[][] = testdata(excelPath, sheetname);
		return data;

	}

	public Object[][] testdata(String excelPath, String sheetname) throws IOException {
		int rowCount = excelUtility.getRowCount();
		int colCount = excelUtility.getColCount();

		Object data[][] = new Object[rowCount - 1][colCount];
		for (int i = 1; i < rowCount; i++) {
			for (int j = 0; j < colCount; j++) {
				String cellData = excelUtility.getCelDataString(i, j);
				// System.out.println(cellData);
				data[i - 1][j] = cellData;
			}
		}
		return data;
	}

	@AfterClass
	public void browserClose() {
		driver.quit();
	}

}
