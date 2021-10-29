package com.demo.app.test.objects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.demo.app.test.reusable.CommonUtils;

public class WishListPageObjects extends CommonUtils {
	
	public WishListPageObjects(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//td[@class='product-name']/a")
	public List<WebElement> listProductwishlist;

	public int productwishlistSize() {
		return listProductwishlist.size();
	}

	public List<WebElement> productWishList() {
		return listProductwishlist;
	}
}
