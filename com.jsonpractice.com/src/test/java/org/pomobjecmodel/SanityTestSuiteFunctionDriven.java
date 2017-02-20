package org.pomobjecmodel;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.jsonpractice.com.com.jsonpractice.com.ReusableBusinessFunctions;

public class SanityTestSuiteFunctionDriven {
	static WebDriver driver;
	static ReusableBusinessFunctions fun;
	@BeforeTest
	public static void before() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver\\geckodriver.exe"); 
		driver = new FirefoxDriver();
		driver.navigate().to("http://vijjifremont.trials54.orangehrmlive.com");
		
		fun = new ReusableBusinessFunctions(driver);
		fun.waitforsometime();
		//driver.wait(5000);
		//C:\geckodriver	
	}
	@AfterTest
	public static void after()
	{
		driver.quit();
	driver = null;
	}
	
@Test
public void UserCanLoginWithValidCredentials() throws InterruptedException
{
	//UserCanLoginWithValidCredentials.
	//driver.wait(5000);
	fun.loginAttempt("Admin","9UxjvGjm");
	Assert.assertEquals(driver.findElement(By.id("welcome")).getText(),"Welcome Admin"); 
}

@Test 
public void UserCannotLoginInvalidDetails()
{
	fun.loginAttempt("Admin","dggufg");
	Assert.assertTrue(driver.findElement(By.tagName("h1")).getText().contains("Retry Login"));
}
@Test 
public void userSeesForgotPasswordAfterWrongAttempt()
{
	fun.loginAttempt("Admin","fduuhh");
	//Assert.assertTrue(driver.findElement(By.linkText("")
}
@Test
public void findAllLinksinAdminPae()
{
	fun.loginAttempt("Admin","9UxjvGjm");
		List<WebElement> links = driver.findElements(By.tagName("b"));
		for(WebElement l : links)
			System.out.println(l.getText());
		Assert.assertEquals(links.size(), 10);
	Assert.assertTrue(driver.findElement(By.tagName("b")).getText().contains("Admin"));
	//Assert.assertEquals(driver.findElement(By.xpath("//*[@id='menu_admin_viewAdminModule']/b")), "Admin");
	
}
@Test
public void checkAdminTab()
{
	fun.loginAttempt("Admin","9UxjvGjm");
	driver.findElement(By.xpath("//*[@id='menu_admin_viewAdminModule']/b")).click();
	System.out.println("can reach this point\n");
	//a[contains(concat(' ',normalize-space(@class),' '), "current sf-breadcrumb sfHover")]/@href
	//List<WebElement> al = (List<WebElement>) driver.findElement(By.xpath("//a[@class='current sf-breadcrumb sfHover']/@href"));  
//	driver.findElement(By.xpath("//*[id=*]"));
	String l = driver.findElement(By.xpath("//*input[@id='*']")).getText();  
	System.out.println( l);
	//-- //a[starts-with(@href=’’)]
}

}
