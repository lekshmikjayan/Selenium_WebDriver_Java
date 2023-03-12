import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SSLCheck {
	public static void main(String[] args) throws InterruptedException {

		ChromeOptions options = new ChromeOptions(); 
		//chromeoptns class will set behaviour for chrome browser
		
		Proxy proxy = new Proxy();
		proxy.setHttpProxy("ipaddress:4444");
		
		options.setCapability("proxy", proxy);
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("download.default_directory", "/directory/path");
		
		options.setExperimentalOption("prefs", prefs);
		options.setAcceptInsecureCerts(true);
		System.setProperty("webdriver.chrome.driver", "C:/Users/leksh/Downloads/chromedriver_win32/chromedriver.exe");

		WebDriver driver = new ChromeDriver(options);
		driver.get("https://expired.badass.com/");
		System.out.println(driver.getTitle());
	}
}
