package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.basepackage.BaseClass;

public class LoginPage extends BaseClass {

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id='login-link']")
	private WebElement loginButton;

	public WebElement getLoginButton() {
		return loginButton;
	}

	public void clickLogin() {
		getLoginButton().click();
	}

	
	
	@FindBy(xpath = "//*[@placeholder='User']")
	private WebElement userName;

	public WebElement getUserName() {
		return userName;
	}

	public void enterUserName(String userName) {
		getUserName().sendKeys(userName);
	}

	
	@FindBy(xpath = "//*[@placeholder='Password']")
	private WebElement passWord;

	public WebElement getPassword() {
		return passWord;
	}

	public void enterPassword(String passWord) {
		getPassword().sendKeys(passWord);
	}
	
	@FindBy(xpath = "//*[text()='Submit']")
	private WebElement submit;

	public WebElement getSubmit() {
		return submit;
	}

	public void clickSubmit() {
		getSubmit().click();
	}
	
	@FindBy(xpath = "//*[@class='personal-label']")
	private WebElement user;

	public WebElement getUser() {
		return user;
	}

	public String getActualUserName() {
		String actualUserName = getUser().getText();
		return actualUserName;
	}
	
	public void userLogin(String userName, String passWord) {	
		getUserName().sendKeys(userName);
		getPassword().sendKeys(passWord);
		getSubmit().click();
	}
	
}
