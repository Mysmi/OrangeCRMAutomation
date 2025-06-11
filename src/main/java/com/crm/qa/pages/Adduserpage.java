package com.crm.qa.pages;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.BaseClass;
import com.crm.qa.utility.TestUtil;

public class Adduserpage extends BaseClass{
	
	
	public Adduserpage(){
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//span[text()='PIM']")
	WebElement pimbutton;
	
	@FindBy(xpath="//*[@type='button' and text()=' Add ']")
	WebElement addbutton;
	
	@FindBy(xpath="//*[@name='firstName']")
	WebElement firstname;
	
	@FindBy(xpath="//*[@name='lastName']")
	WebElement lastname;
	
	
	
	@FindBy(xpath="//*[@placeholder='Type for hints...']")
	WebElement Employename;
	
	@FindBy(xpath="//*[@class='oxd-switch-input oxd-switch-input--active --label-right']")
	WebElement checkboxbutton;
	
	
	
	@FindBy(xpath="//*[text()='Username']//parent::div//following-sibling::div//input[@class='oxd-input oxd-input--active']")
	WebElement username;
	
	@FindBy(xpath="//*[text()='Password']//parent::div//following-sibling::div//input[@type='password']")
	WebElement newpassword;
	
	@FindBy(xpath="//*[text()='Confirm Password']//parent::div//following-sibling::div//input[@type='password']")
	WebElement confirmpassword;
	
	
	
	@FindBy(xpath="//*[@type='submit']")
	WebElement savebutton;
	
	
	@FindBy(xpath="//*[@class='oxd-input oxd-input--focus']")
	WebElement DLnumber;
	
	@FindBy(xpath="//*[text()='License Expiry Date']//parent:: div//following-sibling::div//*[@placeholder='yyyy-dd-mm']")
	WebElement LicenseExpiryDate;
;
	
	@FindBy(xpath="//*[text()='Date of Birth']//parent:: div//following-sibling::div//*[@placeholder='yyyy-dd-mm']")
	WebElement DateofBirth;
	
	@FindBy(xpath="//*[text()='Male']//*[@type='radio']")
	WebElement Gendor;
	
	@FindBy(xpath="//*[text()='Marital Status']//parent:: div//following-sibling::div//*[text()='-- Select --' and @tabindex=\"0\"]")
	WebElement Maratialstatus;
	
	@FindBy(xpath="//*[text()='Blood Type']//parent:: div//following-sibling::div//*[text()='-- Select --' and @tabindex=\"0\"]")
	WebElement bloodgroup;
	
	
	
	
	public void enterdata(String frist,String last,String user,String np,String cp ) {
		
		pimbutton.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TestUtil.IMPLICIT_WAIT));
		addbutton.click();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(TestUtil.PAGE_LOAD_TIMEOUT));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TestUtil.IMPLICIT_WAIT));
		firstname.sendKeys(frist);
		lastname.sendKeys(last);
		///Employename.sendKeys("Sumit Bhardwaj");
		
		checkboxbutton.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TestUtil.IMPLICIT_WAIT));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(TestUtil.PAGE_LOAD_TIMEOUT));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TestUtil.IMPLICIT_WAIT));
		username.sendKeys(user);
		newpassword.sendKeys(np);
		confirmpassword.sendKeys(cp);
		
		savebutton.click();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(TestUtil.PAGE_LOAD_TIMEOUT));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TestUtil.IMPLICIT_WAIT));
	}
	
	public void userdetails() {
		
		//DLnumber.sendKeys("4567898765456787");
		
		LicenseExpiryDate.sendKeys("2026-04-06");
		DateofBirth.sendKeys("1999-08-26");
		
		//Gendor.click();
		
		Maratialstatus.sendKeys("Single");
		
		bloodgroup.sendKeys("B-");
		savebutton.click();
		
		
		
	}
	
	

}
