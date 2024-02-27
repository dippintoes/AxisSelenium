package Axis.BSGSolutions;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ActionClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\AXIS_TRAINING\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		driver.manage().window().maximize();
		Thread.sleep(3000);	

		WebElement doubleClick=driver.findElement(By.xpath("//input[@id='double-click']"));
		
		Actions builder = new Actions(driver);
		
		builder.doubleClick(doubleClick).perform();
		
		Thread.sleep(3000);
		
		Alert alt=driver.switchTo().alert();
		
		alt.accept();
		
		Thread.sleep(3000);
		
		builder.contextClick(doubleClick).perform();
		
	}

}
