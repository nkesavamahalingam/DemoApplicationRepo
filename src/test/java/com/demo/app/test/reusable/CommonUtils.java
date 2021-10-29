package com.demo.app.test.reusable;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonUtils {
	private static WebDriver driver;
	private static WebDriverWait wait;
	ReadProperties propertiesReader = new ReadProperties();


	public CommonUtils(WebDriver driver, WebDriverWait wait) {
		CommonUtils.driver = driver;
		CommonUtils.wait = wait;
	}

	public Long getTime() throws Exception {
		Long waitUnit = propertiesReader.getTimeout();
		return waitUnit;
	}
	protected void WaitUntilElementVisible(WebElement element) {
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public void clickOnElement(WebElement element){
		WaitUntilElementVisible(element);
		element.click();
	}

	public void typeIntoElement(WebElement element, String textTotype) {
		WaitUntilElementVisible(element);
		element.sendKeys(textTotype);
	}

	public String getTextFromElement(WebElement element) {
		WaitUntilElementVisible(element);
		return element.getText();
	}

	public void moveToElement(WebElement element){
		Actions actions = new Actions(driver);
		actions.moveToElement(element).build().perform();
	}

}
