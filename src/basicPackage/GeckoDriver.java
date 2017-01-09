package basicPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


/* Selenium 3 does not support default Firefox with in it. Now onwards Selenium will suport Marionette. 
 * It is the next generation of FirefoxDriver and it is nearing completion.
 * What is Gecko and GeckoDriver?
 * Gecko is a web browser engine used in many applications developed by Mozilla Foundation and the Mozilla Corporation.
 * Gecko Driver is the link between your tests in Selenium and the Firefox browser. 
 * GeckoDriver is a proxy for using W3C WebDriver-compatible clients to interact with Gecko-based browsers 
 * i.e. Mozilla Firefox in this case. 
 * As Selenium 3 will not have any native implementation of FF, we have to direct all the driver commands through Gecko Driver. 
 * Gecko Driver is an executable file that you need to have in one of the system path before starting your tests. 
 * Firefox browser implements the WebDriver protocol using an executable called GeckoDriver.exe. 
 * This executable starts a server on your system. 
 * All your tests communicate to this server to run your tests. 
 * It translates calls into the Marionette automation protocol by acting as a proxy between the local and remote ends. 
 * It is something similar to what we discussed in the chapter on Internet explorer & Chrome. 
 * Gecko Driver different versions can be downloaded from "https://github.com/mozilla/geckodriver/releases". 
 * I suggest you to use the latest version.*/

public class GeckoDriver {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "H:\\Jar files\\Gecko Drivers\\geckodriver-v0.13.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver(); 
		driver.get("http://www.gmail.com");		

	}

}
