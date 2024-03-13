package testScripts;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericlibraries.Baseclass;
import genericlibraries.fileUtility;
import objectRepository.HomePage;
import objectRepository.LaptopPage;
import objectRepository.MonitorPage;

public class MonitorTest extends Baseclass {


	@Test (groups= "smoke")
	public void Applemonitor24() throws InterruptedException {
	HomePage homePage = new HomePage(driver);
	MonitorPage monitorPage = new MonitorPage(driver); 
	
	homePage.getMonitorsLink().click();
	monitorPage.getApplemonitor24().click();
	homePage.getAddtocartLink().click();
	Thread.sleep(2000);
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	wait.until(ExpectedConditions.alertIsPresent());
	switchToAlertAndAccept(driver);
	
	homePage.getCartLink().click();
	homePage.getPlaceOrderButton().click();
	Thread.sleep(2000);
	homePage.getNameTextField().sendKeys(fileUtility.getproperty("name"));
	homePage.getCountryTextField().sendKeys(fileUtility.getproperty("country"));
	homePage.getCityTextField().sendKeys(fileUtility.getproperty("city"));
	homePage.getCreditcardTextField().sendKeys(fileUtility.getproperty("creditcard"));
	homePage.getMonthTextField().sendKeys(fileUtility.getproperty("month"));
	homePage.getYearTextField().sendKeys(fileUtility.getproperty("year"));
	homePage.getPurchaseButton().click();
	Thread.sleep(2000);
	homePage.getOKButton().click();

	Reporter.log("Apple Monitor24 is Purchased", true);
	
}
	
	@Test
	public void ASUSFullHD() throws InterruptedException {
	HomePage homePage = new HomePage(driver);
	MonitorPage monitorPage = new MonitorPage(driver); 
	
	homePage.getMonitorsLink().click();
	monitorPage.getASUSFullHD().click();
	homePage.getAddtocartLink().click();
	Thread.sleep(2000);
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	wait.until(ExpectedConditions.alertIsPresent());
	switchToAlertAndAccept(driver);
	
	homePage.getCartLink().click();
	homePage.getPlaceOrderButton().click();
	Thread.sleep(2000);
	homePage.getNameTextField().sendKeys(fileUtility.getproperty("name"));
	homePage.getCountryTextField().sendKeys(fileUtility.getproperty("country"));
	homePage.getCityTextField().sendKeys(fileUtility.getproperty("city"));
	homePage.getCreditcardTextField().sendKeys(fileUtility.getproperty("creditcard"));
	homePage.getMonthTextField().sendKeys(fileUtility.getproperty("month"));
	homePage.getYearTextField().sendKeys(fileUtility.getproperty("year"));
	homePage.getPurchaseButton().click();
	Thread.sleep(2000);
	homePage.getOKButton().click();
	
	Reporter.log("ASUS Full HD is Purchased", true);
	}
}