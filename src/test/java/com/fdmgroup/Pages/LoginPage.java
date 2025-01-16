package com.fdmgroup.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	public static WebElement usernameField(WebDriver driver) {
		return driver.findElement(By.xpath("//*[contains(@id,'_login')]"));

	}

	public static WebElement passwordField(WebDriver driver) {

		return driver.findElement(By.xpath("//*[contains(@type,'password')]"));
	}

	public static WebElement rememberMeChechBox(WebDriver driver) {

		return driver.findElement(By.xpath("//*[contains(@name, 'user_remember_me')]"));
	}

	public static WebElement signinForm(WebDriver driver) {

		return driver.findElement(By.xpath("//*[contains(@id,'login_form')]"));
	}

}
