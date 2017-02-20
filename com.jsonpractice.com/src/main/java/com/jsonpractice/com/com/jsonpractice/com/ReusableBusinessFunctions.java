package com.jsonpractice.com.com.jsonpractice.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//static WebDriver driver;
public class ReusableBusinessFunctions {
	static WebDriver driver;
	public ReusableBusinessFunctions(WebDriver driver)
	{
		this.driver = driver;
	}
	public void loginAttempt(String username,String password) {
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		driver.findElement(By.id("btnLogin")).click();
	}
	public void logout()
	{
		driver.findElement(By.id("welcome")).click();
		waitforsometime();
		driver.findElement(By.linkText("Logout")).click();
	}
	public void waitforsometime()
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
}
