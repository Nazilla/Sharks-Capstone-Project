
package step.definitions;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.HomePage;
import page.objects.RetailPage;
import utilities.Util;

public class RetailPageStepDef extends Base {

	RetailPage retailPage = new RetailPage();
	HomePage homepage = new HomePage();
	
	
	
	//Background
	
	@Given("User click on MyAccount")
	public void user_click_on_my_account() {
    
		homepage.clickOn_MyAccount();
		logger.info("User clicked on MyAccount");
	}
	
	@When("User click on Login")
	public void user_click_on_login() {
	
		homepage.clickOn_Login();
		logger.info("User clicked on Login");
	}
	
	@When("User enter username ‘userName’ and password ‘password’")
	public void user_enter_username_user_name_and_password_password() {
   
		String Email ="no@gmail.com";
		String Password="helloyes";
		
		retailPage.SendKeys_EmailAddress_Login( Email );
		retailPage.SendKeys_Password_Login( Password );
		
		logger.info("User entered Email and password ");
	}
	
	@When("User click on Login button")
	public void user_click_on_login_button() {
    
		retailPage.clickOn_Login_Button();
		logger.info("User clicked on Login button");
	}
	
	@Then("User should be logged in to MyAccount dashboard")
	public void user_should_be_logged_in_to_my_account_dashboard() {
		
		retailPage.isDisplayed_MyAccount();
		retailPage.isDisplayed_MyOrders();
		retailPage.isDisplayed_MyAffiliateAccount();
		retailPage.isDisplayed_Newsletter();
		logger.info("User logged in to MyAccount dashboard");
		//Util.takeScreenShot();
		
		
	}
	
	
	
	
	
	
	
	
	//Scenario 1
	@When("User click on ‘Register for an Affiliate Account’ link")
	public void user_click_on_register_for_an_affiliate_account_link() {
    
		retailPage.clickOn_RegisterForAnAffiliateAccount();
		logger.info("User clicked on ‘Register for an Affiliate Account’ link");
		
	}
	
	@When("User fill affiliate form with below information")
	public void user_fill_affiliate_form_with_below_information(io.cucumber.datatable.DataTable dataTable) {

		List<Map<String,String>> AffiliateAccount = dataTable.asMaps(String.class,String.class);
		retailPage.Fill_MyAffiliateAccount_company(AffiliateAccount.get(0).get("company"));
		retailPage.Fill_MyAffiliateAccount_WebSite(AffiliateAccount.get(0).get("website"));
		retailPage.Fill_MyAffiliateAccount_TaxId( AffiliateAccount.get(0).get("taxID") );
		retailPage.Fill_MyAffiliateAccount_Payment_Cheque( AffiliateAccount.get(0).get("paymentMethod") );
		retailPage.Fill_ChequePayeeName( AffiliateAccount.get(0).get("ChequePayeeName") );
		
		logger.info("User filled the affiliate form with information");
		
		
   
	}	
	
	@When("User check on About us check box")
	public void user_check_on_about_us_check_box() {
   
		retailPage.clickOn_AboutUscheckBox();
		logger.info("User checked on About us checkbox");
	}
	
	@When("User click on Continue button")
	public void user_click_on_continue_button() {
    
		retailPage.clickOn_AffiliateForm_ContinueButton();
		logger.info("User clicked on Continue button");
	}
	
	@Then("User should see a success message")
	public void user_should_see_a_success_message() {
    
		Assert.assertTrue( retailPage.isDisplayed_AffiliateForm_SuccessMessage() );
		logger.info("User got a success message");
	}
	
	
	
	
	
	
	
	
	//Scenario 2
	@When("User click on ‘Edit your affiliate informationlink’")
	public void user_click_on_edit_your_affiliate_informationlink() {
	    
		retailPage.clickOn_Edityouraffiliateinformation();
		logger.info("User clicked on ‘Edit your affiliate informationlink");
	}
	
	@When("user click on Bank Transfer radio button")
	public void user_click_on_bank_transfer_radio_button() {
		
		retailPage.Fill_MyAffiliateAccount_Payment_bank();
		logger.info("user clicked on Bank Transfer radio button");
	    
	}
	
	@When("User fill Bank information with below information")
	public void user_fill_bank_information_with_below_information(io.cucumber.datatable.DataTable dataTable) {
	   
		List<Map<String,String>> AffiliateAccount2 = dataTable.asMaps(String.class,String.class);
		retailPage.SendKeys_AffiliateAccount_BankName( AffiliateAccount2.get(0).get("bankName") );
		retailPage.SendKeys_AffiliateAccount_BankBranchNumbeer( AffiliateAccount2.get(0).get("abaNumber") );
		retailPage.SendKeys_AffiliateAccount_BankSwiftCode( AffiliateAccount2.get(0).get("swiftCode") );
		retailPage.SendKeys_AffiliateAccount_BankAccountName( AffiliateAccount2.get(0).get("accountName") );
		retailPage.SendKeys_AffiliateAccount_BankAccountNumber( AffiliateAccount2.get(0).get("accountNumber") );
		ThreadSleepMethod(5);
		
		logger.info("User filled Bank information with the information");
	}
	
	
	
	
	
	
	
	//Scenario 3
	@When("User click on ‘Edit your account information’ link")
	public void user_click_on_edit_your_account_information_link() {
	   
		retailPage.clickOn_EditYourAccountInformation();
		logger.info("User clicked on ‘Edit your account information’ link");
	}
	
	@When("User modify below information")
	public void user_modify_below_information(io.cucumber.datatable.DataTable dataTable) {
	    
		List<Map<String,String>> EditAccount = dataTable.asMaps( String.class,String.class);  
		retailPage.SendKeys_EditAccount_firstname(EditAccount.get(0).get("firstname"));
		retailPage.SendKeys_EditAccount_lastname(EditAccount.get(0).get("lastName"));
		retailPage.SendKeys_EditAccount_email(EditAccount.get(0).get("email"));
		retailPage.SendKeys_EditAccount_telephone(EditAccount.get(0).get("telephone"));
		ThreadSleepMethod(3);
		logger.info("User modified the information");
		
	}
	
	@Then("User should see a message ‘Success: Your account has been successfully updated.’")
	public void user_should_see_a_message_success_your_account_has_been_successfully_updated() {
	
		String expectedMessage = "Success: Your account has been successfully updated.";
		String ActualMessage = retailPage.getText_AffiliateForm_SuccessMessage();		
		
		Assert.assertEquals( expectedMessage , ActualMessage );
		logger.info("User got the message ‘Success: Your account has been successfully updated.’");
		ThreadSleepMethod(3);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
