import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class log_in_test {
	int result;
	
	@Given("that the admin {string} is not logged in")
	public void that_the_admin_is_not_logged_in(String string) {
	    // Write code here that turns the phrase above into concrete actions
	  
	}

	@When("admin tries to log in")
	public void admin_tries_to_log_in() {
	    // Write code here that turns the phrase above into concrete actions

	}

	@When("username is {string} and password is {string}")
	public void username_is_and_password_is(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions

	}

	@Then("the admin login succeeds")
	public void the_admin_login_succeeds() {
	    // Write code here that turns the phrase above into concrete actions
		assertTrue(result==2);
	}

	@Then("the admin is logged in")
	public void the_admin_is_logged_in() {
	    // Write code here that turns the phrase above into concrete actions
	  
	}

	@Then("the admin login fails")
	public void the_admin_login_fails() {
	    // Write code here that turns the phrase above into concrete actions
		assertTrue(result==1);
	}

	@Then("the admin is not logged in")
	public void the_admin_is_not_logged_in() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

}
