package com.fb.pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.fb.utils.Register_Locators;

/**
 * @author Dinesh Reddy :-About this class - Method Logics are implemented -
 *         Locators of this class are taken from - "Register_locators"
 *
 */
public class Register {

	public static WebDriver d;

	public Register(WebDriver driver) {
		Register.d = driver;
	}

	public void type_firstName(String type_firstname_value) {
		d.findElement(Register_Locators.FirstName).sendKeys(type_firstname_value);

	}

	public void type_LastName(String type_LastName) {
		d.findElement(Register_Locators.LastName).sendKeys(type_LastName);

	}

	public void phonenumber_email(String phone_email) {
		d.findElement(Register_Locators.MobileNumber_or_email).sendKeys(phone_email);
	}

	public void password(String pass) {
		d.findElement(Register_Locators.Password).sendKeys(pass);
	}

	// Signup button
	public void click_signup() {
		d.findElement(Register_Locators.Signup_Button).click();
	}

	// Get the entered attribute values
	public void entered_values() {
		String firstName_value = d.findElement(Register_Locators.FirstName).getAttribute("value");
		System.out.println("Entered FirstName is:" + firstName_value);

		String lastName_value = d.findElement(Register_Locators.LastName).getAttribute("value");
		System.out.println("Entered LastName is :" + lastName_value);

		String MobileNumber_or_email = d.findElement(Register_Locators.MobileNumber_or_email).getAttribute("value");
		System.out.println("Entered Mobile or email id is :" + MobileNumber_or_email);

		String Password = d.findElement(Register_Locators.Password).getAttribute("value");
		System.out.println("Entered password is :" + Password);

	}

	// Radio Button
	public void radio_button() {

		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// male and female radio buttons display status
		boolean mrbutton = d.findElement(Register_Locators.male_RB).isDisplayed();
		System.out.println("Male radio button status :" + mrbutton);

		boolean frbutton = d.findElement(Register_Locators.male_RB).isDisplayed();
		System.out.println("Female radio button status :" + frbutton);

		// click male radio button
		boolean mrbutton_f;
		boolean frbutton_f;

		if (mrbutton == true) {
			d.findElement(Register_Locators.male_RB).click();
			mrbutton_f = d.findElement(Register_Locators.male_RB).isSelected();
			System.out.println("Male radio button status - clicked or not :" + mrbutton_f);
			if (mrbutton_f == true) {
				System.out.println("Male radio button is clicked ");
			} else {
				System.out.println("male radio button is not clicked");
			}

		}

	}

	// Birthday Sample method - Partially implemented for practice
	public void birthday() {

		// Birthday Date
		WebElement date = d.findElement(By.xpath("//select[@id='day']"));
		Select db_date = new Select(date);
		// db.selectByIndex(2);
		// db.selectByVisibleText("");

		// To print all drop down box values
		List<WebElement> elementCount_date = db_date.getOptions();
		int iSize_date = elementCount_date.size();
		System.out.println("Total Birthday date list :" + iSize_date); // to count how many items
		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		for (int i = 0; i < iSize_date; i++) {
			String sValue = elementCount_date.get(i).getText();
			System.out.println(sValue);
		}

		// Birthday Month
		WebElement month = d.findElement(By.xpath("//select[@id='month']"));
		Select db_month = new Select(month);
		// we can select by - index (or), select by visible text
		// To print all drop down box values
		List<WebElement> elementCount_month = db_month.getOptions();
		int iSize_month = elementCount_month.size();
		System.out.println("Total Birthday month list :" + iSize_month); // to count how many items
		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		for (int j = 0; j < iSize_month; j++) {
			String s_month = elementCount_month.get(j).getText();
			System.out.println(s_month);
		}

		// Birthday year
		WebElement year = d.findElement(By.xpath("//select[@id='year']"));
		Select db_year = new Select(year);

		List<WebElement> elementCount_year = db_year.getOptions();
		int iSize_year = elementCount_year.size();
		System.out.println("(partially implemented) - Total Birthday year list  :" + iSize_year); // to count how many
																									// items
		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		for (int k = 0; k < iSize_month; k++) {
			String s_year = elementCount_year.get(k).getText();
			System.out.println(s_year);
		}

	}

}
