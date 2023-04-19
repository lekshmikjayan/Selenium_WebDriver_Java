package base;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Bastest {
	public static WebDriver driver;
	public static Properties prop = new Properties();
	public static Properties loc = new Properties();
	public static FileReader fr;
	public static FileReader f1;

	@BeforeMethod
	public void setup() throws IOException {
		if(driver == null) {

			 fr = new FileReader(System.getProperty("user.dir") + "\\src\\test\\resources\\configfiles\\config.properties");
			 f1 = new FileReader(System.getProperty("user.dir") + "\\src\\test\\resources\\configfiles\\locators.properties");
			prop.load(fr);
			loc.load(f1);
		}

		if(prop.getProperty("browser").equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();

			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");

			 driver = new ChromeDriver();
			driver.get(prop.getProperty("testurl"));

		}
	}
	@AfterMethod
	public void teardown() {
		System.out.println("Teardown successfull..!!");
		driver.close();

	}
}
