package Axis.BSGSolutions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands {
	public static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
		
		System.setProperty("webdriver.chrome.driver", "D:\\AXIS_TRAINING\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://automationexercise.com/");
		  // get page title
		  String title = driver.getTitle();
		  System.out.println(title);
		  //get current URL
		  String cururl = driver.getCurrentUrl();
		  System.out.println(cururl);
		  //get page source code
		  String pagesource = driver.getPageSource();
		  System.out.println(pagesource);
		  // close () - to close the current browser
//		  driver.close();
	}

}
