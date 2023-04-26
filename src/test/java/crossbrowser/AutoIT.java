package crossbrowser;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoIT {

	public static void main (String[]args) throws IOException, InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://products.groupdocs.app/editor/word");
		Thread.sleep(2000);
		driver.findElement(By.name( "UploadFileInput-1da787d0-3e9c-49ab-8c4c-ffffde2669ab")).click();
	Runtime.getRuntime().exec("C:\\Users\\leksh\\OneDrive\\Documents\\sample.exe");
	
	}
	
}
