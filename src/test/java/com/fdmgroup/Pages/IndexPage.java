package com.fdmgroup.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IndexPage {
	
	public static WebElement signInButton(WebDriver driver)
	{
		return driver.findElement(By.id("signin_button"));
	}

}
