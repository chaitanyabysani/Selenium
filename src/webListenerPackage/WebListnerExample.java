package webListenerPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class WebListnerExample {
	
	private static WebDriver driver;

	public static void main(String[] args) {

		
		System.setProperty("webdriver.gecko.driver","H:\\Jar files\\Gecko Drivers\\geckodriver-v0.13.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();

		EventFiringWebDriver event = new EventFiringWebDriver(driver);
		WebListener eventListener = new WebListener();
		event.register(eventListener);

		// beforeNavigateTo & afterNavigateTo
		event.get("http://www.google.com");

		// beforeNavigateBack & afterNavigateBack
		event.get("http://www.google.com");
		event.get("http://www.bing.com");
		event.navigate().back();

		// beforeNavigateForward & afterNavigateForward
		event.get("http://www.google.com");
		event.get("http://www.bing.com");
		event.navigate().back();
		event.navigate().forward();                   

		// onException
		event.get("http://yahoo.com");
		event.findElement(By.id("Wrong Value"));

		// beforeFindBy & afterFindBy
		event.get("http://yahoo.com");
		event.findElement(By.id("Value"));

		// beforeClickOn & afterClickOn
		event.get("http://yahoo.com");
		event.findElement(By.id("Value")).click();

		// beforeChangeValueOf & afterChangeValueOf
		event.get("http://yahoo.com");
		event.findElement(By.id("Value")).clear();
		event.findElement(By.id("Value")).sendKeys("Seleniumworks");
	}

}

