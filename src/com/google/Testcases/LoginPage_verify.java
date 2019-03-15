package com.google.Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.google.pages.LoginPage;

public class LoginPage_verify {

	WebDriver d;

	@Test(priority = 1)
	public void start() {
		LoginPage lp = new LoginPage(d);
		lp.launchbrowser();
		lp.enterURL("https://login.yahoo.com/?.src=ym&lang=&done=https%3A%2F%2Fmail.yahoo.com%2F");
	}

	@Test(priority = 2)
	public void flawless() {

		LoginPage lp = new LoginPage(d);
		lp.username("Dinesh");
		lp.verify_uname_value();
		lp.closebrowser();
	}

	@Test(priority = 5, enabled = false)

	public void launchbrowser() {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Lib\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://login.yahoo.com/?.src=ym&.lang=en-US&.intl=us&.done=https%3A%2F%2Fmail.yahoo.com%2Fd");

		LoginPage obj2 = new LoginPage(d);
		obj2.launchbrowser();
		obj2.enterURL("https://login.yahoo.com/?.src=ym&.lang=en-US&.intl=us&.done=https%3A%2F%2Fmail.yahoo.com%2Fd");

		// obj2.launchbrowser();
		// obj2.enterURL("https://login.yahoo.com/?.src=ym&.lang=en-US&.intl=us&.done=https%3A%2F%2Fmail.yahoo.com%2Fd");
		// Thread.sleep(3000);
		// d.get("https://login.yahoo.com/?.src=ym&.lang=en-US&.intl=us&.done=https%3A%2F%2Fmail.yahoo.com%2Fd");

		obj2.closebrowser();

	}
}
