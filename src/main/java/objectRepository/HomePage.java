package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}


	@FindBy(linkText = "//a[contains(.,'PRODUCT STORE')]")
	private WebElement ProductStoreLink;


	@FindBy(id = "recipient-email")
	private WebElement ContactEmailTextField; 
	
	@FindBy(id = "recipient-name")
	private WebElement ContactNameTextField;
	

	@FindBy(id = "message-text")
	private WebElement MessageTextField;
	

	@FindBy(xpath = "//button[.='Send message']")
	private WebElement SendMessageButton;
	
	@FindBy(id = "loginusername")
	private WebElement loginUsernameTextField;
	
	@FindBy(id = "loginpassword")
	private WebElement loginpasswordTextField;
	
	@FindBy(xpath = "//button[.='Log in']")
	private WebElement LoginButton;
	
	@FindBy(id = "sign-username")
	private WebElement signUsernameTextField;
	
	@FindBy(id = "sign-password")
	private WebElement signpasswordTextField;
	
	@FindBy(xpath = "//button[.='Sign up']")
	private WebElement SignupButton;
	
	




	@FindBy(linkText = "Home ")
	private WebElement HomeLink;

	@FindBy(linkText = "Contact")
	private WebElement ContactLink;

	@FindBy(linkText = "About us")
	private WebElement AboutusLink;

	@FindBy(linkText = "Cart")
	private WebElement CartLink;

	@FindBy(linkText = "Log in")
	private WebElement LoginLink;

	@FindBy(linkText = "Sign up")
	private WebElement SignupLink;

	@FindBy(linkText = "Phones")
	private WebElement PhonesLink;
	
	@FindBy(linkText = "Laptops")
	private WebElement LaptopsLink;
	
	@FindBy(linkText = "Monitors")
	private WebElement MonitorsLink;
	
	@FindBy(xpath = "//button[.='Previous']")
	private WebElement PreviousButton;
	
	@FindBy(xpath = "//button[.='Next']")
	private WebElement NextButton;
	
//	@FindBy(linkText = "Samsung galaxy s6")
//	private WebElement Samsunggalaxys6Link;
//	
//	@FindBy(xpath ="//a[.='Nokia lumia 1520']")
//	private WebElement Nokialumia1520Link;
//	
//	@FindBy(xpath = "//a[.='Nexus 6']")
//	private WebElement Nexus6Link;
//	
//	@FindBy(xpath = "//a[.='Samsung galaxy s7']")
//	private WebElement Samsunggalaxys7Link;
//	
//	@FindBy(xpath =  "//a[.='Iphone 6 32gb']")
//	private WebElement Iphone632gb6Link;
//
//	@FindBy(xpath =  "//a[.='Sony xperia z5']")
//	private WebElement Sonyxperiaz5Link;
//	
//	@FindBy(xpath =  "//a[.='HTC One M9']")
//	private WebElement HTCOneM9Link;
//	
//	@FindBy(xpath = "//a[.='Sony vaio i5']")
//	private WebElement Sonyvaioi5Link;
//	
//	@FindBy(xpath =  "//a[contains(.,'Sony vaio i7')]")
//	private WebElement Sonyvaioi7Link;
	
	@FindBy(linkText =  "Welcome dinesh123@gmail.com")
	private WebElement Welcomedinesh123;
	
	@FindBy(linkText =  "Log out")
	private WebElement Logout;
	
	@FindBy(xpath =  "//div[@id=\"signInModal\"]//button[.='Close']")
	private WebElement SignCloseButton;
	
	
	
	public WebElement getSignCloseButton() {
		return SignCloseButton;
	}

	public WebElement getWelcomedinesh123() {
		return Welcomedinesh123;
	}

	public WebElement getLogout() {
		return Logout;
	}

	public WebElement getLoginUsernameTextField() {
		return loginUsernameTextField;
	}

	public WebElement getLoginpasswordTextField() {
		return loginpasswordTextField;
	}

	public WebElement getLoginButton() {
		return LoginButton;
	}

	public WebElement getSignUsernameTextField() {
		return signUsernameTextField;
	}

	public WebElement getSignpasswordTextField() {
		return signpasswordTextField;
	}

	public WebElement getSignupButton() {
		return SignupButton;
	}
	
	public WebElement getContactEmailTextField() {
		return ContactEmailTextField;
	}

	public WebElement getContactNameTextField() {
		return ContactNameTextField;
	}

	public WebElement getMessageTextField() {
		return MessageTextField;
	}

	public WebElement getSendMessageButton() {
		return SendMessageButton;
	}
	
	public WebElement getProductStoreLink() {
		return ProductStoreLink;
	}
	
	
//	public WebElement getNokialumia1520Link() {
//		return Nokialumia1520Link;
//	}
//
//	public WebElement getNexus6Link() {
//		return Nexus6Link;
//	}
//
//	public WebElement getSamsunggalaxys7Link() {
//		return Samsunggalaxys7Link;
//	}
//
//	public WebElement getIphone632gb6Link() {
//		return Iphone632gb6Link;
//	}
//
//	public WebElement getSonyxperiaz5Link() {
//		return Sonyxperiaz5Link;
//	}
//
//	public WebElement getHTCOneM9Link() {
//		return HTCOneM9Link;
//	}
//
//	public WebElement getSonyvaioi5Link() {
//		return Sonyvaioi5Link;
//	}
//
//	public WebElement getSonyvaioi7Link() {
//		return Sonyvaioi7Link;
//	}

	public WebElement getDeleteLink() {
		return DeleteLink;
	}

	@FindBy(linkText = "Add to cart")
	private WebElement AddtocartLink;
	
	@FindBy(xpath = "//button[.='Place Order']")
	private WebElement PlaceOrderButton;
	
	@FindBy(xpath = "//button[.='Purchase']")
	private WebElement PurchaseButton;
	
	@FindBy(xpath = "//button[.='OK']")
	private WebElement OKButton;
	
	@FindBy(xpath = "//div[@id=\"orderModal\"]//button[.='Close']")
	private WebElement CloseButton;
	
	public WebElement getCloseButton() {
		return CloseButton;
	}

	@FindBy(linkText = "Delete")
	private WebElement DeleteLink;
	
	@FindBy(id = "name")
	private WebElement nameTextField;
	
	@FindBy(id = "country")
	private WebElement countryTextField;
	
	@FindBy(id = "city")
	private WebElement cityTextField;
	
	@FindBy(id = "card")
	private WebElement creditcardTextField;
	
	@FindBy(xpath = "//button[@title=\"Play Video\"]")
	private WebElement PlayButton;
	
	@FindBy(xpath = "//h5[.='About us']/..//span")
	private WebElement XButton;
	
	
	public WebElement getXButton() {
		return XButton;
	}

	public WebElement getPlayButton() {
		return PlayButton;
	}

	public WebElement getAddtocartLink() {
		return AddtocartLink;
	}

	public WebElement getPlaceOrderButton() {
		return PlaceOrderButton;
	}

	public WebElement getPurchaseButton() {
		return PurchaseButton;
	}

	public WebElement getOKButton() {
		return OKButton;
	}

	public WebElement getNameTextField() {
		return nameTextField;
	}

	public WebElement getCountryTextField() {
		return countryTextField;
	}

	public WebElement getCityTextField() {
		return cityTextField;
	}

	
	public WebElement getYearTextField() {
		return yearTextField;
	}

	public WebElement getCreditcardTextField() {
		return creditcardTextField;
	}

	public WebElement getMonthTextField() {
		return monthTextField;
	}

	@FindBy(id = "year")
	private WebElement yearTextField;


	@FindBy(id = "month")
	private WebElement monthTextField;
	
	public WebElement getPhonesLink() {
		return PhonesLink;
	}

	public WebElement getLaptopsLink() {
		return LaptopsLink;
	}

	public WebElement getMonitorsLink() {
		return MonitorsLink;
	}

	public WebElement getPreviousButton() {
		return PreviousButton;
	}

	public WebElement getNextButton() {
		return NextButton;
	}

//	public WebElement getSamsunggalaxys6Link() {
//		return Samsunggalaxys6Link;
//	}

	public WebElement getHomeLink() {
		return HomeLink;
	}

	public WebElement getContactLink() {
		return ContactLink;
	}

	public WebElement getAboutusLink() {
		return AboutusLink;
	}

	public WebElement getCartLink() {
		return CartLink;
	}

	public WebElement getLoginLink() {
		return LoginLink;
	}

	public WebElement getSignupLink() {
		return SignupLink;
	}

}
