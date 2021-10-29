package com.demo.app.test.stepdef;

import java.util.ArrayList;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.demo.app.test.objects.CartPageObjects;
import com.demo.app.test.objects.HomePageObjects;
import com.demo.app.test.objects.WishListPageObjects;
import com.demo.app.test.reusable.CommonUtils;
import com.demo.app.test.reusable.ReadProperties;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ApplicationsStepsDefinition {
	
	private WebDriver driver = AppHooks.driver;
	private WebDriverWait wait;
	public CommonUtils cl = new CommonUtils(driver, this.wait);
	ArrayList<Double> prodRate = new ArrayList<Double>();
	ArrayList<String> wishlist = new ArrayList<String>();
	double lowestPriceProduct=0;
	String cartHeader = null;

	public ApplicationsStepsDefinition() throws Exception {
		ReadProperties propertiesReader = new ReadProperties();
		this.wait = new WebDriverWait(driver, propertiesReader.getTimeout());
	}

	@Given("^I add \"([^\"]*)\" different products to my wishlist$")
	public void i_add_different_product_to_my_wish_list(String count) {
		HomePageObjects homePageObjects = new HomePageObjects(driver, wait);
		homePageObjects.clickAcceptAll();
		int wishCount = Integer.parseInt(count);
		if(homePageObjects.lstAddWishList().size()>0) {
			homePageObjects.moveToElement(homePageObjects.lstAddWishList().get(0));
			for (int productCount = 0; productCount < wishCount; productCount++) {
				String productName = homePageObjects.getTextFromElement(homePageObjects.lstProductType().get(productCount));
				wishlist.add(productName);
				homePageObjects.clickOnElement(homePageObjects.lstAddWishList().get(0));
				if (homePageObjects.addedWishListDisplayed())
					System.out.println("Product " +productName+ " added to wishlist successfully");
			}
		}
	}

	
	@When("^I view my wishlist table$")
	public void i_view_my_wishlist_table() {
		HomePageObjects homePageObjects = new HomePageObjects(driver, wait);
		homePageObjects.clickWishListIcon();
	}

	@Then("^I find total \"([^\"]*)\" selected items in my wishlist$")
	public void i_find_total_selected_items_in_my_Wishlist(String arg1) {
		WishListPageObjects mywishlist = new WishListPageObjects(driver, wait);
		for(int listcount = 0; listcount < mywishlist.productwishlistSize(); listcount++) {
			String actualValue = mywishlist.getTextFromElement(mywishlist.productWishList().get(listcount));
			String arraywishValue = wishlist.get(mywishlist.productwishlistSize()-(listcount+1));
			Assert.assertTrue(actualValue.equals(arraywishValue));
		}
	}

	@When("^I search for \"([^\"]*)\" price product$")
	public void i_search_for_price_product(String arg1)  {
		HomePageObjects homePageObjects = new HomePageObjects(driver, wait);
		for(int priceCount=0;priceCount<homePageObjects.priceList().size();priceCount++) {
			String act = homePageObjects.getTextFromElement(homePageObjects.priceList().get(priceCount)).replace("£", "");
			prodRate.add(Double.parseDouble(act));
		}
		int amountElement=0;
		for(int amountValue=1;amountValue<prodRate.size();amountValue++) {
			if(prodRate.get(amountElement)<prodRate.get(amountValue)) 
				lowestPriceProduct = prodRate.get(amountElement);
			else
				amountElement=amountValue;
			if(amountValue==prodRate.size())
				break;
		}
		System.out.println(lowestPriceProduct);
	}

	@When("^I am able to add the \"([^\"]*)\" price item to my cart$")
	public void i_am_able_to_add_the_price_item_to_my_cart(String arg1)  {
		HomePageObjects homePageObjects = new HomePageObjects(driver, wait);
		for(int i=0;i<homePageObjects.addToCartPriceList().size();i++) {
			String rate = lowestPriceProduct+"";
			if(homePageObjects.getTextFromElement(homePageObjects.addToCartPriceList().get(i)).contains(rate)) {
				homePageObjects.moveToElement(homePageObjects.listbtnAddtoCart().get(i));
				homePageObjects.clickOnElement(homePageObjects.listbtnAddtoCart().get(i));
				cartHeader = homePageObjects.getTextFromElement(homePageObjects.addtoCartHeader().get(i));
				if (homePageObjects.viewCartDisplayed()) 
					System.out.println("Lowest price item is added to card successfully");
				break;
			}
		}
	}

	@Then("^I am able to verify the item in my cart$")
	public void i_am_able_to_verify_the_item_in_my_cart()  {
		CartPageObjects cartPageObjects = new CartPageObjects(driver, wait);
		cartPageObjects.clickCart();
		Assert.assertTrue(cartHeader.equals(cartPageObjects.getlblCart()));;
	}

}
