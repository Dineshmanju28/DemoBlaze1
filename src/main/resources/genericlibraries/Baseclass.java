package genericlibraries;

import java.io.IOException;
import java.lang.reflect.Method;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.hssf.record.ExtendedFormatRecord;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import objectRepository.HomePage;


public class Baseclass extends WebDriverUtility {
	public static WebDriver driver;

	
	@BeforeSuite
	public void beforesuit() {
		
		Reporter.log("connect to database", true);	
		report = new ExtentReports(REPORT_PATH+SystemDate()+".html");
		}
	
	
	@AfterSuite
	public void aftresuit() {		
		
		report.flush();
		Reporter.log("close connection to database", true);
		}
	
	@BeforeTest
	public void beforetest() {
		
		Reporter.log("Before test", true);
		}
	
	@AfterTest
	public void aftertest() {
		
		Reporter.log("After test", true);
		}
	
	@BeforeClass
	public void beforeclass() {
		Reporter.log("Before class", true);
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(fileUtility.getproperty("url"));
		
	}
		
	@AfterClass
	public void afterclass() {
		Reporter.log("After class", true);
	//	driver.quit();
		
	}
	
	@BeforeMethod
	public void beforemethod(Method method) throws EncryptedDocumentException, IOException {
		String methodName = method.getName();
		test = report.startTest(methodName);
		
		Reporter.log("Login", true);
		
//		HomePage homePage = new HomePage(driver);
//
//		homePage.getLoginLink().click();
//		homePage.getLoginUsernameTextField().sendKeys(fileUtility.getproperty("loginusername"));
//		homePage.getLoginpasswordTextField().sendKeys(fileUtility.getproperty("loginpassword"));
//		homePage.getLoginButton().click();

	}
	
	@AfterMethod
	public void aftermethod () {
		Reporter.log("Logout", true);
		
//		HomePage homePage = new HomePage(driver);
//		homePage.getLogout().click();

		report.endTest(test);
	}
}
