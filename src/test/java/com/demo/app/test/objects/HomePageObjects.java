package com.demo.app.test.objects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.demo.app.test.reusable.CommonUtils;

public class HomePageObjects extends CommonUtils {
	
	public HomePageObjects(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//*[text()='Add to wishlist']")
	public List<WebElement> addWishlistBtn;

	@FindBy(xpath="//*[@class='cc-btn cc-accept-all cc-btn-no-href']")
	public WebElement acceptAllBtn;

	@FindBy(xpath="//*[contains(@class,'product-type')]//h2")
	public List<WebElement> labelProductType;

	@FindBy(xpath="(//*[@class='lar la-heart'])[1]")
	public WebElement buttonWishListIcon;

	@FindBy(xpath="//td[@class='product-price']//span[@class='woocommerce-Price-amount amount']")
	public List<WebElement> labellPrices;

	@FindBy(xpath="//*[text()='Add to cart']")
	public List<WebElement> buttonAddToCart;

	@FindBy(xpath="//td[@class='product-add-to-cart']/preceding-sibling::td[@class='product-price']")
	public List<WebElement> listPriceCart;

	@FindBy(xpath="//td[@class='product-add-to-cart']/preceding-sibling::td[@class='product-name']")
	public List<WebElement> listAddtoCartHeader;

	@FindBy(xpath="//div[@class='woocommerce-message']")
	public WebElement buttonViewCard;

	@FindBy(xpath="//div[@class='yith-wcwl-wishlistaddedbrowse']")
	public WebElement buttonAddedWishList;
	
	@FindBy(xpath="//div[text()='Product added!']")
	public WebElement labelProductAdded;
	
	
	public boolean addedWishListDisplayed() {
		return buttonAddedWishList.isDisplayed();
	}

	public boolean viewCartDisplayed() {
		return buttonViewCard.isDisplayed();
	}

	public List<WebElement> addtoCartHeader() {
		return listAddtoCartHeader;
	}

	public List<WebElement> listbtnAddtoCart() {
		return buttonAddToCart;
	}

	public List<WebElement> addToCartPriceList() {
		return listPriceCart;
	}

	public List<WebElement> priceList() {
		return labellPrices;
	}

	public void clickAcceptAll() {
		clickOnElement(acceptAllBtn);
	}

	public List<WebElement> lstAddWishList() {
		return addWishlistBtn;
	}

	public List<WebElement> lstProductType() {
		return labelProductType;
	}

	public void clickWishListIcon() {
		clickOnElement(buttonWishListIcon);
	}

}
