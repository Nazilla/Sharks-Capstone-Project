package page.objects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class DesktopsPage extends Base{
	
	
	public DesktopsPage (){
		
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy( xpath = "//div[@class = 'image']" )
	private List<WebElement> items;
	
	@FindBy( xpath = "//div[@class='product-layout product-grid col-lg-4 col-md-4 col-sm-6 col-xs-12'][3]//span[text()='Add to Cart']")
	private WebElement HP_LP3065_AddToCart;
	
	@FindBy( xpath = "//input[@id='input-quantity']")
	private WebElement quantity;
	
	@FindBy ( xpath = "//button[text()='Add to Cart']")
	private WebElement AddToCartLvl2;
	
	@FindBy ( xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement successMessage_hp;
	
	@FindBy ( xpath = "//div[@class='product-layout product-grid col-lg-4 col-md-4 col-sm-6 col-xs-12'][2]//span[text()='Add to Cart']" )
	private WebElement Canon_EOS_5D_AddToCart;
	
	@FindBy ( xpath = "//select[@id='input-option226']//option[2]" )
	private WebElement Canon_Dropdown_Red;
	
	@FindBy ( xpath = "//div[@class='alert alert-success alert-dismissible']" )
	private WebElement successMessage_Canon;
	
	@FindBy ( xpath = "//h4//a[text()='Canon EOS 5D Camera']" )
	private WebElement Canon_EOS_5D_Camera;
	
	@FindBy ( xpath = "//ul[@class='nav nav-tabs']//li[2]" )
	private WebElement Review;
	
	@FindBy (xpath = "//input[@id='input-name']")
	private WebElement YourName;
	
	@FindBy ( xpath = "//textarea[@id='input-review']" )
	private WebElement YourReview;
	
	@FindBy ( xpath = "//input[@type='radio'][1]" )
	private WebElement Bad_rating;
	
	@FindBy ( xpath = "//input[@type='radio'][5]" )
	private WebElement Good_rating;
	
	@FindBy ( xpath = "//button[@id='button-review']" )
	private WebElement continueButton;
	
	@FindBy ( xpath = "//div[@class='alert alert-success alert-dismissible']" )
	private WebElement SuccessReviewMassage;
	
	
	
	
	
	
	
	
	
	public List<WebElement> elements() {
		List<WebElement> itemsOnDesktopPage = items;
		return itemsOnDesktopPage;
	}
	
	
	public void clickOn_HP_LP3065_addTOCart() {
		
		HP_LP3065_AddToCart.click();
	}
	
	
	public void clearQuantity() {
		
		quantity.clear();
	}
	
	
	public void sendKeysToQuantity(String QTY) {
		
		quantity.sendKeys( QTY );
	}
	
	
	public void AddToCartLVL2() {
		
		AddToCartLvl2.click();
	}
	
	
	public String SuccessMessageGetText_hP() {
		
		return successMessage_hp.getText();
	}
	
	
	public void clickOn_Canon_EOS_5D_addTOCart() {
		
		Canon_EOS_5D_AddToCart.click();
	}
	
	
	public void clickOn_Canon_DropDown_Red() {
		
		Canon_Dropdown_Red.click();
	}
	
	
	public String SuccessMessageGetText_Canon() {
		
		return successMessage_Canon.getText();
	}
	
	
	public void clickOn_Canon_EOS_5D_Camera() {
		
		Canon_EOS_5D_Camera.click();;
	}
	
	
	public void clickOn_Review() {
		
		Review.click();
	}
	
	
	public void enterYourName(String name) {
	
		YourName.sendKeys(name);
	}
	
	
	public void enterYourReview(String review) {
		
		YourReview.sendKeys(review);
	}
	
	//check again
	public void Ratings(String str) {
		
		if (str =="Bad" || str =="bad") {	
			Bad_rating.click();
		}
		else {
			Good_rating.click();
		}
		
	}
	
	
	public void clickOn_ContinueButton() {
		
		continueButton.click();
	}
	
	public String successReviewMassage() {
		
		return SuccessReviewMassage.getText();
	}
	

	
	
	
	
	
	
	
	
	
}
