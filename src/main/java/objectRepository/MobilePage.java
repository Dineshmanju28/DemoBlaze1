package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MobilePage {
	public MobilePage(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText = "Samsung galaxy s6")
	private WebElement Samsunggalaxys6Link;
	
	@FindBy(xpath ="//a[.='Nokia lumia 1520']")
	private WebElement Nokialumia1520Link;
	
	@FindBy(xpath = "//a[.='Nexus 6']")
	private WebElement Nexus6Link;
	
	@FindBy(xpath = "//a[.='Samsung galaxy s7']")
	private WebElement Samsunggalaxys7Link;
	
	@FindBy(xpath =  "//a[.='Iphone 6 32gb']")
	private WebElement Iphone632gb6Link;

	@FindBy(xpath =  "//a[.='Sony xperia z5']")
	private WebElement Sonyxperiaz5Link;
	
	@FindBy(xpath =  "//a[.='HTC One M9']")
	private WebElement HTCOneM9Link;
	
	@FindBy(xpath = "//a[.='Sony vaio i5']")
	private WebElement Sonyvaioi5Link;
	
	@FindBy(xpath =  "//a[contains(.,'Sony vaio i7')]")
	private WebElement Sonyvaioi7Link;

	@FindBy(linkText = "MacBook air")
	private WebElement MacBookairLaptop;
	
	@FindBy(linkText = "Dell i7 8gb")
	private WebElement Delli78gbLaptop;
	

	@FindBy(linkText = "2017 Dell 15.6 Inch")
	private WebElement Dell156InchLaptop;
	
	@FindBy(linkText = "MacBook Pro")
	private WebElement MacBookProLaptop;
	
	@FindBy(xpath = "//a[.='ASUS Full HD']")
	private WebElement ASUSFullHD;

	@FindBy(xpath = "//a[.='Apple monitor 24']")
	private WebElement Applemonitor24;

	
	public WebElement getApplemonitor24() {
		return Applemonitor24;
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

	public WebElement getASUSFullHD() {
		return ASUSFullHD;
	}

	public WebElement getSamsunggalaxys6Link() {
		return Samsunggalaxys6Link;
	}

	public WebElement getNokialumia1520Link() {
		return Nokialumia1520Link;
	}

	public WebElement getNexus6Link() {
		return Nexus6Link;
	}

	public WebElement getSamsunggalaxys7Link() {
		return Samsunggalaxys7Link;
	}

	public WebElement getIphone632gb6Link() {
		return Iphone632gb6Link;
	}

	public WebElement getSonyxperiaz5Link() {
		return Sonyxperiaz5Link;
	}

	public WebElement getHTCOneM9Link() {
		return HTCOneM9Link;
	}

	public WebElement getSonyvaioi5Link() {
		return Sonyvaioi5Link;
	}

	public WebElement getSonyvaioi7Link() {
		return Sonyvaioi7Link;
	}
}
