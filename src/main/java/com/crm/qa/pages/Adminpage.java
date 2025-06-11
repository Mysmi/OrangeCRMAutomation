package com.crm.qa.pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.BaseClass;
import com.crm.qa.utility.TestUtil;

public class Adminpage extends BaseClass {
	
	
	
	
	public Adminpage(){
		
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//span[text()='Admin']")
	WebElement admintab;
	
	@FindBy(xpath="//*[@aria-label='Topbar Menu']//ul//li")
	List <WebElement> alldata;
	
	@FindBy(xpath="//span//h6[text()='User Management']")
	WebElement admintitle;
	
	@FindBy(xpath="//*[text()='qwertyuiuytr']")
	WebElement usernamedisplay;
	
	
	
	
	public void clickadmintab() {
		admintab.click();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(TestUtil.PAGE_LOAD_TIMEOUT));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TestUtil.IMPLICIT_WAIT));
		
//		boolean name=usernamedisplay.isDisplayed();
//		System.out.println(name);
	}
	
	public boolean title() {
		return admintitle.isDisplayed();
	}
	
	
	public void userdata() {
		
		for(WebElement els:alldata) {
			System.out.println(els.getTagName()+" "+ els.getText());
		}
		
		
	}

}
