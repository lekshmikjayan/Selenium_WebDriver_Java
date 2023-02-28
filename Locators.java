
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators{

	public static void main(String[] args)throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:/Users/leksh/Downloads/chromedriver_win32/chromedriver.exe" );
	
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");

		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Lekshmi");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("12345");
		driver.findElement(By.className("submit")).click();
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("LKJ");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("453627");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).clear();
		
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("lkj@123");
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("emailnew.com");
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("2378567");
		
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		
		driver.findElement(By.xpath("//div[contains(@class,'pwd')]/button[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("Lekshmi K Jayan");
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("chkboxOne")).click();

		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
	}
};

