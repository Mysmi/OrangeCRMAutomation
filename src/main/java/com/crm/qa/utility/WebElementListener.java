package com.crm.qa.utility;

import com.crm.qa.base.BaseClass;

//import org.openqa.selenium.support.events.WebDriverEventListener;
import org.openqa.selenium.support.events.WebDriverListener;

import java.io.IOException;

import org.openqa.selenium.By;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	//import org.openqa.selenium.support.events.WebDriverEventListener;

	//import com.crm.qa.base.TestBase;

	public class WebElementListener extends BaseClass implements WebDriverListener{

		@Override
	    public void beforeNavigateTo(WebDriver driver, String url) {
	        System.out.println("Before navigating to: '" + url + "'");
	    }

	    @Override
	    public void afterNavigateTo(WebDriver driver, String url) {
	        System.out.println("Navigated to: '" + url + "'");
	    }

	    @Override
	    public void beforeClick(WebElement element) {
	        System.out.println("Trying to click on: " + describeElement(element));
	    }

	    @Override
	    public void afterClick(WebElement element) {
	        System.out.println("Clicked on: " + describeElement(element));
	    }

	    @Override
	    public void beforeChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
	        System.out.println("Before changing value of: " + describeElement(element));
	    }

	    @Override
	    public void afterChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
	        System.out.println("After changed value of: " + describeElement(element));
	    }

	    @Override
	    public void beforeNavigateBack(WebDriver driver) {
	        System.out.println("Navigating back to previous page");
	    }

	    @Override
	    public void afterNavigateBack(WebDriver driver) {
	        System.out.println("Navigated back to previous page");
	    }

//	    @Override
//	    public void beforeNavigateForward(WebDriver driver) {
//	        System.out.println("Navigating forward to next page");
//	    }

//	    @Override
//	    public void afterNavigateForward(WebDriver driver) {
//	        System.out.println("Navigated forward to next page");
//	    }
//
//	    @Override
//	    public void onError(Object target, Method method, Object[] args, InvocationTargetException e) {
//	        System.out.println("Exception occurred in method: " + method.getName());
//	        e.getCause().printStackTrace();
//	        Resuabledata.Screnshot();// <-- Assuming this is your utility method
//	    }

	    @Override
	    public void beforeFindElement(WebDriver driver, By locator) {
	        System.out.println("Trying to find element by: " + locator.toString());
	    }

	    @Override
	    public void afterFindElement(WebDriver driver, By locator, WebElement result) {
	        System.out.println("Found element by: " + locator.toString());
	    }

//	    @Override
//	    public void beforeAlertAccept(WebDriver driver) {
//	        System.out.println("Before accepting alert");
//	    }
//
//	    @Override
//	    public void afterAlertAccept(WebDriver driver) {
//	        System.out.println("After accepting alert");
//	    }
//
//	    @Override
//	    public void beforeAlertDismiss(WebDriver driver) {
//	        System.out.println("Before dismissing alert");
//	    }
//
//	    @Override
//	    public void afterAlertDismiss(WebDriver driver) {
//	        System.out.println("After dismissing alert");
//	    }
//
//	    @Override
//	    public void beforeNavigateRefresh(WebDriver driver) {
//	        System.out.println("Before refreshing page");
//	    }
//
//	    @Override
//	    public void afterNavigateRefresh(WebDriver driver) {
//	        System.out.println("After refreshing page");
//	    }
//
//	    @Override
//	    public void beforeSwitchToWindow(WebDriver driver, String windowName) {
//	        System.out.println("Before switching to window: " + windowName);
//	    }
//
//	    @Override
//	    public void afterSwitchToWindow(WebDriver driver, String windowName) {
//	        System.out.println("Switched to window: " + windowName);
//	    }

	    @Override
	    public void beforeGetText(WebElement element) {
	        System.out.println("Getting text from: " + describeElement(element));
	    }

	    @Override
	    public void afterGetText(WebElement element, String text) {
	        System.out.println("Got text: '" + text + "' from element: " + describeElement(element));
	    }

	  

	    // Optional helper for cleaner element description
	    private String describeElement(WebElement element) {
	        try {
	            String tag = element.getTagName();
	            String id = element.getAttribute("id");
	            String name = element.getAttribute("name");
	            return String.format("<%s id='%s' name='%s'>", tag, id, name);
	        } catch (Exception e) {
	            return element.toString(); // fallback
	        }
	    }
	}
	
	
	
	
	
	
	
	

