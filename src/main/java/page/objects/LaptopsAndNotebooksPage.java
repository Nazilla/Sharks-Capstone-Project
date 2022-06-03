package page.objects;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class LaptopsAndNotebooksPage extends Base {

	
	public LaptopsAndNotebooksPage (){
		
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	
	@FindBy (xpath ="//a[text()='Show All Laptops & Notebooks']")
	private WebElement ShowAllLaptopsAndNotebooks;
	
	@FindBy (xpath ="//a[text()='MacBook']")
	private WebElement MacBookItem;
	
	@FindBy (xpath ="//div[@class='alert alert-success alert-dismissible']")
	private WebElement Mac_addToCart_SuccessMessage;
	
	@FindBy (xpath ="//div[@id='cart']")
	private WebElement Cart;
	
	@FindBy (xpath ="//button[@title='Remove']")
	private WebElement X_button_ForRemove;
	
	@FindBy (xpath ="//div[@class='product-layout product-grid col-lg-4 col-md-4 col-sm-6 col-xs-12'][2]//button[@data-original-title='Compare this Product']")
	private WebElement MacBook_CompareThisProduct;
	
	@FindBy (xpath ="//div[@class='product-layout product-grid col-lg-4 col-md-4 col-sm-6 col-xs-12'][3]//button[@data-original-title='Compare this Product']")
	private WebElement MacBookAir_CompareThisProduct;
	
	@FindBy (xpath ="//div[@class='alert alert-success alert-dismissible']")
	private WebElement MacBookAir_productComparison_Message;
	
	@FindBy (xpath ="//a[text()='product comparison']" )
	private WebElement ProductComparison_Link;
	
	@FindBy (xpath ="//h1[text()='Product Comparison']")
	private WebElement ProductComparison_Header;
	
	@FindBy (xpath ="//strong[text()='MacBook']")
	private WebElement MacBook_OnProductComparison;
	
	@FindBy (xpath ="//strong[text()='MacBook Air']")
	private WebElement MacBookAir_OnProductComparison;
	
	@FindBy (xpath ="//div[@class='product-layout product-grid col-lg-4 col-md-4 col-sm-6 col-xs-12'][5]//button[@data-original-title='Add to Wish List']")
	private WebElement SonyVAIO_AddToWishList;
	
	@FindBy (xpath ="//div[@class='alert alert-success alert-dismissible']")
	private WebElement WishListMessage;
	
	@FindBy (xpath ="//a[text()='MacBook Pro']")
	private WebElement MacBookPro_Item;
	
	@FindBy (xpath ="//h2[text()='$2,000.00']")
	private WebElement priceOf_MacBookPro_Item;
	
	
	
	
	
	
	
	
	
	
	public void clickOn_ShowAllLaptopsAndNotebooks() {
		
		ShowAllLaptopsAndNotebooks.click();
	}
	
	public void clickOn_MacBookItem() {
		
		MacBookItem.click();
	}
	
	public String MacBook_addToCart_SuccessMessage_Text() {
		
		return Mac_addToCart_SuccessMessage.getText();
	}
	
	public String getText_Cart() {
		
		return Cart.getText();
	}
	
	public void clickOn_Cart() {
		
		Cart.click();
	}
	
	public void clickOn_X_button_ForRemove() {
		
		X_button_ForRemove.click();
	}
	
	public void clickOn_MacBook_CompareThisProduct() {
		
		MacBook_CompareThisProduct.click();
	}
	
	public void clickOn_MacBookAir_CompareThisProduct() {
		
		MacBookAir_CompareThisProduct.click();
	}
	
	public String getText_MacBookAir_productComparison_Message() {
		
		return MacBookAir_productComparison_Message.getText();
	}
	
	public void clickOn_ProductComparison_Link() {
		
		ProductComparison_Link.click();
	}
	
	public void isdiplayed_ProductComparison_Header() {
		
		Assert.assertTrue( ProductComparison_Header.isDisplayed() );
	}
	
	public void isDisplayed_MacBook_OnProductComparison() {
		
		Assert.assertTrue( MacBook_OnProductComparison.isDisplayed() );
	}
	
	public void isDisplayed_MacBookAir_OnProductComparison() {
		
		Assert.assertTrue( MacBookAir_OnProductComparison.isDisplayed() );
	}
	
	public void clickOn_SonyVAIO_AddToWishList() {
		
		SonyVAIO_AddToWishList.click();
	}
	
	public String  getText_WishListMessage() {
		
		return WishListMessage.getText();
	}
	
	public void clickOn_MacBookPro_Item() {
		
		MacBookPro_Item.click();
	}
	
	public String getText_priceOf_MacBookPro_Item() {
		
		return priceOf_MacBookPro_Item.getText();
	}
	
	
	
	
	
	
	
	
}
