package PracticeProject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class File_Upload {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\AXIS_TRAINING\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/File-Upload/index.html");
		driver.manage().window().maximize();
		Thread.sleep(1000);	
		
		WebElement upload = driver.findElement(By.xpath("//input[@id='myFile']"));
		upload.sendKeys("C:\\Users\\Lenovo\\Pictures\\affirmations.PNG");
		
		driver.findElement(By.xpath("//input[@id='submit-button']")).click();
		
		Thread.sleep(3000);
		Alert alt=driver.switchTo().alert();
		alt.accept();
	}

}
