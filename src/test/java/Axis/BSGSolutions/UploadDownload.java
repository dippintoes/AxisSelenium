package Axis.BSGSolutions;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadDownload {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\AXIS_TRAINING\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		
		WebElement upload = driver.findElement(By.xpath("//input[@name='upload']"));
		
		upload.sendKeys("C:\\Users\\Lenovo\\Pictures\\affirmations.PNG");
		
		Thread.sleep(3000);
		
		WebElement download = driver.findElement(By.xpath("//input[@name='download']"));
		
		download.click();
		
		Thread.sleep(3000);
		
		
		File file=new File("C:\\Downloads\\affirmations.PNG");
		
		if(file.exists()) {
			System.out.println("File found");
		}
		else {
			System.out.println("File not found");
		}
		
	
	}

}
