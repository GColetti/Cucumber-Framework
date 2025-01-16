package com.fdmgroup.stepDef;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.openqa.selenium.WebDriver;

import com.fdmgroup.Pages.IndexPage;
import com.fdmgroup.Pages.UserIndexPage;
import com.fdmgroup.util.DriverUtilities;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogOutStepDef {
	private DriverUtilities driverUtilities;
	private WebDriver driver;
	
	
	@Given("User should be able to see the username Option")
	public void user_should_be_able_to_see_the_username_option() {
		driverUtilities = DriverUtilities.getInstance();
		driver = driverUtilities.getDriver();
	    assertTrue(UserIndexPage.usernameOption(driver).isDisplayed());
	}

	@When("User should click on Username Option")
	public void user_should_click_on_username_option() {
		
		UserIndexPage.usernameOption(driver).click();
	  
	}

	@When("User should click on Logout Option")
	public void user_should_click_on_logout_option() {
		
		UserIndexPage.logOutOption(driver).click();
	  
	}

	@Then("User should have SignIn button now")
	public void user_should_have_sign_in_button_now() {
		
		assertTrue(IndexPage.signInButton(driver).isDisplayed());
	   
	}


}
