package configure;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class PropertyFile {

	public static void main(String[] args) {
		readPropertyFile();
	}
	
	public static void readPropertyFile() {
		
		Properties prop = new Properties();
		try {
			InputStream input = new FileInputStream("C:/Users/Jeemol Jayakumar/git/Selenium/TestProject1/src/configure/config.properties");
			prop.load(input);
			System.out.println(prop.getProperty("browser"));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
