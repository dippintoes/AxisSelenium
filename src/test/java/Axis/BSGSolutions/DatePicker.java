package Axis.BSGSolutions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\AXIS_TRAINING\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);	
		WebElement Date = driver.findElement(By.xpath("//p[@data-cy='departureDate']"));
		
		Thread.sleep(3000);	
		Date.click();
		Thread.sleep(3000);	
		WebElement PickedDate = driver.findElement(By.xpath("//div[@aria-label='Wed Feb 28 2024']"));
		
		PickedDate.click();
	}
}
