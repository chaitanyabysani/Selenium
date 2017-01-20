package captureScreenShot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;


/*
 * 
 * Capture the screen shot incase of error
 * 
 */

public class ErrorScreenShot {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "H:\\Jar files\\Gecko Drivers\\geckodriver-v0.13.0-win64\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://gmail.com");
		
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		try{
		driver.findElement(By.xpath("//*[@id='Email']")).sendKeys("automationmails@gmail.com");
		}catch(Throwable t){
			FileUtils.copyFile(srcFile, new File("H:\\Screenshots\\Emailfield.jpg"));
		}
		
		try{
			driver.findElement(By.xpath("//*[@id='nex']")).click();
			}catch(Throwable t){
				FileUtils.copyFile(srcFile, new File("H:\\Screenshots\\NextButton.jpg"));
			}
		
	}
	

}
