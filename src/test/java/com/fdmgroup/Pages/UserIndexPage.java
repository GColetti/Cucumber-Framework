package com.fdmgroup.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UserIndexPage {

	public static WebElement usernameOption (WebDriver driver)
	{
		
		return driver.findElement(By.xpath("//*[contains(@id, 'settingsBox')]/ul/li[3]/a"));
	}
	
	public static WebElement logOutOption (WebDriver driver)
	{
		return driver.findElement(By.id("logout_link"));
	}
	
	public static WebElement moreServicesButton(WebDriver driver)
	{
		return driver.findElement(By.id("online-banking"));
	}
}
