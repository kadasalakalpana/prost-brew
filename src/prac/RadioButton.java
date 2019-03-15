package prac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class RadioButton {
	public static WebDriver driver;

	@Test(priority = 1)
	public void openbrowser() {
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\Lib\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
	}

	// Finding the Radio button elements
	public static By maleradiobutton = By.id("u_0_a");
	public static By femaleradiobutton = By.id("u_0_9");

	@Test(priority = 2)

	public void radio_Button() {
		driver.get("https://www.facebook.com/");

		boolean mrbisdisplayed = driver.findElement(maleradiobutton).isDisplayed(); // true
		System.out.println("male radio button displayed status :" + mrbisdisplayed);

		boolean frbisdisplayed = driver.findElement(femaleradiobutton).isDisplayed();
		System.out.println("female radio button displayed status :" + frbisdisplayed);

		boolean msss = false;
		boolean msss1 = false;

		if (mrbisdisplayed == true) {
			driver.findElement(maleradiobutton).click();
			msss = driver.findElement(maleradiobutton).isSelected();

			if (msss) { // here we are directly giving msss, in if statement, because - msss is already
						// returning either true/false

				System.out.println("male radio button click status :" + msss);

			} else {
				System.out.println("male radio button is clicked :" + msss);
			}
		}

		if (msss == false) {
			driver.findElement(femaleradiobutton).click();
			msss1 = driver.findElement(femaleradiobutton).isSelected();
			System.out.println("female radio button is  clicked :" + msss1);

		} else {
			System.out.println("female radio button is not clicked (if it is false then testcase passed):" + msss1);
		}

		driver.close();

	}

}
