package testScripts;

import org.testng.annotations.Test;

import java.time.Duration;

import org.checkerframework.checker.units.qual.h;
import org.checkerframework.checker.units.qual.m;
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
import objectRepository.MobilePage;
import objectRepository.MonitorPage;

public class MobileTest extends Baseclass {

	@Test
	public void Samsunggalaxys6() throws InterruptedException {
		HomePage homePage = new HomePage(driver);
		MobilePage mobilePage = new MobilePage(driver);

		homePage.getPhonesLink().click();
		mobilePage.getSamsunggalaxys6Link().click();
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

		Reporter.log("Samsung galaxys6 is Purchased", true);

	}

	@Test
	public void Nokialumia1520() throws InterruptedException {
		HomePage homePage = new HomePage(driver);
		MobilePage mobilePage = new MobilePage(driver);

		homePage.getPhonesLink().click();
		mobilePage.getNokialumia1520Link().click();
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

		Reporter.log("Nokia lumia 1520 is Purchased", true);

	}

	@Test
	public void Nexus6() throws InterruptedException {

		HomePage homePage = new HomePage(driver);
		MobilePage mobilePage = new MobilePage(driver);

		homePage.getPhonesLink().click();
		mobilePage.getNexus6Link().click();
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

		Reporter.log("Nexus6 is Purchased", true);

	}

	@Test
	public void Samsunggalaxys7() throws InterruptedException {

		HomePage homePage = new HomePage(driver);
		MobilePage mobilePage = new MobilePage(driver);

		homePage.getPhonesLink().click();
		mobilePage.getSamsunggalaxys7Link().click();
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

		Reporter.log("Samsung galaxys7 is Purchased", true);

	}

	@Test
	public void Iphone632gb6() throws InterruptedException {

		HomePage homePage = new HomePage(driver);
		MobilePage mobilePage = new MobilePage(driver);

		homePage.getPhonesLink().click();
		mobilePage.getIphone632gb6Link().click();
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

		Reporter.log("Iphone6 32gb6 is Purchased", true);

	}

	@Test
	public void Sonyxperiaz5() throws InterruptedException {

		HomePage homePage = new HomePage(driver);
		MobilePage mobilePage = new MobilePage(driver);

		homePage.getPhonesLink().click();
		mobilePage.getSonyxperiaz5Link().click();
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

		Reporter.log("Sony xperia z5 is Purchased", true);

	}

	@Test
	public void HTCOneM9() throws InterruptedException {

		HomePage homePage = new HomePage(driver);
		MobilePage mobilePage = new MobilePage(driver);

		homePage.getPhonesLink().click();
		mobilePage.getHTCOneM9Link().click();
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

		Reporter.log("HTCOne M9 is Purchased", true);

	}

	@Test
	public void Sonyvaioi5() throws InterruptedException {

		HomePage homePage = new HomePage(driver);
		MobilePage mobilePage = new MobilePage(driver);

		homePage.getPhonesLink().click();
		mobilePage.getSonyvaioi5Link().click();
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

		Reporter.log("Sony vaio i5 is Purchased", true);

	}

	@Test
	public void Sonyvaioi7() throws InterruptedException {

		HomePage homePage = new HomePage(driver);
		MobilePage mobilePage = new MobilePage(driver);

		homePage.getPhonesLink().click();
		mobilePage.getSonyvaioi7Link().click();
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

		Reporter.log("Sony vaio i7 is Purchased", true);

	}


	@Test
	public void MacBookairLaptop() throws InterruptedException {
	HomePage homePage = new HomePage(driver);
	LaptopPage laptopPage = new LaptopPage(driver); 
	
	homePage.getLaptopsLink().click();
	laptopPage.getMacBookairLaptop().click();
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

	Reporter.log("MacBook air Laptop is Purchased", true);
	
	}
	
	@Test
	public void Delli78gbLaptop() throws InterruptedException {
	HomePage homePage = new HomePage(driver);
	LaptopPage laptopPage = new LaptopPage(driver); 
	
	homePage.getLaptopsLink().click();
	laptopPage.getDelli78gbLaptop().click();
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

	Reporter.log("Dell i7 8gb Laptop is Purchased", true);

	}
	
	@Test
	public void Dell156InchLaptop() throws InterruptedException {
	HomePage homePage = new HomePage(driver);
	LaptopPage laptopPage = new LaptopPage(driver); 
	
	homePage.getLaptopsLink().click();
	laptopPage.getDell156InchLaptop().click();
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
	
	Reporter.log("Dell 15.6 Inch Laptop is Purchased", true);

	}
	
	@Test
	public void MacBookProLaptop() throws InterruptedException {
	HomePage homePage = new HomePage(driver);
	LaptopPage laptopPage = new LaptopPage(driver); 
	
	homePage.getLaptopsLink().click();
	laptopPage.getMacBookProLaptop().click();
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
	
	Reporter.log("MacBook Pro Laptop is Purchased", true);

	}	
		


	@Test
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