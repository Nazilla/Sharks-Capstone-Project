package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import core.Base;

public class HomePage extends Base  {


	
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//a[text()='TEST ENVIRONMENT']")
	private WebElement logo;
	
	@FindBy(xpath = "//input[@name='search']")
	private WebElement searchbar;

	@FindBy(xpath = "//span[text()='My Account']")
	private WebElement myAccount;

	@FindBy(xpath = "//a[text()='Register']")
	private WebElement register;

	@FindBy(xpath = "//a[text()='Login']")
	private WebElement login;
	
	@FindBy(xpath = "//a[@class='dropdown-toggle' and text()='Desktops']" )
	private WebElement DesktopsTab;
	
	@FindBy(xpath = "//a[ text()='Show All Desktops']")
	private WebElement ShowAllDesktops;
	
	@FindBy(xpath = "//a[text()='Laptops & Notebooks']")
	private WebElement LaptopsAndNotebooksTab;
	
	@FindBy(xpath = "//span[text()='My Account']")
	private WebElement MyAccount;
	
	@FindBy(xpath = "//li//a[text()='Login']")
	private WebElement Login;
	
	@FindBy(xpath ="//span[text()='Currency']")
	private WebElement Currency;
	
	@FindBy(xpath ="//button[text()='€ Euro']")
	private WebElement Currency_Euro;
	
	@FindBy(xpath ="//strong[text()='€']")
	private WebElement Currency_€;
	
	@FindBy (xpath ="//span[text()='Shopping Cart']")
	private WebElement Shopping_Cart;
	
	@FindBy (xpath ="//div[@id='content']//p[text()='Your shopping cart is empty!']")
	private WebElement EmptyCart_Message;
	
	
	
	
	
	
	
	
	
	
	
	public boolean isLogoDisplayed() {
		if (logo.isDisplayed())
			return true;
		else
			return false;
	}
	
	public void searchInput(String value) {
		searchbar.sendKeys(value);
	}
	
	public void clickOnMyAccount() {
		myAccount.click();
	}
	
	public void clickOnRegister() {
		register.click();
	}
	
	public void clickOnLogin() {
		login.click();
	}
	
	public void MoveOnDesktopTab() {
		MoveToElement(DesktopsTab);
	}
	
	public void clickOnShowAllDesktops() {
		ShowAllDesktops.click();
		
	}
	
	public void MoveOnLaptopsAndNotebooksTab() {
		MoveToElement( LaptopsAndNotebooksTab );
	}
	
	public void clickOn_MyAccount() {
		
		MyAccount.click();
	}
	
	public void clickOn_Login() {
		
		Login.click();
	}
	
	public void clickOn_Currency() {
		
		Currency.click();
	}
	
	public void clickOn_Currency_Euro() {
		
		Currency_Euro.click();
	}
	
	public boolean isDisplayed_Currency_€() {
		
		if ( Currency_€.isDisplayed() ) {
			return true;	}
		else {
			return false;	}
	}
	
	
	public void clickOn_Shopping_Cart() {
		
		Shopping_Cart.click();
	}
	
	public boolean isDisplayed_EmptyCart_Message() {
		
		if ( EmptyCart_Message.isDisplayed() ) {
			return true;	}
		else {
			return false;	}
	}
	
	
	
	
	
	
	
}
