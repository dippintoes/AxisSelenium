package Axis.BSGSolutions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class InvokeEdgeBrowser {

	public static WebDriver driver;

	public static void main(String[] args) {

		System.setProperty("webdriver.edge.driver", "D:\\AXIS_TRAINING\\edgedriver_win64\\msedgedriver.exe");

		WebDriver driver = new EdgeDriver();

		driver.get("https://www.selenium.dev/");
	}


}
