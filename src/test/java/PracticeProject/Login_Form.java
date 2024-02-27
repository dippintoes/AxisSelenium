package PracticeProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_Form {

	public static void FillForm(WebDriver driver, String username, String password) throws InterruptedException{
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
		Thread.sleep(2000);
	}
	
	public static void TestSubmission(WebDriver driver, String username, String password) throws InterruptedException{
		try {
			FillForm(driver,username,password);
			driver.findElement(By.xpath("//button[@type='submit']")).click();
		}
		catch(Exception e) {
			driver.get("https://webdriveruniversity.com/Login-Portal/index.html");
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\AXIS_TRAINING\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Login-Portal/index.html");
		driver.manage().window().maximize();
		Thread.sleep(1000);	
		//Verify the Login Functionality for valid credentials
		TestSubmission(driver,"webdriver", "webdriver123");
		Thread.sleep(2000);
		//Verify the Login Functionality for mandatory fields
		TestSubmission(driver,"webdriver", "");
		Thread.sleep(2000);	
		//Verify the Login Functionality for invalid credentials
		TestSubmission(driver,"123", "webdriver");
		Thread.sleep(2000);	
		//Verify the Login Functionality for invalid credentials
		TestSubmission(driver,"webdriver", "123");
		Thread.sleep(2000);	
	}
	
}

