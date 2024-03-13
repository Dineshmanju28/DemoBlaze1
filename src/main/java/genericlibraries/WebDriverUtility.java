package genericlibraries;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import objectRepository.HomePage;


public class WebDriverUtility implements FrameworkConstants {

	/**
	*
	*This class created for all reusable methods
	*@author dinesh
	*/

	public static Actions action ;
	public static JavascriptExecutor je ;
	public static ExtentReports report ;
	public static ExtentTest test ;


	public static void SelectOptionsByIndex (WebElement dropdown, int index) {
	Select select = new Select(dropdown);
	select.selectByIndex(index);
	 }
	
	public static void SelectOptionsByvalue (WebElement dropdown, String value) {
	Select select = new Select(dropdown);
	select.selectByValue(value);
	 }
	
	public static void SelectOptionsByVisibleText (WebElement dropdown, String text) {
	Select select = new Select(dropdown);
	select.selectByVisibleText(text);
	 }	


//switch to window using title
public static void switchToWindowByUrl(WebDriver driver, String title) {
	Set<String> allwindows = driver.getWindowHandles();
	for (String Window : allwindows) {
		driver.switchTo().window(Window);
		if (driver.getTitle().contains(title)){
			break;
		
	}}}

//switch to window using URL
public static void switchToWindowByTitle(WebDriver driver, String Url) {
	Set<String> allwindows = driver.getWindowHandles();
	for (String Window : allwindows) {
		driver.switchTo().window(Window);
		if (driver.getTitle().contains(Url)){
			break;
		
	}}}

//switch to frame using Index
public static void switchToFrameUsingIndex(WebDriver driver, int index) {
driver.switchTo().frame(index);
}

//switch to frame using name or ID
public static void switchToFrameByNameOrId(WebDriver driver, String NameOrId ) {
driver.switchTo().frame(NameOrId);
}

//switch to frame using webelement
public static void switchToFrameByElement(WebDriver driver, WebElement frameElement ) {
driver.switchTo().frame(frameElement);
}


//all webdriver methods
public static void clickElement(WebElement element ) {
element.click();
}

public static void enterText(WebElement element, String text ) {
element.sendKeys(text);
}
//method to take screenshot


public static String getScreenshotOfWebpage(WebDriver driver) {
TakesScreenshot ts= (TakesScreenshot) driver;
File temp = ts.getScreenshotAs(OutputType.FILE);

String imagePath = SCREENSHOT_PATH+SystemDate()+".png";
File perm = new File(imagePath);
	try {
		FileHandler.copy(temp,perm);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		return "."+imagePath;
	}
	return "."+imagePath;
}

public static String getScreenshotOfWebElement(WebElement element) {
File temp = element.getScreenshotAs(OutputType.FILE);
String imagePath =  SCREENSHOT_PATH+SystemDate()+".png";
File perm = new File(imagePath);

try {
	FileHandler.copy(temp,perm);
} catch (Exception e) {
	// TODO: handle exception
	e.printStackTrace();
	return "."+imagePath;
}
return imagePath;
}

//method to handle alert
public static void switchToAlertAndAccept(WebDriver driver) {
driver.switchTo().alert().accept();
}

public static void switchToAlertAndDismiss(WebDriver driver) {
driver.switchTo().alert().dismiss();
}

public static void switchToAlertAndGetText(WebDriver driver) {
driver.switchTo().alert().getText();
}

public static void switchToAlertAndSendText(WebDriver driver, String text) {
driver.switchTo().alert().sendKeys(text);
}

//method to handle mouse actions
public static void mouseHover (WebDriver driver, WebElement element) {
Actions action = new Actions(driver);
action.moveToElement(element).click().perform();
}

public static void mouseclick (WebDriver driver, WebElement element) {
Actions action = new Actions(driver);
action.click(element).click().perform();
}

public static void rightClick (WebDriver driver, WebElement element) {
Actions action = new Actions(driver);
action.contextClick(element).click().perform();
}

//Get the System date&time
public static String SystemDate () {
	return LocalDateTime.now().toString().replace(":", "_").replace("-", "_");

}


/**
*
*Methods to handle hidden or disabled button
*
*/

public static void enterTextToHiddenOrDisabledElement (WebDriver driver, WebElement element, String value) {
	JavascriptExecutor je = (JavascriptExecutor) driver;
	je.executeScript("arguments[0].value='"+value+"';", element );
}

/**
*
*Methods to scroll the windows by given X and Y value
*
*/

public static void scrollByXAndY (WebDriver driver, int X, int Y) {
	JavascriptExecutor je = (JavascriptExecutor) driver;
	je.executeScript("window.srollBy("+X+","+Y+");");
	}


/**
*
*Methods to scroll the windows to  given X and Y value
*
*/

public static void scrollToXAndY(WebDriver driver, int X, int Y) {
	JavascriptExecutor je = (JavascriptExecutor) driver;
	je.executeScript("window.srollTo("+X+","+Y+");");
	}


/**
*
*Methods to scroll the windows to the top of the element
*
*/

public static void scrollIntoView(WebDriver driver, WebElement element, boolean position) {
	JavascriptExecutor je = (JavascriptExecutor) driver;
	je.executeScript("arguments[0].scrollIntoView=("+position+");",element);
	}



/**
*
*Methods initialize objects like Actions and JavascriptExecutor
*
*/

public static void initObjects(WebDriver driver) {
	action= new Actions(driver);
	je= (JavascriptExecutor) driver; 
	}
}
