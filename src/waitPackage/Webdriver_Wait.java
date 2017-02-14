package waitPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;


public class Webdriver_Wait {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "H:\\Jar files\\Gecko Drivers\\geckodriver-v0.13.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://google.com");
		driver.findElement(By.name("q")).sendKeys("selenium");

		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(10, TimeUnit.SECONDS)
				.pollingEvery(2, TimeUnit.SECONDS)
				.ignoring(NoSuchElementException.class)
				.withMessage("User defined wait timed out after 10 seconds");
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='sbse3']/div[2]"))).click();


	}
}
