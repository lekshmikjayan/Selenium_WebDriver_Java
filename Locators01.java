
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators01{ 

	public static void main(String[] args)throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:/Users/leksh/Downloads/chromedriver_win32/chromedriver.exe" );
	
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");

		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Lekshmi");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.className("submit")).click();
		
		//p[text()='You are successfully logged in.']
	}
}