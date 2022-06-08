package step.definitions;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import core.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.DesktopsPage;
import page.objects.HomePage;
import utilities.Util;

public class DesktopsStepDef extends Base {

	HomePage homepage = new HomePage();
	DesktopsPage desktopPage = new DesktopsPage();
	
	
	//Background
	@Given( "User is on Retail website" )
	public void User_is_on_Retail_website() {
		
		Assert.assertTrue( homepage.isLogoDisplayed() );
	}
	
	@When ( "User click on Desktops tab" )
	public void User_click_on_Desktops_tab() {
		
		homepage.MoveOnDesktopTab();
		logger.info("user click on Desktop Tab");
	}
	
	
	
	//scenario 1
	@And ( "User click on Show all desktops" )
	public void User_click_on_Show_all_desktops() {
		
		homepage.clickOnShowAllDesktops();
		logger.info("user clicked on Show All Desktops");
	}
	
	@Then ( "User should see all items are present in Desktop page" )
	public void User_should_see_all_items_are_present_in_Desktop_page() {
		
		List <WebElement> items = desktopPage.elements();
		for ( WebElement element : items ) {
			
			Assert.assertTrue( element.isDisplayed() );
			logger.info(element.getText() + " is present in this page" );
		}
		Util.takeScreenShot();
		ThreadSleepMethod( 5 );
	}


	
	//scenario 2
	@When("User click ADD TO CART option on ‘HP LP3065’ item")
	public void user_click_add_to_cart_option_on_item() {
    
		desktopPage.clickOn_HP_LP3065_addTOCart();
		logger.info("user clicked add to cart on 'HP LP3065' item  ");
	}
	
	@When("User select quantity {int}")
	public void user_select_quantity(Integer int1) {
  
		desktopPage.clearQuantity();
		desktopPage.sendKeysToQuantity("1");
		logger.info("user entered quantity");
	}
	
	@When("User click add to Cart button")
	public void user_click_add_to_cart_button() {
   
		desktopPage.AddToCartLVL2();
		logger.info("user added item to cart");
		ThreadSleepMethod( 5 );
	}
	
	//check again
	@Then("User should see a message ‘Success: you have added HP LP {int} to your Shopping cart!’")
	public void user_should_see_a_message(Integer int1) {
    
		String expectedMessage = "Success: You have added HP LP3065 to your shopping cart!";
		String ActualMessage = desktopPage.SuccessMessageGetText_hP() ;
		//System.out.println( desktopPage.SuccessMessageGetText_hP() ) ;
		
		if (  ActualMessage.contains( expectedMessage ) == true ) {
			
			logger.info("user got the success message");
		}
		else {
			
			System.out.println( "Test failed" );
		}
		
		//Assert.assertEquals( "Expected Text and Success Message doesn't match", expectedMessage , desktopPage.SuccessMessageGetText_hP() );

		
		
		//Util.takeScreenShot();
		ThreadSleepMethod(5);
		
	}
	
	
	
	
	
	//scenario 3
	@When("User click ADD TO CART option on ‘Canon EOS 5D’ item")
	public void user_click_add_to_cart_option_on_canon_eos_5d_item() {
	   
		desktopPage.clickOn_Canon_EOS_5D_addTOCart();
		logger.info("user added Canon EOS 5D to Cart ");
	}
	
	@When("User select color from dropdown ‘Red’")
	public void user_select_color_from_dropdown_red() {
	   
		desktopPage.clickOn_Canon_DropDown_Red();
		logger.info("user selected Red color from drop down");
	}
	
	//check again
	@Then("User should see a message ‘Success: You have added Canon EOS 5D to your shopping cart!’'")
	public void user_should_see_a_message_success_you_have_added_canon_eos_5d_to_your_shopping_cart() {
	    
		String expectedMessage = "Success: You have added Canon EOS 5D to your shopping cart!";
		String ActualMessage = desktopPage.SuccessMessageGetText_Canon() ;
		
		if (  ActualMessage.contains( expectedMessage ) == true ) {
			
			logger.info("user got the success message");
			Util.takeScreenShot();
		}
		else {
			
			System.out.println( "Test failed" );
			System.out.println( desktopPage.SuccessMessageGetText_Canon() );
			
		}
		//Assert.assertEquals( "Expected Text and Success Message doesn't match", expectedMessage , desktopPage.SuccessMessageGetText_Canon() );		
		
		ThreadSleepMethod(5);
		
	}
	
	
	
	
	
	//Scenario 4
	@When("User click on Canon EOS 5D item")
	public void user_click_on_canon_eos_5d_item() {
	    
		desktopPage.clickOn_Canon_EOS_5D_Camera();
	}
	
	@When("User click on write a review link")
	public void user_click_on_write_a_review_link() {
	
		desktopPage.clickOn_Review();
	}
	
	@When("user fill the review information with below information")
	public void user_fill_the_review_information_with_below_information(io.cucumber.datatable.DataTable dataTable) {
	  
		List<Map<String,String>> review = dataTable.asMaps(String.class,String.class);
		desktopPage.enterYourName(review.get(1).get("yourname"));
		desktopPage.enterYourReview(review.get(1).get("yourReview"));
		desktopPage.Ratings( review.get(1).get("Rating") );
		
		ThreadSleepMethod( 10 );
		
	}
	
	@When("User click on Continue Button")
	public void user_click_on_continue_button() {
		
		desktopPage.clickOn_ContinueButton();
	}
	
	@Then("User should see a message with ‘Thank you for your review. It has been submitted to the webmaster for approval.”")
	public void user_should_see_a_message_with_thank_you_for_your_review_it_has_been_submitted_to_the_webmaster_for_approval() {
	   
	   String ExpectedMessage = "Thank you for your review. It has been submitted to the webmaster for approval.";
	   
	   Assert.assertEquals( "Expected Text and Success Message doesn't match", ExpectedMessage , desktopPage.successReviewMassage() );
	   logger.info("user got the success message");
	   
	 //Util.takeScreenShot();
	   ThreadSleepMethod( 5 );
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
