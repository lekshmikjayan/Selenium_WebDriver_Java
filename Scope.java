import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:/Users/leksh/Downloads/chromedriver_win32/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");

		System.out.println(driver.findElements(By.tagName("a")).size());

		WebElement footerdriver = driver.findElement(By.id("gf-BIG"));

		System.out.println(footerdriver.findElements(By.tagName("a")).size());

		WebElement coloumndriver = footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(coloumndriver.findElements(By.tagName("a")).size());

		for (int i = 1; i < coloumndriver.findElements(By.tagName("a")).size(); i++) {

			String clickOnLink = Keys.chord(Keys.CONTROL, Keys.ENTER);

			coloumndriver.findElements(By.tagName("a")).get(i).sendKeys(clickOnLink);

			Thread.sleep(4000L);
		}
			Set<String> windows = driver.getWindowHandles();
			Iterator<String> it = windows.iterator();

			while (it.hasNext()) {

				driver.switchTo().window(it.next());
				System.out.println(driver.getTitle());
			

		}
	}
}