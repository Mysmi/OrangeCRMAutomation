package com.crm.qa.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.BaseClass;

public class Homepage extends BaseClass {
	
	
	public Homepage(){
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//h6[(text()='Dashboard')]")
	WebElement dashboradtitle;
	
	
	
	@FindBy(xpath="//*[@class='oxd-userdropdown-name']")
	WebElement username;
	
	@FindBy (xpath="//*[@class='oxd-main-menu'] //child::li")
	List <WebElement> function;
	
	@FindBy(xpath="//*[@class='orangehrm-dashboard-widget-name'] //child::p")
	List <WebElement> dashboradfunctions;
	
	
	
	public boolean dashtitle() {
		
		return dashboradtitle.isDisplayed();
		


	}
	
	public String username() {
		
		return username.getText();
	}
	
	public void allfuction() {
		
		for (WebElement item : function) {
            System.out.println(item.getText().trim());
        }
	
	}
	
public void dashfuction() {
		
		for (WebElement item : dashboradfunctions) {
            System.out.println(item.getText().trim());
        }
	
	}


	

}
