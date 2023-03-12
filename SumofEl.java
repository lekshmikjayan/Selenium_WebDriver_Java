import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class SumofEl {
	public static void main(String[]args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/leksh/Downloads/chromedriver_win32/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
List <WebElement>	values =	driver.findElements(By.cssSelector(" .tableFixHead td:nth-child(4)"));
int sum=0;

		for(int i=0; i< values.size(); i++) {
		sum = sum + Integer.parseInt(values.get(i).getText());
		
		}
		System.out.println(sum);
	int total = Integer.parseInt(driver.findElement(By.className("totalAmount")).getText().split(":")[1].trim());

	Assert.assertEquals(sum, total);
	
	}
}