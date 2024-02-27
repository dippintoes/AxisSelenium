package PracticeProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\AXIS_TRAINING\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Datepicker/index.html");
		driver.manage().window().maximize();
		Thread.sleep(1000);	
		
		
		WebElement Date = driver.findElement(By.xpath("//div[@id='datepicker']"));
		Thread.sleep(3000);	
		Date.click();
		
		WebElement PickedDate = driver.findElement(By.xpath("//tbody/tr[5]/td[4]"));
		Thread.sleep(3000);	
		PickedDate.click();
	}

}
