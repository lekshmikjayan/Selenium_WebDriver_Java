import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousehover {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/leksh/Downloads/chromedriver_win32/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");

		WebElement move = driver.findElement(By.id("nav-link-accountList"));

		Actions a = new Actions(driver);

		a.moveToElement(driver.findElement(By.cssSelector("input[type='text']"))).click().keyDown(Keys.SHIFT)
				.sendKeys("hai lekshmi").doubleClick().build().perform();

		a.moveToElement(move).contextClick().build().perform(); // contextclick is right click
	}
}
