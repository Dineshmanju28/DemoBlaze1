package testScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Reports {

	ExtentReports report = new ExtentReports("./Reports/report.html");
	
	ExtentTest test = report.startTest("loginTest");
	
	@Test
	public void reportTest() {
		WebDriver driver = new ChromeDriver();
		test.log(LogStatus.INFO,"chrome browser is launched");
		
		driver.manage().window().maximize();
		test.log(LogStatus.INFO, "chrome browser is maximized");
		
		driver.get("https://www.samsung.com/in/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Assert.assertEquals(driver.findElement(By.cssSelector("[class=\"image__main responsive-img image--loaded\"]")).isDisplayed() , true);
		test.log(LogStatus.PASS, "Log in successful");
		report.endTest(test);
		report.flush();
		driver.quit();
		
	}
	
	@Test
	public void reportTest2() {
		test = report.startTest("login 2");
		WebDriver driver = new ChromeDriver();
		test.log(LogStatus.INFO,"chrome browser is launched");
		
		driver.manage().window().maximize();
		test.log(LogStatus.INFO, "chrome browser is maximized");
		
		driver.get("https://www.samsung.com/in/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Assert.assertEquals(driver.findElement(By.cssSelector("[class=\"image__main responsive-img image--loaded\"]")).isDisplayed() , true);
		test.log(LogStatus.PASS, "Log in successful");
		report.endTest(test);
		report.flush();
		driver.quit();	
	}
}