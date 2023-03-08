import java.util.Arrays;

import java.util.List;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:/Users/leksh/Downloads/chromedriver_win32/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		// Implicit wait
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		WebDriverWait w = new WebDriverWait(driver, 5);

		String[] itemsNeeded = { "Cucumber", "Brocolli", "Beetroot", "Tomato", "Beans" };

		driver.get("https://rahulshettyacademy.com/seleniumPractise/");

		Thread.sleep(3000);

		addItems(driver, itemsNeeded);

		driver.findElement(By.cssSelector("img[alt='Cart']")).click();

		driver.findElement(By.xpath("//button[contains(text(), 'PROCEED TO CHECKOUT')]")).click();
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));

		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");

		driver.findElement(By.cssSelector("button.promoBtn")).click();
		

		// explicit wait

		w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.className("promoInfo")));

		System.out.println(driver.findElement(By.className("promoInfo")).getText());
		
		driver.findElement(By.xpath("//button[text() = 'Place Order']")).click();
		
		WebElement staticDropdown = driver.findElement(By.xpath("//div/div/div/select"));
		
		Select dropdown = new Select(staticDropdown);
		
		dropdown.selectByIndex(17);
		
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
		dropdown.selectByValue("Brazil");
		
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
		driver.findElement(By.className("chkAgree")).click();
		
		driver.findElement(By.xpath("//button[contains(text(), 'Proceed')]")).click();
		
		
	}

	public static void addItems(WebDriver driver, String[] itemsNeeded)

	{

		int j = 0;

		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

		for (int i = 0; i < products.size(); i++)

		{

			String[] name = products.get(i).getText().split("-");

			String formattedName = name[0].trim();

			List itemsNeededList = Arrays.asList(itemsNeeded);

			if (itemsNeededList.contains(formattedName)) {

				j++;

				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

				if (j == itemsNeeded.length)

				{

					break;

				}

			}

		}

	}

}