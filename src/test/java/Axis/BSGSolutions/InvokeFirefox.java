package Axis.BSGSolutions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class InvokeFirefox {

	public static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
		
		System.setProperty("webdriver.gecko.driver", "D:\\AXIS_TRAINING\\geckodriver-v0.34.0-win32\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.selenium.dev/");	
	}
}
