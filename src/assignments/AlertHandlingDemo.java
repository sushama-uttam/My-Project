package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilities.SeleniumUtility;

import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.Alert;

public class AlertHandlingDemo {
	public static void main(String[] args) throws NoAlertPresentException, InterruptedException {
		SeleniumUtility s1 = new SeleniumUtility();
		WebDriver driver = s1.setUp("chrome", "https://www.browserstack.com/users/sign_up");

		driver.findElement(By.id("user_full_name")).sendKeys("sushama");
		driver.findElement(By.id("user_email_login")).sendKeys("sushama.salokhe@gmail.com");
		driver.findElement(By.id("user_password")).sendKeys("dhruv@18");
		driver.findElement(By.xpath("//*[@id=\"tnc_checkbox\"]")).click();
		driver.findElement(By.id("user_submit")).click();

		Thread.sleep(5000);

		Alert alert = driver.switchTo().alert(); // switch to alert

		String alertMessage = driver.switchTo().alert().getText(); // capture alert message

		System.out.println(alertMessage); // Print Alert Message
		Thread.sleep(5000);
		alert.accept();
	}
}
