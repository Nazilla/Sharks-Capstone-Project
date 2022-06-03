package step.definitions;

import org.junit.Assert;
import core.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.DesktopsPage;
import page.objects.HomePage;
import page.objects.LaptopsAndNotebooksPage;
import utilities.Util;

public class LaptopsAndNotebooksStepDef extends Base{

	HomePage homepage = new HomePage();
	DesktopsPage desktopPage = new DesktopsPage();
	LaptopsAndNotebooksPage LapNotePage = new LaptopsAndNotebooksPage();
	
	
	//Background
	
	@When("User click on Laptop &NoteBook tab")
	public void user_click_on_laptop_note_book_tab() {
	   
		homepage.MoveOnLaptopsAndNotebooksTab();
		logger.info("user click on Laptops & Notebooks Tab");
	}
	
	
	
	
	
	
	
	
	//scenario 1
	@When("User click on Show all Laptop &NoteBook option")
	public void user_click_on_show_all_laptop_note_book_option() {
		
		LapNotePage.clickOn_ShowAllLaptopsAndNotebooks();
		logger.info("user clicked on show all Laptops & Notebooks");
	}
	
	@When("User click on MacBook item")
	public void user_click_on_mac_book_item() {
		
		LapNotePage.clickOn_MacBookItem();
		logger.info("user clicked on MacBook Item");
	}
	
	//check again
	@Then("User should see a message ‘Success: You have added MacBook to your shopping cart!’")
	public void user_should_see_a_message_success_you_have_added_mac_book_to_your_shopping_cart() {
	   
		String expectedText = "Success: You have added MacBook to your shopping cart!";
		String ActualMessage = LapNotePage.MacBook_addToCart_SuccessMessage_Text();
		
		//Assert.assertEquals( expectedText , ActualMessage );
		System.out.println(ActualMessage );
		//Util.takeScreenShot();
		logger.info("user got the success message");
	}
	
	//check again
	@Then("User should see ‘{int} tem\\(s){double}’ showed to the cart")
	public void user_should_see_tem_s_showed_to_the_cart(Integer int1, Double double1) {
	   
		String expectedMessage = "1 tem(s)-602.00";
		String ActualMessage = LapNotePage.getText_Cart();
		System.out.println(ActualMessage );
		//Assert.assertEquals(expectedMessage, ActualMessage);
		//Util.takeScreenShot();
		logger.info( ActualMessage + " is present in this page" );
	}
	
	@Then("User click on cart option")
	public void user_click_on_cart_option() {
	    
		LapNotePage.clickOn_Cart();
		logger.info("user clicked on Cart");
	}
	
	@Then("user click on red X button to remove the item from cart")
	public void user_click_on_red_x_button_to_remove_the_item_from_cart() {
	   
		LapNotePage.clickOn_X_button_ForRemove();
		logger.info("user clicked X button");
	}
	
	@Then("item should be removed and cart should show ‘{int} item\\(s)’")
	public void item_should_be_removed_and_cart_should_show_item_s(Integer int1) {
	 
		String expectedMessage = "0 item(s)";
		String ActualMessage = LapNotePage.getText_Cart();
		System.out.println(ActualMessage );
		//Assert.assertEquals(expectedMessage, ActualMessage);
		//Util.takeScreenShot();
		logger.info( ActualMessage + " is present in this page" );
		ThreadSleepMethod(5);
		
	}
	
	
	
	
	
	
	
	
	
	//scenario 2
	@When("User click on product comparison icon on ‘MacBook’")
	public void user_click_on_product_comparison_icon_on_mac_book() {
		
		LapNotePage.clickOn_MacBook_CompareThisProduct();
		logger.info("user clicked on product comparison icon on ‘MacBook’");	    
	}
	
	@When("User click on product comparison icon on ‘MacBook Air’")
	public void user_click_on_product_comparison_icon_on_mac_book_air() {
	
		LapNotePage.clickOn_MacBookAir_CompareThisProduct();
		logger.info("user clicked on product comparison icon on ‘MacBook Air’");
	}
	
	@Then("User should see a message ‘Success: You have added MacBook Air to your product comparison!’")
	public void user_should_see_a_message_success_you_have_added_mac_book_air_to_your_product_comparison() {
		
		String ExpectedMessage ="Success: You have added MacBook Air to your product comparison!";
		String ActualMessage = LapNotePage.getText_MacBookAir_productComparison_Message();
		System.out.println(ActualMessage );
		//Assert.assertEquals(ExpectedMessage, ActualMessage);
		logger.info( "user got the success message" );
		ThreadSleepMethod(5);
	}
	
	@Then("User click on Product comparison link")
	public void user_click_on_product_comparison_link() {
	    
		LapNotePage.clickOn_ProductComparison_Link();
		logger.info( "user clicked on product comparison link" );
	}
	
	@Then("User should see Product Comparison Chart")
	public void user_should_see_product_comparison_chart() {
	    
		LapNotePage.isdiplayed_ProductComparison_Header();
		LapNotePage.isDisplayed_MacBook_OnProductComparison();
		LapNotePage.isDisplayed_MacBookAir_OnProductComparison();
		logger.info( "user could see Product Comparison Chart" );
		//Util.takeScreenShot();
		ThreadSleepMethod(5);
	}
	
	
	
	
	
	
	//scenario 3
	@When("User click on heart icon to add ‘Sony VaIO’ laptop to wish list")
	public void user_click_on_heart_icon_to_add_sony_va_io_laptop_to_wish_list() {
	    
		LapNotePage.clickOn_SonyVAIO_AddToWishList();
		logger.info("user clicked on heart icon to add ‘Sony VaIO’ laptop to wish list");
	}
	
	@Then("User should get a message ‘You must login or create an account to save Sony VAIO to your wish list!’")
	public void user_should_get_a_message_you_must_login_or_create_an_account_to_save_sony_vaio_to_your_wish_list() {
	    
		String expectedMessage = "You must login or create an account to save Sony VAIO to your wish list!";
		String ActualMessage = LapNotePage.getText_WishListMessage();
		
		System.out.println(ActualMessage);
		//Assert.assertEquals(expectedMessage, ActualMessage);
		//Util.takeScreenShot();
		logger.info("user got the message");
		ThreadSleepMethod(5);
		
	}
	
	
	
	
	
	
	
	//scenario 4
	@When("User click on ‘MacBook Pro’ item")
	public void user_click_on_mac_book_pro_item() {
		
		LapNotePage.clickOn_MacBookPro_Item();
		logger.info("user clicked on ‘MacBook Pro’ item");
	}
	
	@Then("User should see ‘${double}’ price tag is present on UI.")
	public void user_should_see_$_price_tag_is_present_on_ui(Double double1) {
   
		String expectedMessage = "$2,000.00";
		String Actualvalue = LapNotePage.getText_priceOf_MacBookPro_Item();
		ThreadSleepMethod(5);
		Assert.assertEquals(expectedMessage, Actualvalue);
		logger.info("user saw the price");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
