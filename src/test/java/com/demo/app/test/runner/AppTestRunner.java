package com.demo.app.test.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features/addProducts.feature",
		glue = {"com.demo.app.test.stepdef"},
		plugin = {
				"pretty",
				"html:target/cucumber-reports/cucumber-pretty",
				"json:target/cucumber-reports/ApplicationTestReport.json",
				"junit:target/cucumber-reports/ApplicationTestReport.xml",
		},
		tags = "@apptest")

public class AppTestRunner {

}
