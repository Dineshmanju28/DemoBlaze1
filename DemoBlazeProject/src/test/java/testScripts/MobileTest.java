package testScripts;

import org.testng.annotations.Test;

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



public class MobileTest extends Baseclass {
	
	
	@Test
	public void SelectSamsunggalaxys6() throws InterruptedException  {
		
		HomePage homePage= new HomePage(driver);
		homePage.getSamsunggalaxys6Link().click();
		homePage.getAddtocartLink().click();
		driver.navigate().back();
		homePage.getCartLink().click();
		homePage.getPlaceOrderButton().click();
		homePage.getNameTextField().sendKeys(fileUtility.getproperty("name"));
		homePage.getCountryTextField().sendKeys(fileUtility.getproperty("country"));
		homePage.getCityTextField().sendKeys(fileUtility.getproperty("city"));
		homePage.getCreditcardTextField().sendKeys(fileUtility.getproperty("creditcard"));
		homePage.getMonthTextField().sendKeys(fileUtility.getproperty("month"));
		homePage.getYearTextField().sendKeys(fileUtility.getproperty("year"));
		homePage.getPurchaseButton().click();
		homePage.getOKButton().click();
		homePage.getCloseButton().click();
		
	}

@Test
public void SelectNokialumia1520() throws InterruptedException  {
	
	HomePage homePage= new HomePage(driver);
	homePage.getNokialumia1520Link().click();
	homePage.getAddtocartLink().click();
	driver.navigate().back();
	homePage.getCartLink().click();
	homePage.getPlaceOrderButton().click();
	homePage.getNameTextField().sendKeys(fileUtility.getproperty("name"));
	homePage.getCountryTextField().sendKeys(fileUtility.getproperty("country"));
	homePage.getCityTextField().sendKeys(fileUtility.getproperty("city"));
	homePage.getCreditcardTextField().sendKeys(fileUtility.getproperty("creditcard"));
	homePage.getMonthTextField().sendKeys(fileUtility.getproperty("month"));
	homePage.getYearTextField().sendKeys(fileUtility.getproperty("year"));
	homePage.getPurchaseButton().click();
	homePage.getOKButton().click();
	homePage.getCloseButton().click();

	}


@Test
public void SelectNexus6() throws InterruptedException  {
	
	HomePage homePage= new HomePage(driver);
	homePage.getNexus6Link().click();
	homePage.getAddtocartLink().click();
	driver.navigate().back();
	homePage.getCartLink().click();
	homePage.getPlaceOrderButton().click();
	homePage.getNameTextField().sendKeys(fileUtility.getproperty("name"));
	homePage.getCountryTextField().sendKeys(fileUtility.getproperty("country"));
	homePage.getCityTextField().sendKeys(fileUtility.getproperty("city"));
	homePage.getCreditcardTextField().sendKeys(fileUtility.getproperty("creditcard"));
	homePage.getMonthTextField().sendKeys(fileUtility.getproperty("month"));
	homePage.getYearTextField().sendKeys(fileUtility.getproperty("year"));
	homePage.getPurchaseButton().click();
	homePage.getOKButton().click();
	homePage.getCloseButton().click();

	}

@Test
public void SelectSamsunggalaxys7() throws InterruptedException  {
	
	HomePage homePage= new HomePage(driver);
	homePage.getSamsunggalaxys7Link().click();
	homePage.getAddtocartLink().click();
	driver.navigate().back();
	homePage.getCartLink().click();
	homePage.getPlaceOrderButton().click();
	homePage.getNameTextField().sendKeys(fileUtility.getproperty("name"));
	homePage.getCountryTextField().sendKeys(fileUtility.getproperty("country"));
	homePage.getCityTextField().sendKeys(fileUtility.getproperty("city"));
	homePage.getCreditcardTextField().sendKeys(fileUtility.getproperty("creditcard"));
	homePage.getMonthTextField().sendKeys(fileUtility.getproperty("month"));
	homePage.getYearTextField().sendKeys(fileUtility.getproperty("year"));
	homePage.getPurchaseButton().click();
	homePage.getOKButton().click();
	homePage.getCloseButton().click();

	}

@Test
public void SelectIphone632gb6() throws InterruptedException  {
	
	HomePage homePage= new HomePage(driver);
	homePage.getIphone632gb6Link().click();
	homePage.getAddtocartLink().click();
	driver.navigate().back();
	homePage.getCartLink().click();
	homePage.getPlaceOrderButton().click();
	homePage.getNameTextField().sendKeys(fileUtility.getproperty("name"));
	homePage.getCountryTextField().sendKeys(fileUtility.getproperty("country"));
	homePage.getCityTextField().sendKeys(fileUtility.getproperty("city"));
	homePage.getCreditcardTextField().sendKeys(fileUtility.getproperty("creditcard"));
	homePage.getMonthTextField().sendKeys(fileUtility.getproperty("month"));
	homePage.getYearTextField().sendKeys(fileUtility.getproperty("year"));
	homePage.getPurchaseButton().click();
	homePage.getOKButton().click();
	homePage.getCloseButton().click();

	}

@Test
public void SelectSonyxperiaz5Link() throws InterruptedException  {
	
	HomePage homePage= new HomePage(driver);
	homePage.getSonyxperiaz5Link().click();
	homePage.getAddtocartLink().click();
	driver.navigate().back();
	homePage.getCartLink().click();
	homePage.getPlaceOrderButton().click();
	homePage.getNameTextField().sendKeys(fileUtility.getproperty("name"));
	homePage.getCountryTextField().sendKeys(fileUtility.getproperty("country"));
	homePage.getCityTextField().sendKeys(fileUtility.getproperty("city"));
	homePage.getCreditcardTextField().sendKeys(fileUtility.getproperty("creditcard"));
	homePage.getMonthTextField().sendKeys(fileUtility.getproperty("month"));
	homePage.getYearTextField().sendKeys(fileUtility.getproperty("year"));
	homePage.getPurchaseButton().click();
	homePage.getOKButton().click();
	homePage.getCloseButton().click();

	}

@Test 
public void SelectHTCOneM9Link() throws InterruptedException  {
	
	HomePage homePage= new HomePage(driver);
	homePage.getHTCOneM9Link().click();
	homePage.getAddtocartLink().click();
	driver.navigate().back();
	homePage.getCartLink().click();
	homePage.getPlaceOrderButton().click();
	homePage.getNameTextField().sendKeys(fileUtility.getproperty("name"));
	homePage.getCountryTextField().sendKeys(fileUtility.getproperty("country"));
	homePage.getCityTextField().sendKeys(fileUtility.getproperty("city"));
	homePage.getCreditcardTextField().sendKeys(fileUtility.getproperty("creditcard"));
	homePage.getMonthTextField().sendKeys(fileUtility.getproperty("month"));
	homePage.getYearTextField().sendKeys(fileUtility.getproperty("year"));
	homePage.getPurchaseButton().click();
	homePage.getOKButton().click();
	homePage.getCloseButton().click();

	}

@Test
public void SelectSonyvaioi5Link() throws InterruptedException  {
	
	HomePage homePage= new HomePage(driver);
	homePage.getSonyvaioi5Link().click();
	homePage.getAddtocartLink().click();
	driver.navigate().back();
	homePage.getCartLink().click();
	homePage.getPlaceOrderButton().click();
	homePage.getNameTextField().sendKeys(fileUtility.getproperty("name"));
	homePage.getCountryTextField().sendKeys(fileUtility.getproperty("country"));
	homePage.getCityTextField().sendKeys(fileUtility.getproperty("city"));
	homePage.getCreditcardTextField().sendKeys(fileUtility.getproperty("creditcard"));
	homePage.getMonthTextField().sendKeys(fileUtility.getproperty("month"));
	homePage.getYearTextField().sendKeys(fileUtility.getproperty("year"));
	homePage.getPurchaseButton().click();
	homePage.getOKButton().click();
	homePage.getCloseButton().click();

	}

@Test
public void SelectSonyvaioi7Link() throws InterruptedException  {
	
	HomePage homePage= new HomePage(driver);
	homePage.getSonyvaioi7Link().click();
	homePage.getAddtocartLink().click();
	driver.navigate().back();
	homePage.getCartLink().click();
	homePage.getPlaceOrderButton().click();
	homePage.getNameTextField().sendKeys(fileUtility.getproperty("name"));
	homePage.getCountryTextField().sendKeys(fileUtility.getproperty("country"));
	homePage.getCityTextField().sendKeys(fileUtility.getproperty("city"));
	homePage.getCreditcardTextField().sendKeys(fileUtility.getproperty("creditcard"));
	homePage.getMonthTextField().sendKeys(fileUtility.getproperty("month"));
	homePage.getYearTextField().sendKeys(fileUtility.getproperty("year"));
	homePage.getPurchaseButton().click();
	homePage.getOKButton().click();
	homePage.getCloseButton().click();

	}




}