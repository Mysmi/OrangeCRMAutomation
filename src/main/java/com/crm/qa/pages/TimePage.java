package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.BaseClass;

public class TimePage extends BaseClass {
	
	
	TimePage(){
		
		PageFactory.initElements( driver,this);
	}
	
	@FindBy(xpath="")
	WebElement username;

}
