package Axis.BSGSolutions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\AXIS_TRAINING\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/drag_and_drop");
		driver.manage().window().maximize();
		Thread.sleep(3000);	
		
		WebElement src = driver.findElement(By.xpath("//div[@id='column-a']"));
		 
		WebElement destination = driver.findElement(By.xpath("//div[@id='column-b']"));
				
		Actions builder = new Actions(driver);
		
		Thread.sleep(3000);	
		
		builder.dragAndDrop(src, destination).perform();
		
		System.out.println("The items are dragged and dropped");
		
	}

}
