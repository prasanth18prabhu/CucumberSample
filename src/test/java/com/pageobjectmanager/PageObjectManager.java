package com.pageobjectmanager;

import com.basepackage.BaseClass;
import com.pages.LoginPage;

public class PageObjectManager extends BaseClass {
	
	private LoginPage loginpages;
	
	
	
	
	public LoginPage getLoginPages() {
		
		return (loginpages == null)? loginpages= new LoginPage(): loginpages;
	
	}
	
	
   
	
	
	
	
 
}
