package genericlibraries;

import java.io.IOException;
import java.lang.reflect.Method;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import com.relevantcodes.extentreports.ExtentReports;

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
		Reporter.log("close connection to database", true);
		
		report.flush();

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
		HomePage homePage = new HomePage(driver);
		
		Reporter.log("Before class", true);
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver= new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.demoblaze.com/");
}
		
	@AfterClass
	public void afterclass() {
		Reporter.log("After class", true);
	//	driver.quit();
		}
	
	@BeforeMethod
	public void beforemethod(Method method ) throws EncryptedDocumentException, IOException {
		Reporter.log("Login", true);
		String methodName = method.getName();
		test = report.startTest(methodName);
		
//		driver.findElement(By.xpath("//a[.='Log in']")).click();
//		driver.findElement(By.id("Email")).sendKeys(fileUtility.getproperty("email"));
//		driver.findElement(By.id("Password")).sendKeys(fileUtility.getproperty("password"));
//		driver.findElement(By.cssSelector("[value='Log in']")).click();
	}
	@AfterMethod
	public void aftermethod () {
		Reporter.log("Logout", true);
		
		report.endTest(test);

//      driver.findElement(By.linkText("Log out")).click();;
		}
}
