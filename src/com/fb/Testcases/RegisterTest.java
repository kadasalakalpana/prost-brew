package com.fb.Testcases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.fb.pages.Register;
import com.fb.utils.Register_Locators;

import base.BaseClass;

public class RegisterTest extends BaseClass {

	// static WebDriver d;

	@Test(priority = 1)
	public void open_url() {
		d.get(Register_Locators.URL);
		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

	@Test(priority = 2)
	public void Register() {
		Register obj = new Register(d);
		obj.type_firstName(Register_Locators.firstName_value);
		obj.type_LastName(Register_Locators.LastName_value);
		obj.phonenumber_email(Register_Locators.MobileNumber_or_email_value);
		obj.password(Register_Locators.password_value);
		obj.entered_values();
		obj.birthday();
		obj.radio_button();
		// obj.click_signup();
		d.close();
	}

}
