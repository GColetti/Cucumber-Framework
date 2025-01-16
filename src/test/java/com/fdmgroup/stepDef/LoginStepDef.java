package com.fdmgroup.stepDef;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.openqa.selenium.WebDriver;

import com.fdmgroup.Pages.IndexPage;
import com.fdmgroup.Pages.LoginPage;
import com.fdmgroup.Pages.UserIndexPage;
import com.fdmgroup.testData.DataFile;
import com.fdmgroup.util.DriverUtilities;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.no.Gitt;

public class LoginStepDef {
	private DriverUtilities driverUtilities;
	private WebDriver driver;

	@Given("User launch the Browser")
	public void user_launch_the_browser() {
		driverUtilities = DriverUtilities.getInstance();
		driver = driverUtilities.getDriver();
		driver.manage().window().maximize();
	}

	@When("User launch Zero Bank Application")
	public void user_launch_zero_bank_application() {
		driver.get(DataFile.HomePageURL);

	}

	@Then("SignIn button should be Displayed")
	public void sign_in_button_should_be_displayed() {
		assertTrue(IndexPage.signInButton(driver).isDisplayed());
		IndexPage.signInButton(driver).click();
	}

	@When("User enter valid {string} and {string}")
	public void user_enter_valid_and(String username, String password) {
		LoginPage.usernameField(driver).sendKeys(username);
		LoginPage.passwordField(driver).sendKeys(password);
	}

//	@When("User enter valid username and password")
//	public void user_enter_valid_username_and_password() {
//	   LoginPage.usernameField(driver).sendKeys(DataFile.UserName);
//	   LoginPage.passwordField(driver).sendKeys(DataFile.Password);
//	}

	@When("Submit the form")
	public void submit_the_form() {

		LoginPage.signinForm(driver).submit();

	}

	@Then("User should be able to see the userIndex page")
	public void user_should_be_able_to_see_the_user_index_page() {
		driver.navigate().back();
		assertTrue(UserIndexPage.usernameOption(driver).isDisplayed());

	}

}
