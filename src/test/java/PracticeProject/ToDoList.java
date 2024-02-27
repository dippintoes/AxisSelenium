package PracticeProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class ToDoList {
	
	public static void AddNewTask(WebDriver driver, String taskname) throws InterruptedException {
		WebElement ele= driver.findElement(By.xpath("//body/div[@id='container']/input[1]"));
		ele.sendKeys(taskname);
		ele.sendKeys("\uE007");
		Thread.sleep(2000);
	}
	
	public static void MarktaskAsDone(WebDriver driver,String taskname) throws InterruptedException {
		driver.findElement(By.xpath("//li[contains(text(), '" + taskname + "')]")).click();
		Thread.sleep(2000);
	}
	
	public static void DeleteExistingTask(WebDriver driver,String taskname) throws InterruptedException {
		
		WebElement del = driver.findElement(By.xpath("//li[contains(text(), '" + taskname + "')]"));
		Actions actions = new Actions(driver);
	    actions.moveToElement(del).perform();
	    WebElement subElement = del.findElement(By.xpath("//body/div[@id='container']/ul[1]/li[4]/span[1]/i[1]")); 
        subElement.click();

		Thread.sleep(2000);
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\AXIS_TRAINING\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/To-Do-List/index.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);	
		
		AddNewTask(driver, "Buy groceries");
		MarktaskAsDone(driver, "Buy groceries");
		DeleteExistingTask(driver, "Buy groceries");
	}

}
