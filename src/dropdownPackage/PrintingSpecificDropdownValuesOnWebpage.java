package dropdownPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PrintingSpecificDropdownValuesOnWebpage {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "H:\\Jar files\\Gecko Drivers\\geckodriver-v0.13.0-win64\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.wikipedia.org");
		
		System.out.println("------------Printing Specific Dropdown values on webpage");
		
		WebElement dropdown = driver.findElement(By.xpath("//*[@id='searchLanguage']"));
		List<WebElement> options = dropdown.findElements(By.tagName("option"));
		System.out.println(options.size());
		
		for(int i=0; i<options.size(); i++)
		{
			System.out.println(options.get(i).getText());
		}

	}

}
