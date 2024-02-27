package PracticeProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdon_radio {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\AXIS_TRAINING\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);	
		
		//dropdown
		
		WebElement dropdownElement = driver.findElement(By.xpath("//select[@id='dropdowm-menu-1']"));
        Select dropdown = new Select(dropdownElement);
        Thread.sleep(500);	
        dropdown.selectByVisibleText("Python");
        
        Thread.sleep(1000);	
        
        WebElement dropdownElement1 = driver.findElement(By.xpath("//select[@id='dropdowm-menu-2']"));
        Select dropdown1 = new Select(dropdownElement1);
        Thread.sleep(500);	
        dropdown1.selectByVisibleText("Maven");
        
        Thread.sleep(1000);	
        
        WebElement dropdownElement2 = driver.findElement(By.xpath("//select[@id='dropdowm-menu-3']"));
        Select dropdown2 = new Select(dropdownElement2);
        Thread.sleep(500);	
        dropdown2.selectByVisibleText("JQuery");

        Thread.sleep(1000);	
        
        //checkboxes
        
        List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
        
        for (WebElement checkbox : checkboxes) {
            if (!checkbox.isSelected()) {
            	Thread.sleep(500);	
            	checkbox.click();
            } else {
            	Thread.sleep(500);	
                checkbox.click();
            }
        }
        
        //radio
        
        List <WebElement> allradio = driver.findElements(By.xpath("//input[@type='radio']"));
		
		Thread.sleep(3000);
		
		for(WebElement wb: allradio) {
			wb.click();
			Thread.sleep(500);
		}
		
		//dropdown disabled
        
		Thread.sleep(1000);	
        
        WebElement dropdownElement4 = driver.findElement(By.xpath("//select[@id='fruit-selects']"));
        Select dropdown4 = new Select(dropdownElement4);
        Thread.sleep(500);	
        dropdown4.selectByVisibleText("Pear");
		
        
	} 
	
}

