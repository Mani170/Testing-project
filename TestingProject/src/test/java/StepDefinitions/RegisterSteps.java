package StepDefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterSteps {
	
	WebDriver driver;
	
	@Given("user is on register page")
	public void user_is_on_register_page() {
		System.out.println("User is in the register page");
	    
	}

	@When("user selects the gender and enters firstname,last name,email,password and conform password")
	public void user_selects_the_gender_and_enters_firstname_last_name_email_password_and_conform_password() {
	    System.out.println("User enters the valid credentials");
	}

	@And("clicks on Register button")
	public void clicks_on_register_button() {
	   System.out.println("Clicks on register button");
	}

	@Then("user is navigated to the Registered result page")
	public void user_is_navigated_to_the_registered_result_page() {
	    System.out.println("User is in the Registered page");
	}

	@When("user clicks the continue button")
	public void user_clicks_the_continue_button() {
	    System.out.println("Clicks on continue button");
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
	    System.out.println("Navigated to home page");
	}

}
