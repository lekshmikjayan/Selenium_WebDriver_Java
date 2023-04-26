package crossbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Verification {
	WebDriver driver;
	ChromeOptions c = new ChromeOptions();
	FirefoxOptions f = new FirefoxOptions();
	EdgeOptions e = new EdgeOptions();
	
	
	
	@Parameters("browser")
	@BeforeTest
  public void begin(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			c.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(c);
			System.out.println("Opened google chrome");
			
		} else if (browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			f.addArguments("--remote-allow-origins=*");
			driver = new FirefoxDriver();
			System.out.println("Opened Firefox..");
		} 
		else if (browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			e.addArguments("--remote-allow-origins=*");
			 driver = new EdgeDriver(e);
			System.out.println("opened Microsoft edge");
		}
  }
	
	@Test
	public void home() {
		driver.get("https://www.google.com/");
	}
	
	@AfterTest
	public void efinish() {
		driver.quit();
	}
}
