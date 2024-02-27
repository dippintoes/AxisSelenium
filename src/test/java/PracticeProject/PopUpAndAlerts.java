package PracticeProject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUpAndAlerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\AXIS_TRAINING\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Popup-Alerts/index.html");
		driver.manage().window().maximize();
		Thread.sleep(1000);	
		
		//javascript alert
		WebElement jsalert=driver.findElement(By.xpath("//span[@id='button1']"));
		jsalert.click();
		Thread.sleep(1000);
		Alert alt=driver.switchTo().alert();
		alt.accept();
		Thread.sleep(3000);
		
		//model popup
		
		driver.findElement(By.xpath("//span[@id='button2']")).click();
		Thread.sleep(2000);	
		driver.findElement(By.xpath("//button[contains(text(), 'Close')]")).click();
		Thread.sleep(2000);	
		
		//confirmational box
		WebElement confalert=driver.findElement(By.xpath("//span[@id='button4']"));
		confalert.click();
		Thread.sleep(3000);
		Alert alt1=driver.switchTo().alert();
		alt1.dismiss();
		Thread.sleep(5000);
		
//		//ajax
//		WebElement promptalert=driver.findElement(By.xpath("//span[@id='button3']]"));
//		promptalert.click();		
//		Thread.sleep(4000);
//		
//		driver.findElement(By.xpath("//span[@id='button1']")).click();
//		Thread.sleep(1000);
//			
//		driver.findElement(By.xpath("//button[contains(text(), 'Close')]")).click();
//		Thread.sleep(2000);	
			

	}

}
