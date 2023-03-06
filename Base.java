import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:/Users/leksh/Downloads/chromedriver_win32/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		String[] veggies = {Cucumber, Brocoli, Beetroot};
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

		for (int i = 0; i < products.size(); i++) {

			String name = products.get(i).getText().split('-');
			
			List itemsNeeded = Arrays.asList(veggies);

			if (name.contains(name)) {
				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
		
			}
		}
	}
}
