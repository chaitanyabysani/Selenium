package alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ConfirmationAlert {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "H:\\Jar files\\Gecko Drivers\\geckodriver-v0.13.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://toolsqa.wpengine.com/handling-alerts-using-selenium-webdriver/");
		driver.findElement(By.xpath("html/body/div[1]/div[5]/div[2]/div/div/p[8]/button")).click();
		
		Alert confirmationAlert = driver.switchTo().alert();
		String alerttext = confirmationAlert.getText();
		System.out.println("Alert Text is :" +alerttext);
		confirmationAlert.dismiss();

	}

}
