import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserActvts {
	public static void main (String[]args) {
		
		System.setProperty("webdriver.chrome.driver","C:/Users/leksh/Downloads/chromedriver_win32/chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/webhp?hl=en&sa=X&ved=0ahUKEwiB7dqMxLr9AhUHMuwKHX1JBNUQPAgI");
		driver.navigate().to("https://github.com/lekshmikjayan/JavaBasics");
		
		driver.navigate().back();
		driver.navigate().forward();
}
}
