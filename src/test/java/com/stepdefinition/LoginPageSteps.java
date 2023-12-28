package com.stepdefinition;

import java.time.Duration;

import com.basepackage.BaseClass;
import com.pageobjectmanager.PageObjectManager;
import com.pages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class LoginPageSteps extends BaseClass {

	PageObjectManager pom = new PageObjectManager();
	
	
	@Given("user needs to launch browser")
	public void user_needs_to_launch_browser() {
		
		browserLaunch();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	}

	@When("navigate to the cyclos webpage")
	public void navigate_to_the_cyclos_webpage() {
		loadUrl("https://demo.cyclos.org/ui/home");
	}

	@Then("verify user enter into the cyclos page {string}")
	public void verify_user_enter_into_the_cyclos_page(String expectedUrl) {
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(expectedUrl, currentUrl);
	}

	@Given("user needs to click login button")
	public void user_needs_to_click_login_button() {
	
	pom.getLoginPages().clickLogin();
	}

	@When("user needs to enter valid credentials {string} and {string}")
	public void user_needs_to_enter_valid_credentials_and(String userName, String passWord) {
		pom.getLoginPages().userLogin(userName, passWord);
	}

	@Then("validate the user has succesfully logged in {string}")
	public void validate_the_user_has_succesfully_logged_in(String expectedUserName) {
	
		String actualUserName = pom.getLoginPages().getActualUserName();
		Assert.assertEquals(expectedUserName, actualUserName);
		close();
	}
}
