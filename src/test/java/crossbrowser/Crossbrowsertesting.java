package crossbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Crossbrowsertesting {
	WebDriver driver;	
	FirefoxOptions ffox = new FirefoxOptions();
	ChromeOptions options = new ChromeOptions();
	EdgeOptions e = new EdgeOptions();
	
	@Parameters("browser")
  @BeforeTest
  public void initial(String browser) {
	  if(browser.equalsIgnoreCase("chrome")) {
		//  driver.get("https://www.google.com/");
		  WebDriverManager.chromedriver().setup();
		  options.addArguments("--remote-allow-origins=*");

		  driver = new ChromeDriver(options);
		  System.out.println("Opened Google chrome");
	  }
	
  }
  
  @Test 
  public void home() {
	  driver.get("https://www.google.com/");
  }
  
  @AfterTest
  public void end() {
	  driver.quit();
  }
}
