package org.pomobjecmodel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SanityTestSuite {
	static WebDriver driver;
	@BeforeClass
	public static void before() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver\\geckodriver.exe"); 
		driver = new FirefoxDriver();
		driver.navigate().to("http://vijjifremont.trials54.orangehrmlive.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.wait(5000);
		//C:\geckodriver	
	}
	//@AfterClass
	//public static void after()
	//{
		//driver.quit();
		//driver = null;
	//}
	
@Test
public void UserCanLoginWithValidCredentials() throws InterruptedException
{
	//UserCanLoginWithValidCredentials.
	//driver.wait(5000);
	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	driver.findElement(By.id("txtPassword")).sendKeys("9UxjvGjm");
	driver.findElement(By.id("btnLogin")).click();
	Assert.assertEquals(driver.findElement(By.id("welcome")).getText(),"Welcome Admin"); 
}

}
