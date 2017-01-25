package alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SimpleAlert {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "H:\\Jar files\\Gecko Drivers\\geckodriver-v0.13.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://toolsqa.wpengine.com/handling-alerts-using-selenium-webdriver/");
		driver.findElement(By.xpath("html/body/div[1]/div[5]/div[2]/div/div/p[4]/button")).click();
		
		Alert simpleAlert = driver.switchTo().alert();
		String alerttext = simpleAlert.getText();
		System.out.println("Alert Text is :" +alerttext);
		simpleAlert.accept();
	}

}
