package alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PromptAlerts {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "H:\\Jar files\\Gecko Drivers\\geckodriver-v0.13.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://toolsqa.wpengine.com/handling-alerts-using-selenium-webdriver/");
		driver.findElement(By.xpath("html/body/div[1]/div[5]/div[2]/div/div/p[11]/button")).click();
		
		Alert promptAlert = driver.switchTo().alert();
		String alerttext = promptAlert.getText();
		System.out.println("Alert Text is :" +alerttext);
		promptAlert.sendKeys("Yes");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};
		promptAlert.accept();
	}

}
