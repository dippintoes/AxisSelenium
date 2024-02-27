package PracticeProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Contact_Form {

	public static void FillForm(WebDriver driver, String firstname, String lastname, String email, String comments) throws InterruptedException{
		driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys(firstname);
		driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys(lastname);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(email);
		driver.findElement(By.xpath("//textarea[@name='message']")).sendKeys(comments);
		Thread.sleep(2000);
	}
	
	public static void TestSubmission(WebDriver driver, String firstname, String lastname, String email, String comments) throws InterruptedException{
		FillForm(driver,firstname,lastname,email,comments);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(2000);
		driver.get("https://webdriveruniversity.com/Contact-Us/contactus.html");
	}
	
	public static void TestResetButton(WebDriver driver, String firstname, String lastname, String email, String comments) throws InterruptedException{
		FillForm(driver,firstname,lastname,email,comments);
		driver.findElement(By.xpath("//input[@type='reset']")).click();
	}
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\AXIS_TRAINING\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Contact-Us/contactus.html");
		driver.manage().window().maximize();
		Thread.sleep(1000);	
		//Verify successful submission of the contact form with valid inputs
		TestSubmission(driver,"John", "Doe", "John.doe@gmail.com","This is a positive test.");
		Thread.sleep(2000);
		//Verify the reset functionality of the contact form
		TestResetButton(driver,"John", "Doe", "John.doe@gmail.com","Testing reset functionality.");
		Thread.sleep(2000);	
		//Verify error message for submitting the form without filling mandatory fields
		TestSubmission(driver,"", "Doe", "John.doe@gmail.com","Testing without firstname.");
		Thread.sleep(2000);	
		//Verify handling of invalid email format
		TestSubmission(driver,"John", "Doe", "Invalid_Email","Testing invalid email format.");
	}
	
}

