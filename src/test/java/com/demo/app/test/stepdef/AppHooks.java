package com.demo.app.test.stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;

import com.demo.app.test.reusable.ReadProperties;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AppHooks {
	
	public static WebDriver driver;

	@Before
	public void openBrowser() throws Exception {

		ReadProperties propertiesReader = new ReadProperties();
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(propertiesReader.getTimeout(), TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(ReadProperties.getPropValue("appUrl"));
	}

	@After
	public void teardown(Scenario scenario) {

		if(scenario.isFailed()) {
			try {
				byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
				scenario.embed(screenshot, "image/png");
			} catch (WebDriverException e) {
				System.err.println(e.getMessage());
			}
		}
		driver.quit();
	}

}
