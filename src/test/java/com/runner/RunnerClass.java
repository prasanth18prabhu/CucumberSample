package com.runner;


import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
 
@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\VDI003\\eclipse-workspace\\45\\PS\\CucumberProject\\src\\test\\resources\\Features",
		glue = "com.stepdefinition",
		plugin = {"pretty","json:target/JsonReport.json","html:target/HtmlReport.html"},
		monochrome = true , dryRun=true,
		tags = ""
		)
public class RunnerClass {

}
