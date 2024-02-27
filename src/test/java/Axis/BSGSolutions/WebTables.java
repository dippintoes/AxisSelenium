package Axis.BSGSolutions;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebTables {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\AXIS_TRAINING\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/tables");
		driver.manage().window().maximize();
		
		//implicit wait will wait for all the elements in the script to load before it could throw element not found execution
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.MILLISECONDS);
		
		Thread.sleep(1000);	
		
		List<WebElement> rowno = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr"));
		
		int rowCount = rowno.size();
		
	    System.out.println("No of rows: "+rowCount);
	    
	    List<WebElement> collno = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr[1]/td"));
		
		int collCount = collno.size();
		
	    System.out.println("No of columns: "+collCount);
	    
		//explicit wait is for a particular element only which we know will take time suppose integrating with some other application, etc.
	    //using web driver wait
	    
	    WebDriverWait wait = new WebDriverWait(driver, 30);
	    
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@id = 'table1']/tbody/tr[4]/td[3]")));
	    
	    WebElement celldata = driver.findElement(By.xpath("//table[@id='table1']/tbody/tr[4]/td[3]"));
	    
	    String text = celldata.getText();
	    
	    String expectedText = "tconway@earthlink.net";
	    
	    if(text.equals(expectedText)) {
	    	System.out.println("The data is correct.");
	    }
	    else{
	    	System.out.println("The data is incorrect.");
	    }
			
	}

}
