package testScripts;

import org.testng.annotations.Test;

import genericlibraries.Baseclass;
import genericlibraries.fileUtility;
import objectRepository.HomePage;
import objectRepository.LaptopPage;
import objectRepository.MonitorPage;

public class MonitorTest extends Baseclass {

	
	//NoSuchElementException
	@Test
	public void SelectApplemonitor24() {
	HomePage homePage = new HomePage(driver);
	MonitorPage monitorPage = new MonitorPage(driver); 
	
	homePage.getLaptopsLink().click();
	monitorPage.getApplemonitor24().click();
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
	//NoSuchElementException
	@Test
	public void SelectASUSFullHD() {
	HomePage homePage = new HomePage(driver);
	MonitorPage monitorPage = new MonitorPage(driver); 
	
	homePage.getLaptopsLink().click();
	monitorPage.getASUSFullHD().click();
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