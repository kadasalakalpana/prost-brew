package com.fb.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.fb.pages.Register;

/**
 * @author Dinesh Reddy
 * 
 * About Class - This class will locate the webElements of Facebook 
 * 				Category - Create Account - element locators
 *
 */
public class Register_Locators {
	
	//url 
	public static final String URL = "https://www.facebook.com/";
	
	// FB Create Account WebElements 	
	public static By FirstName = By.xpath("//input[@name='firstname']");
	public static By LastName = By.xpath("//input[@name='lastname']");
	public static By MobileNumber_or_email = By.id("u_0_o");
	public static By Password = By.name("reg_passwd__");
	public static By Signup_Button = By.id("u_0_11");
	
	//Birthday WebElements
	public static By Date = By.xpath("//select[@id='day']");
	public static By month = By.xpath("//select[@id='month']");
	public static By Year = By.xpath("//select[@id='year']");
	
	// Radio Button elements
	public static By male_RB = By.id("u_0_a");
	public static By Female_RB = By.id("u_0_9");
	
	// Passing Values - First Name and Last Name	
	public static String firstName_value = "Dinesh";
	public static String LastName_value = "Reddy";
	public static String MobileNumber_or_email_value = "9999999999";
	public static String password_value = "forgot";

}
