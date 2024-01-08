package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LaptopPage  {


	public LaptopPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[.='Sony vaio i5']")
	private WebElement Sonyvaioi5Laptop;
	

	@FindBy(xpath = "//a[contains(.,'Sony vaio i7')]")
	private WebElement Sonyvaioi7Laptop;
	

	@FindBy(linkText = "MacBook air")
	private WebElement MacBookairLaptop;
	

	@FindBy(linkText = "Dell i7 8gb")
	private WebElement Delli78gbLaptop;
	

	@FindBy(linkText = "2017 Dell 15.6 Inch")
	private WebElement Dell156InchLaptop;
	
	@FindBy(linkText = "MacBook Pro")
	private WebElement MacBookProLaptop;
	

	public WebElement getSonyvaioi5Laptop() {
		return Sonyvaioi5Laptop;
	}


	public WebElement getSonyvaioi7Laptop() {
		return Sonyvaioi7Laptop;
	}


	public WebElement getMacBookairLaptop() {
		return MacBookairLaptop;
	}


	public WebElement getDelli78gbLaptop() {
		return Delli78gbLaptop;
	}


	public WebElement getDell156InchLaptop() {
		return Dell156InchLaptop;
	}


	public WebElement getMacBookProLaptop() {
		return MacBookProLaptop;
	}


	public WebElement getPreviousButton() {
		return PreviousButton;
	}


	public WebElement getNextButton() {
		return NextButton;
	}

	@FindBy(linkText = "//button[.='Previous']")
	private WebElement PreviousButton;
	

	@FindBy(linkText = "//button[.='Next']")
	private WebElement NextButton;
	
}
