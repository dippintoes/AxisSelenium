package PracticeProject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Clicking {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\AXIS_TRAINING\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Click-Buttons/index.html");
		driver.manage().window().maximize();
		Thread.sleep(1000);	
		
		//WebElement Click
		
		driver.findElement(By.xpath("//span[@id='button1']")).click();
		Thread.sleep(2000);	
		driver.findElement(By.xpath("//button[contains(text(), 'Close')]")).click();
		Thread.sleep(2000);	
		
		//Javascript Click
		
		WebElement JSBtn = driver.findElement(By.cssSelector("#button2"));
		JavascriptExecutor jsexec = (JavascriptExecutor)driver;
		jsexec.executeScript("arguments[0].click();", JSBtn);
		Thread.sleep(2000);	
		driver.findElement(By.xpath("//body/div[1]/div[5]/div[1]/div[1]/div[3]/button[1]")).click();
		Thread.sleep(2000);	
		
		//Action Move and Click
		
		WebElement ActionBtn = driver.findElement(By.xpath("//span[@id='button3']"));
		Actions actions= new Actions(driver);
		actions.moveToElement(ActionBtn).click().perform();
		driver.findElement(By.xpath("//button[contains(text(), 'Close')]")).click();
		Thread.sleep(2000);	
		
	}

}
