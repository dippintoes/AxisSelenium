package PracticeProject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scrolling_around {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\AXIS_TRAINING\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Scrolling/index.html");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		WebElement elementToScrollTo = driver.findElement(By.xpath("//div[@id='zone1']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", elementToScrollTo);
        WebElement elementToHover = driver.findElement(By.xpath("//div[@id='zone1']"));
        Actions actions1 = new Actions(driver);
        actions1.moveToElement(elementToHover).perform();
        Thread.sleep(1000);
        
        WebElement elementToScrollTo1 = driver.findElement(By.xpath("//div[@id='zone2']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", elementToScrollTo1);
        WebElement elementToHover1 = driver.findElement(By.xpath("//div[@id='zone2']"));
        Actions actions2 = new Actions(driver);
        actions2.moveToElement(elementToHover1).perform();
        Thread.sleep(1000);
       
        WebElement elementToScrollTo2 = driver.findElement(By.xpath("//div[@id='zone3']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", elementToScrollTo2);
        WebElement elementToHover3 = driver.findElement(By.xpath("//div[@id='zone3']"));
        Actions actions3 = new Actions(driver);
        actions3.moveToElement(elementToHover3).perform();
        Thread.sleep(1000);
        
        WebElement elementToScrollTo3 = driver.findElement(By.xpath("//div[@id='zone4']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", elementToScrollTo3);
        WebElement elementToHover4 = driver.findElement(By.xpath("//div[@id='zone4']"));
        Actions actions4 = new Actions(driver);
        actions4.moveToElement(elementToHover4).perform();
	}

}
