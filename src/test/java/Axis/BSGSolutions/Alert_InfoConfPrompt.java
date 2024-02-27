package Axis.BSGSolutions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alert_InfoConfPrompt {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\AXIS_TRAINING\\geckodriver-v0.34.0-win32\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		driver.manage().window().maximize();
		Thread.sleep(1000);	
		//informational alert
		WebElement infoalert=driver.findElement(By.xpath("//input[@value='Alert']"));
		
		infoalert.click();
		
		Thread.sleep(3000);
		
		Alert alt=driver.switchTo().alert();
		
		alt.accept();
		
		Thread.sleep(5000);
		
		//confirmational alert
		WebElement confalert=driver.findElement(By.xpath("//input[@value=\"Confirmation Box\"]"));
		
		confalert.click();
		
		Thread.sleep(3000);
		
		Alert alt1=driver.switchTo().alert();
		
		alt1.dismiss();
		
		Thread.sleep(5000);
		
		//prompt alert
		WebElement promptalert=driver.findElement(By.xpath("//input[@value=\"Prompt\"]"));
				
		promptalert.click();
				
		Thread.sleep(3000);
				
		Alert alt2=driver.switchTo().alert();
		
		alt2.sendKeys("Rutuja");
		
		Thread.sleep(3000);
				
		alt2.accept();
	}
}
