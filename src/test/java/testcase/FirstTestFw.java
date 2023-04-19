package testcase;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.Bastest;



public class FirstTestFw extends Bastest{

	@Test(dataProvider="testdata")
	public static void LoginTest(String username, String password) throws InterruptedException {

		System.out.println("Clicked successfully..!!");
		Thread.sleep(4000);
		driver.findElement(By.id(loc.getProperty("email"))).sendKeys(username);
		driver.findElement(By.cssSelector(loc.getProperty("next"))).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(loc.getProperty("password"))).sendKeys(password);
		driver.findElement(By.id(loc.getProperty("login"))).click();
		Thread.sleep(2000);	
	}

	@DataProvider(name="testdata")
	public Object[][] tdata(){
		return new Object[][] {
			{"Wafqw","Qgegeg"},
			{"QWFgw","Qt3tg"},
			{"R2rfWQF", "WFQWgegqgh"},
			{"lekshmikjayan27@gmail.com", "zohocrm@98"}
			
	};
}
}