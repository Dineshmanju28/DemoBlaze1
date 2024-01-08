package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MonitorPage {

	
	public MonitorPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[.='Apple monitor 24']")
	private WebElement Applemonitor24;
	
	@FindBy(xpath = "//a[.='ASUS Full HD']")
	private WebElement ASUSFullHD;

	

	public WebElement getApplemonitor24() {
		return Applemonitor24;
	}

	public WebElement getASUSFullHD() {
		return ASUSFullHD;
	}
	

}
