package testScripts;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import genericlibraries.Baseclass;
import genericlibraries.fileUtility;
import objectRepository.HomePage;

public class HomeTest extends Baseclass {


	@Test
	public void ContactMessage() throws InterruptedException {

		HomePage homePage = new HomePage(driver);

		homePage.getContactLink().click();
		test.log(LogStatus.INFO, "ContactMessage Link is clicked");

		homePage.getContactEmailTextField().sendKeys(fileUtility.getproperty("contactemail"));
		homePage.getContactNameTextField().sendKeys(fileUtility.getproperty("contactname"));
		homePage.getMessageTextField().sendKeys(fileUtility.getproperty("message"));
		Thread.sleep(2000);
		homePage.getSendMessageButton().click();
		test.log(LogStatus.PASS, "Send Message button is selected");

		Thread.sleep(2000);
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
		switchToAlertAndAccept(driver);

		Reporter.log("Contact Message is successfully sent ", true);

	}

	@Test (groups= "smoke")
	public void Login() throws InterruptedException {

		HomePage homePage = new HomePage(driver);

		homePage.getLoginLink().click();
		test.log(LogStatus.INFO, "Login Link is clicked");
		Thread.sleep(2000);
		homePage.getLoginUsernameTextField().sendKeys(fileUtility.getproperty("loginusername"));
		homePage.getLoginpasswordTextField().sendKeys(fileUtility.getproperty("loginpassword"));
		homePage.getLoginButton().click();

		Reporter.log("Login is successfully done", true);
		test.log(LogStatus.PASS, "Login is completed");
		
		Thread.sleep(2000);
		homePage.getLogout().click();

	}

	@Test
	public void Signup() throws InterruptedException {

		HomePage homePage = new HomePage(driver);
		test.log(LogStatus.INFO, "Signup Link is clicked");

		homePage.getSignupLink().click();
		homePage.getSignUsernameTextField().sendKeys(fileUtility.getproperty("Signupusername"));
		homePage.getSignpasswordTextField().sendKeys(fileUtility.getproperty("Signuppassword"));
		homePage.getSignupButton().click();
		Thread.sleep(2000);
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
		switchToAlertAndAccept(driver);
		
		homePage.getSignCloseButton().click();
		
		Reporter.log("Signup is successfully done", true);
		test.log(LogStatus.PASS, "Signup is completed");

	}

	@Test
	public void PlayAdd() throws InterruptedException {

		HomePage homePage = new HomePage(driver);
		homePage.getAboutusLink().click();
		homePage.getPlayButton().click();
		Thread.sleep(10000);
		homePage.getXButton().click();

		Reporter.log("Advertisement is played successfully ", true);

	}

	@Test(enabled = false)
	public void MatchLoginText() throws InterruptedException {

		HomePage homePage = new HomePage(driver);

		homePage.getLoginLink();
		homePage.getLoginUsernameTextField().sendKeys(fileUtility.getproperty("loginusername"));
		homePage.getLoginpasswordTextField().sendKeys(fileUtility.getproperty("loginpassword"));
		homePage.getLoginButton().click();

//		String Logout = homePage.getLogout().getText();
//		
//		Assert.assertEquals( Logout,"Logout", "Logout is not displayed");

		Reporter.log("Test case is completed", true);
	}

}