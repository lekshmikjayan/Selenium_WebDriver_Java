import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class demo {
	public static void main (String[]args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:/Users/leksh/Downloads/chromedriver_win32/chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.cssSelector("input[value='option1']")).click();
Assert.assertTrue(driver.findElement(By.cssSelector("input[value='option1']")).isSelected());

driver.findElement(By.cssSelector("input[value='option1']")).click();

	System.out.println(driver.findElement(By.cssSelector("input[type='checkbox']")).getSize());	
;
}
}
