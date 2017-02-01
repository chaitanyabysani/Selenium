package webListenerPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.AbstractWebDriverEventListener;

public class WebListener extends AbstractWebDriverEventListener {
	
	public void afterChangeValueOf(WebElement element, WebDriver driver, java.lang.CharSequence[] keysToSend){
		//Called after WebElement.clear(), WebElement.sendKeys(...)
		System.out.println("Element is cleared or Entered some text in the text box");
	}

	public void afterClickOn(WebElement element, WebDriver driver) {
		//Called after WebElement.click()
		System.out.println("clicked on some element");
		
	}
	
	public void afterFindBy(By by, WebElement element, WebDriver driver) {
		//Called after WebDriver.findElement(...), or WebDriver.findElements(...), or WebElement.findElement(...), or WebElement.findElements(...)
		System.out.println("Found some element");
	}
	
	public void afterNavigateBack(WebDriver driver) {
		//Called after navigate().back()
		System.out.println("Navigate back");
	}
	
	public void afterNavigateForward(WebDriver driver) {
		//Called after navigate().forward()
		System.out.println("Navigate Forward");
	}
	
	public void afterNavigateRefresh(WebDriver driver) {
		//Called after navigate().refresh()
		System.out.println("Refresh the page after navigation");
	}
	
	public void afterNavigateTo(java.lang.String url, WebDriver driver) {
		//Called after get(String url) respectively navigate().to(String url)
		System.out.println("navigate to the specified url page");
	}
	
	public void afterScript(java.lang.String script, WebDriver driver) {
		//Called after RemoteWebDriver.executeScript(java.lang.String, java.lang.Object[])
		System.out.println("After script");
	}
	
	public void beforeChangeValueOf(WebElement element, WebDriver driver, java.lang.CharSequence[] keysToSend){
		//Called before WebElement.clear(), WebElement.sendKeys(...)
		System.out.println("Clear the element Before change value");
	}
	
	public void beforeClickOn(WebElement element, WebDriver driver){
		//Called before WebElement.click()
		System.out.println("click on the element");
	}
	
	public void beforeFindBy(By by, WebElement element, WebDriver driver){
		//Called before WebDriver.findElement(...), or WebDriver.findElements(...), or WebElement.findElement(...), or WebElement.findElements(...)
		System.out.println("Before find by");
	}
	
	public void beforeNavigateBack(WebDriver driver){
		//Called before navigate().back()
		System.out.println("Before Navigate Back");
	}
	
	public void beforeNavigateForward(WebDriver driver){
		//Called before navigate().forward()
		System.out.println("Before navigate forward");
	}
	
	public void beforeNavigateRefresh(WebDriver driver){
		//Called before navigate().refresh()
		System.out.println("Refresh the page before navigation");
	}
	
	public void beforeNavigateTo(java.lang.String url, WebDriver driver){
		//Called before get(String url) respectively navigate().to(String url)
		System.out.println("Before navigate to URL page");
	}
	
	public void beforeScript(java.lang.String script, WebDriver driver){
		//Called before RemoteWebDriver.executeScript(java.lang.String, java.lang.Object[])
		System.out.println("Before Script");
	}
	
	public void onException(java.lang.Throwable throwable, WebDriver driver){
		//Called whenever an exception would be thrown
		System.out.println("on error eception");
	}
}
