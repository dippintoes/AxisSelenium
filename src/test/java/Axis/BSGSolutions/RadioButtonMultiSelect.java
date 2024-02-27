package Axis.BSGSolutions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonMultiSelect {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\AXIS_TRAINING\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.seleniumeasy.com/basic-radiobutton-demo.html");
		driver.manage().window().maximize();
		List <WebElement> allradio = driver.findElements(By.xpath("//input[@name='ageGroup']"));
		
		Thread.sleep(3000);
		
		for(WebElement wb: allradio) {
			wb.click();
		}
		
	}

}
