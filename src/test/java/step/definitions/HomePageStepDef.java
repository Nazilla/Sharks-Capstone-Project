package step.definitions;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.HomePage;
import utilities.Util;

public class HomePageStepDef extends Base{

	HomePage homepage = new HomePage();
	
	
	
	
	//Scenario 1

	@When("User click on Currency")
	public void user_click_on_currency() {
    
		homepage.clickOn_Currency();
		logger.info("User clicked on Currency");
	}
	
	@When("User Choose Euro from dropdown")
	public void user_chose_euro_from_dropdown() {
		
		homepage.clickOn_Currency_Euro();
		logger.info("User Chose Euro from dropdown");
		
	}
	
	@Then("currency value should change to Euro")
	public void currency_value_should_change_to_euro() {
		
		Assert.assertTrue( homepage.isDisplayed_Currency_€() );
		logger.info("currency value changed to Euro");
		//Util.takeScreenShot();
		ThreadSleepMethod(3);
	}
	
		
	
	
	
	
	
	
	//Scenario 2
	@When("User click on shopping cart")
	public void user_click_on_shopping_cart() {
	    
		homepage.clickOn_Shopping_Cart();
		logger.info("User clicked on shopping car");
		
	}
	
	@Then("“Your shopping cart is empty!” message should display")
	public void your_shopping_cart_is_empty_message_should_display() {
	   
		Assert.assertTrue( homepage.isDisplayed_EmptyCart_Message() ) ;
		logger.info(" “Your shopping cart is empty!” message displayed ");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
