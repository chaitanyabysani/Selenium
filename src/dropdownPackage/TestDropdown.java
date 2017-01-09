package dropdownPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TestDropdown {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "H:\\Jar files\\Gecko Drivers\\geckodriver-v0.13.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.wikipedia.org");

		Select select = new Select(driver.findElement(By.xpath("//*[@id='searchLanguage']")));
		select.selectByValue("it");

		List<WebElement> options = select.getOptions();
		System.out.println(options.size());

		for(int i=0; i<options.size(); i++)
		{
			System.out.println(options.get(i).getText());
		}

	}

}
