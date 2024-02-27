package PracticeProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class AjaxLoader {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\AXIS_TRAINING\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Ajax-Loader/index.html");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(8000, TimeUnit.MILLISECONDS);
		driver.findElement(By.xpath("//span[@type='button']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[contains(text(), 'Close')]")).click();
        
	}

}
