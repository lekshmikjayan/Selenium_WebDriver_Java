package testcase;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.Bastest;
import utilities.ReadXLSdata;



public class FirstTestFw extends Bastest{

	@Test(dataProviderClass=ReadXLSdata.class, dataProvider="newdata")
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

	
	
}
