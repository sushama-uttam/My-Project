package assignments;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import utilities.SeleniumUtility;

public class Scroll_Test {

	public static void main(String[] args) {

		SeleniumUtility s1 = new SeleniumUtility();
		WebDriver driver = s1.setUp("chrome", "www.javatpoint.com");

//		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
//		capabilities.setCapability("marionette", true);

		// Scroll down the webpage by 4500 pixels
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("scrollBy(0, 4500)");
		driver.close();

	}
}
