package PracticeProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\AXIS_TRAINING\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/IFrame/index.html");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		WebElement frame1 = driver.findElement(By.xpath("//li[@data-slide-to='1']"));
		driver.switchTo().frame(frame1);
		
		WebElement frame2 = driver.findElement(By.xpath("//iframe[@id='frame']"));
		driver.switchTo().frame(frame2);
	}
}
