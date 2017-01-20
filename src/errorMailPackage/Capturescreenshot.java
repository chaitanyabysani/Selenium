package errorMailPackage;
import java.io.File;
import java.io.IOException;

import javax.mail.MessagingException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/* 
 * To run these program, need to 
 * download "mail.jar" file and add to the project
 * Add "SendMailUsingAuthentication.java" program file to the package
 * In Gmail need to enable the "less secure apps"
 * Procedure to enable the "less secure apps" in gmail account:
 * Go to Gmail page
 * Login to the account
 * Click on "My Account" button
 * In "Sign-in  & Security" tab click on "Connected apps & sites"
 * Scroll down the page
 * Enable "Allow less secure apps"
 */
public class Capturescreenshot {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws MessagingException 
	 */
	public static void main(String[] args) throws IOException, MessagingException {
		
		System.setProperty("webdriver.gecko.driver", "H:\\Jar files\\Gecko Drivers\\geckodriver-v0.13.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		SendMailUsingAuthentication mail = new SendMailUsingAuthentication();
		
		driver.get("http://gmail.com");
		
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("H:\\Screenshots\\gmailscreenshot.jpg"));
		
		/*
		 * 
		 * Screenshot in case of an error
		 * 
		 */
		
		
		try{
		driver.findElement(By.xpath("//*[@id='ddjkf']"));
		
		}catch(Throwable t){
			
			FileUtils.copyFile(scrFile, new File("H:\\Screenshots\\emailidField.jpg"));
		mail.postMail(SendMailUsingAuthentication.emailList, SendMailUsingAuthentication.emailSubjectTxt, SendMailUsingAuthentication.emailMsgTxt, SendMailUsingAuthentication.emailFromAddress);
			
		}

	}
	
	

}
