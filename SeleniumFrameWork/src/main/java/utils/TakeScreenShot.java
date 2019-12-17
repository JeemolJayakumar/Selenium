package utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class TakeScreenShot {

	public static WebDriver driver;

	public static void browseSetup() throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jeemol Jayakumar\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://stagingportalf.oneviewitsolutions.com/login/Oneview/");
		takescreenshot("Jaimon");

	}

	public static void takescreenshot(String filename) throws IOException {
		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file,
				new File("C:\\Users\\Jeemol Jayakumar\\git\\Selenium\\SeleniumFrameWork\\src\\main\\java\\Screenshots\\"
						+ filename + ".jpg"));
	}
}
