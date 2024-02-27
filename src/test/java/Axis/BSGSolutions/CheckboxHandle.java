package Axis.BSGSolutions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxHandle {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
		
		System.setProperty("webdriver.chrome.driver", "D:\\AXIS_TRAINING\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/checkboxes");
		
		Thread.sleep(3000);
		
		WebElement chkbx2 = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
		
		if(chkbx2.isDisplayed()) {
			chkbx2.click();
		}
		
		WebElement chkbx1 = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
		
		if(chkbx1.isEnabled()) {
			chkbx1.click();
		}
		
	}
}
