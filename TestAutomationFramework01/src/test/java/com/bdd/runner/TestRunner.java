package com.bdd.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.TestNGCucumberRunner;


@CucumberOptions(features = "src/main/resources/Features",glue= "com.bdd.steps",tags = "@Login1linkvalidation",plugin = {"pretty","html:target/cucmber-reports.html","json:target/cucumber.json"},monochrome = false)


public class TestRunner extends AbstractTestNGCucumberTests {
	
	TestNGCucumberRunner cucumberRunner = new TestNGCucumberRunner(this.getClass());
	

}
