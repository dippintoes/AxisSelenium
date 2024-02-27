package PracticeProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\AXIS_TRAINING\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Actions/index.html");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		// drag and drop 
		WebElement src = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement destination = driver.findElement(By.xpath("//div[@id='droppable']"));
		Actions builder = new Actions(driver);
		Thread.sleep(3000);	
		builder.dragAndDrop(src, destination).perform();
		Thread.sleep(1000);
		//double click
		
		WebElement elementToDoubleClick = driver.findElement(By.xpath("//div[@id='double-click']")); // Replace with your actual ID
        Actions actions = new Actions(driver);
        actions.doubleClick(elementToDoubleClick).perform();
        Thread.sleep(1000);
        
        //hover over
        
        List<WebElement> elementToHover = driver.findElements(By.xpath("//button[contains(text(),'Hover Over Me')]")); // Replace with your actual ID
        
        for(WebElement wb :elementToHover) {
        	Actions actions1 = new Actions(driver);
            actions1.moveToElement(wb).perform();
            Thread.sleep(1000);
        }
        
      // click and hold
		
      		WebElement elementToClickandHold = driver.findElement(By.xpath("//div[@id='click-box']")); // Replace with your actual ID
            Actions actions3 = new Actions(driver);
            Thread.sleep(1000);
            actions3.clickAndHold(elementToClickandHold).perform();
              
	}

}
