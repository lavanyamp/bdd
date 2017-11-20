package tests;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login {
	@Given("^Launch the browser$")
	public void launch_the_browser() throws Throwable {
		
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
	   
	}

	@Given("^Navigates to craftvilla$")
	public void navigates_to_craftvilla() throws Throwable {
	    
	}

	@Given("^click on login to navigate to loginpage$")
	public void click_on_login_to_navigate_to_loginpage() throws Throwable {
	   
	}

	@When("^enter username$")
	public void enter_username() throws Throwable {
	    
	}

	@When("^click on continue$")
	public void click_on_continue() throws Throwable {
	    
	}

	@When("^enter password$")
	public void enter_password() throws Throwable {
	    
	}

	@When("^click on login$")
	public void click_on_login() throws Throwable {
	    
	}

	@Then("^login should be successful$")
	public void login_should_be_successful() throws Throwable {
	    
	}



}
