package dropdownPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PrintingAllLinksinPage {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "H:\\Jar files\\Gecko Drivers\\geckodriver-v0.13.0-win64\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.wikipedia.org");
		
		System.out.println("------------Printing all links in page");
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		for(int i=0; i<links.size(); i++)
		{
			System.out.println(links.get(i).getAttribute("href"));
		}
		
		System.out.println("Total links are : " +links.size());

	}

}
