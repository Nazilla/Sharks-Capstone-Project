package page.objects;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import core.Base;

public class RetailPage extends Base{

	
	
	public RetailPage (){
		
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy (xpath ="//input[@name='email']")
	private WebElement EmailAddress_Login;

	@FindBy (xpath ="//input[@name='password']")
	private WebElement Password_Login;
	
	@FindBy (xpath ="//input[@value='Login']")
	private WebElement Login_Button;
	
	@FindBy (xpath ="//h2[text()='My Account']")
	private WebElement MyAccountDashboard_MyAccount;
	
	@FindBy (xpath ="//h2[text()='My Orders']")
	private WebElement MyAccountDashboard_MyOrders;
	
	@FindBy (xpath ="//h2[text()='My Affiliate Account']")
	private WebElement MyAccountDashboard_MyAffiliateAccount;
	
	@FindBy (xpath ="//h2[text()='Newsletter']")
	private WebElement MyAccountDashboard_Newsletter;
	
	@FindBy (xpath ="//a[text()='Register for an affiliate account']")
	private WebElement RegisterForAnAffiliateAccount;
	
	@FindBy (xpath ="//input[@name='company']")
	private WebElement MyAffiliateAccount_company;
	
	@FindBy (xpath ="//input[@name='website']")
	private WebElement MyAffiliateAccount_WebSite;
	
	@FindBy (xpath ="//input[@name='tax']")
	private WebElement MyAffiliateAccount_TaxId;
	
	@FindBy (xpath ="//input[@type='radio' and @value='cheque']")
	private WebElement MyAffiliateAccount_Payment_Cheque;
	
	@FindBy (xpath ="//input[@type='radio' and @value='paypal']")
	private WebElement MyAffiliateAccount_Payment_Paypal;
	
	@FindBy (xpath ="//input[@name='cheque']")
	private WebElement ChequePayeeName;
	
	@FindBy (xpath ="//input[@type='checkbox']")
	private WebElement AboutUscheckBox;
	
	@FindBy (xpath ="//input[@value='Continue']")
	private WebElement AffiliateForm_ContinueButton;
	
	@FindBy (xpath ="//div[text()=' Success: Your account has been successfully updated.']")
	private WebElement AffiliateForm_SuccessMessage;
	
	@FindBy (xpath ="//a[text()='Edit your affiliate information']")
	private WebElement Edityouraffiliateinformation;
	
	@FindBy (xpath ="//input[@type='radio' and @value='bank']")
	private WebElement MyAffiliateAccount_Payment_bank;
	
	@FindBy (xpath ="//input[@id='input-bank-name']")
	private WebElement AffiliateAccount_BankName;
	
	@FindBy (xpath ="//input[@id='input-bank-branch-number']")
	private WebElement AffiliateAccount_BankBranchNumbeer;
	
	@FindBy (xpath ="//input[@id='input-bank-swift-code']")
	private WebElement AffiliateAccount_BankSwiftCode;
	
	@FindBy (xpath ="//input[@id='input-bank-account-name']")
	private WebElement AffiliateAccount_BankAccountName;
	
	@FindBy (xpath ="//input[@id='input-bank-account-number']")
	private WebElement AffiliateAccount_BankAccountNumber;
	
	@FindBy (xpath ="//a[text()='Edit your account information']")
	private WebElement EditYourAccountInformation;
	
	@FindBy (xpath ="//input[@name='firstname']")
	private WebElement EditAccount_firstname;
	
	@FindBy (xpath ="//input[@name='lastname']")
	private WebElement EditAccount_lastname;
	
	@FindBy (xpath ="//input[@name='email']")
	private WebElement EditAccount_email;
	
	@FindBy (xpath ="//input[@name='telephone']")
	private WebElement EditAccount_telephone;
	
	
	
	
	
	
	
	
	
	
	public void SendKeys_EmailAddress_Login(String Email) {
		
		EmailAddress_Login.sendKeys( Email );
	}
	
	public void SendKeys_Password_Login(String Password) {
		
		Password_Login.sendKeys( Password );
	}
	
	public void clickOn_Login_Button() {
		
		Login_Button.click();
	}
	
	public void isDisplayed_MyAccount() {
		
		Assert.assertTrue( MyAccountDashboard_MyAccount.isDisplayed() );
	}
	
	public void isDisplayed_MyOrders() {
		
		Assert.assertTrue( MyAccountDashboard_MyOrders.isDisplayed() );
	}
	
	public void isDisplayed_MyAffiliateAccount() {
		
		Assert.assertTrue( MyAccountDashboard_MyAffiliateAccount.isDisplayed() );
	}
	
	public void isDisplayed_Newsletter() {
		
		Assert.assertTrue( MyAccountDashboard_Newsletter.isDisplayed() );
	}
	
	public void clickOn_RegisterForAnAffiliateAccount() {
		
		RegisterForAnAffiliateAccount.click();
	}
	
	public void Fill_MyAffiliateAccount_company(String str) {
		MyAffiliateAccount_company.sendKeys( str );
	}
	
	public void Fill_MyAffiliateAccount_WebSite(String str) {
		MyAffiliateAccount_WebSite.sendKeys( str );
	}
	
	public void Fill_MyAffiliateAccount_TaxId(String str) {
		MyAffiliateAccount_TaxId.sendKeys( str );
	}
	
	public void Fill_MyAffiliateAccount_Payment_Cheque(String Str) {
		
		MyAffiliateAccount_Payment_Cheque.click(); 
	}
	
	public void Fill_ChequePayeeName(String str) {
		
		ChequePayeeName.sendKeys( str );
	}
	
	public void clickOn_AboutUscheckBox() {
		AboutUscheckBox.click();
	}
	
	public void clickOn_AffiliateForm_ContinueButton() {
	
		AffiliateForm_ContinueButton.click();
	}
	
	public boolean isDisplayed_AffiliateForm_SuccessMessage() {
		
		if (AffiliateForm_SuccessMessage.isDisplayed())
			return true;
		else
			return false;
	}
	
	public String getText_AffiliateForm_SuccessMessage() {
		
		return AffiliateForm_SuccessMessage.getText();
			
	}
	
	public void clickOn_Edityouraffiliateinformation() {
		
		Edityouraffiliateinformation.click();
	}
	
	public void Fill_MyAffiliateAccount_Payment_bank() {
		
		MyAffiliateAccount_Payment_bank.click(); 
	
	}
	
	public void SendKeys_AffiliateAccount_BankName(String str) {
		
		AffiliateAccount_BankName.sendKeys( str );
	}
	
	public void SendKeys_AffiliateAccount_BankBranchNumbeer(String str) {
		
		AffiliateAccount_BankBranchNumbeer.sendKeys( str );
	}
	
	public void SendKeys_AffiliateAccount_BankSwiftCode(String str) {
		
		AffiliateAccount_BankSwiftCode.sendKeys( str );
	}
	
	public void SendKeys_AffiliateAccount_BankAccountName(String str) {
		
		AffiliateAccount_BankAccountName.sendKeys( str );
	}
	
	public void SendKeys_AffiliateAccount_BankAccountNumber(String str) {
		
		AffiliateAccount_BankAccountNumber.sendKeys( str );
	}
	
	public void clickOn_EditYourAccountInformation() {
		
		EditYourAccountInformation.click();
	}
	
	public void SendKeys_EditAccount_firstname(String str) {
		EditAccount_firstname.clear();
		EditAccount_firstname.sendKeys( str );
	}
	
	public void SendKeys_EditAccount_lastname(String str) {
		EditAccount_lastname.clear();
		EditAccount_lastname.sendKeys( str );
	}
	
	public void SendKeys_EditAccount_email(String str) {
		EditAccount_email.clear();
		EditAccount_email.sendKeys( str );
	}
	
	public void SendKeys_EditAccount_telephone(String str) {
		EditAccount_telephone.clear();
		EditAccount_telephone.sendKeys( str );
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
