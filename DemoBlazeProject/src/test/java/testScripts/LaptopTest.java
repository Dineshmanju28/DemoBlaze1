package testScripts;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import java.time.Duration;

import org.checkerframework.checker.units.qual.h;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import genericlibraries.Baseclass;
import genericlibraries.fileUtility;
import objectRepository.HomePage;
import objectRepository.LaptopPage;

public class LaptopTest extends Baseclass {

	ExtentReports report = new ExtentReports("./Reports/report.html");
	ExtentTest test = report.startTest("Laptop page test ");
	
	@Test
	public void SelectSonyvaioi5() throws InterruptedException {
	HomePage homePage = new HomePage(driver);
	LaptopPage laptopPage = new LaptopPage(driver); 
	
	homePage.getLaptopsLink().click();
	laptopPage.getSonyvaioi5Laptop().click();
	test.log(LogStatus.INFO, "Sony vaio i5 Laptop is selected");
	homePage.getAddtocartLink().click();
	driver.navigate().back();
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
	test.log(LogStatus.PASS, "Sony vaio i5 Laptop is Purchased");

	hi
	
	report.endTest(test);
	report.flush();
	
}
	
	@Test
	public void SelectSonyvaioi7() throws InterruptedException {
	HomePage homePage = new HomePage(driver);
	LaptopPage laptopPage = new LaptopPage(driver); 
	
	homePage.getLaptopsLink().click();
	laptopPage.getSonyvaioi7Laptop().click();
	homePage.getAddtocartLink().click();
	driver.navigate().back();
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
	
}
	
	@Test
	public void SelectgetMacBookairLaptop() throws InterruptedException {
	HomePage homePage = new HomePage(driver);
	LaptopPage laptopPage = new LaptopPage(driver); 
	
	homePage.getLaptopsLink().click();
	laptopPage.getMacBookairLaptop().click();
	homePage.getAddtocartLink().click();
	driver.navigate().back();
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

	
	}
	
	@Test
	public void SelectDelli78gbLaptop() throws InterruptedException {
	HomePage homePage = new HomePage(driver);
	LaptopPage laptopPage = new LaptopPage(driver); 
	
	homePage.getLaptopsLink().click();
	laptopPage.getDelli78gbLaptop().click();
	homePage.getAddtocartLink().click();
	driver.navigate().back();
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

	}
	
	@Test
	public void SelectDell156InchLaptop() throws InterruptedException {
	HomePage homePage = new HomePage(driver);
	LaptopPage laptopPage = new LaptopPage(driver); 
	
	homePage.getLaptopsLink().click();
	laptopPage.getDell156InchLaptop().click();
	homePage.getAddtocartLink().click();
	driver.navigate().back();
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
	
	}
	
	@Test
	public void SelectMacBookProLaptop() throws InterruptedException {
	HomePage homePage = new HomePage(driver);
	LaptopPage laptopPage = new LaptopPage(driver); 
	
	homePage.getLaptopsLink().click();
	laptopPage.getMacBookProLaptop().click();
	homePage.getAddtocartLink().click();
	driver.navigate().back();
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
	
	
	}}
	
	
