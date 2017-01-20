package captureScreenShot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasicCapture {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.gecko.driver", "H:\\Jar files\\Gecko Drivers\\geckodriver-v0.13.0-win64\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://gmail.com");

		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile, new File("H:\\Screenshots\\Screenshot.jpg"));
	}

}
