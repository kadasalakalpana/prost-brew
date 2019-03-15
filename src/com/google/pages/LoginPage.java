/**
 * 
 */
package com.google.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author Dinesh Reddy
 * 
 *         Test - Testing gmail login page the below locators are Gmail Login
 *         page locators - This class will store the all the locators and methods
 *         of login page
 *
 */
public class LoginPage {

	public  WebDriver d;
	
	// Finding locators in Gmail page
		By uname = By.id("login-username");
		By pass = By.xpath("");
		By next_button = By.name("");


	// Constructor
	public LoginPage(WebDriver d) {
		this.d = d;
	}

	// launching browser
	public void launchbrowser() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Lib\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
	}

	
	public void enterURL(String url) {
		d.get(url);
	}

	public void username(String username) {
		d.findElement(uname).sendKeys(username);

	}

	public void password(String Pass) {
		d.findElement(pass).sendKeys(Pass);

	}

	// verification point
	public void verify_uname_value() {
		String obj = d.findElement(uname).getAttribute("value");
		System.out.println("Entered username is :" + obj);
	}

	public void closebrowser() {
		d.quit();

	}
}
