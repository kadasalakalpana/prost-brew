package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

/**
 * @author Dinesh Reddy About this class : this is base class for open browser 
 *         (you can extend this class to another class)
 */
public class BaseClass {

	public static WebDriver d;

	@Parameters("browser")
	@BeforeSuite
	public void open_browser(String browser) {
		switch (browser) {
		case "Firefox":
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\Lib\\geckodriver.exe");
			d = new FirefoxDriver();
			d.manage().window().maximize();
			break;

		case "Chrome":
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Lib\\chromedriver.exe");
			d = new ChromeDriver();
			d.manage().window().maximize();
			break;

		case "ie":
			System.setProperty("webdriver.ie.driver", System.getProperty("user.dir") + "\\Lib\\IEDriverServer.exe");
			d = new InternetExplorerDriver();
			d.manage().window().maximize();
			break;

		case "Edge":
			System.setProperty("webdriver.edge.driver",
					System.getProperty("user.dir") + "\\Lib\\MicrosoftWebDriver.exe");
			d = new EdgeDriver();
			d.manage().window().maximize();
			break;

		default:
			System.out.println("Browser case value mismatch-NA");

		}
	}
}
