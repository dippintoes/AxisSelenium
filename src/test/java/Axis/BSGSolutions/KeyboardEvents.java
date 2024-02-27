package Axis.BSGSolutions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class KeyboardEvents {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\AXIS_TRAINING\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		Thread.sleep(1000);	
		
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		
		Actions builder = new Actions(driver);
		
		//action to be used when doing series of actions together
		
		Action seriesofaction = builder.moveToElement(email).click().keyDown(email,Keys.SHIFT).sendKeys(email,"rutug").build();	
		Thread.sleep(2000);	
		seriesofaction.perform();
		
	}

}
