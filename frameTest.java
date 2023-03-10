import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class frameTest {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/leksh/Downloads/chromedriver_win32/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://jqueryui.com/droppable/");
		
		//check the number of frames
		System.out.println(driver.findElements(By.tagName("iframe")).size());
	
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		
		Actions a = new Actions (driver);
		
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		
		a.dragAndDrop(source, target).build().perform();
		
	
	
		driver.switchTo().defaultContent();
		
		driver.findElement(By.cssSelector("input[type='text']")).click();
	}
}
