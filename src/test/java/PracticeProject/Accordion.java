package PracticeProject;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Accordion {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\AXIS_TRAINING\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Accordion/index.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[@id='manual-testing-accordion']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@id='cucumber-accordion']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@id='automation-accordion']")).click();
		Thread.sleep(6000);

		driver.findElement(By.xpath("//button[@id='click-accordion']")).click();
		
	}

}
