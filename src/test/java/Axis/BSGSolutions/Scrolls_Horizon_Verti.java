package Axis.BSGSolutions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolls_Horizon_Verti {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\AXIS_TRAINING\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://aeon.co/essays");
		
		Thread.sleep(3000);	
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		Thread.sleep(3000);	
		
		//vertical down scroll 
		
		js.executeScript("window.scrollBy(0,-1600)", "");
		Thread.sleep(3000);	
		
		//vertical up scroll 
		
		js.executeScript("window.scrollBy(0,600)", "");
		Thread.sleep(3000);	
		
		//horizontal down scroll 
		
		js.executeScript("window.scrollBy(1600,0)", "");
		Thread.sleep(3000);	
				
		//horizontal up scroll 
				
		js.executeScript("window.scrollBy(-600,0)", "");
		Thread.sleep(3000);	
		
		//scroll to view
		
		WebElement element = driver.findElement(By.xpath("//button[@data-ga-select-prompt=\"aeon_footer_newsletter_grey\"]"));
		
		js.executeScript("arguments[0].scrollIntoView(true)",element);
	}

}
