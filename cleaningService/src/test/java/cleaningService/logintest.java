package cleaningService;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import java.util.Scanner;
import static org.junit.Assert.assertTrue;



public class logintest {
    
	boolean a = false;
	String name;
	String pass;
	

	@Given("I have the following users in my company by list")
	public void iHaveTheFollowingUsersInMyCompanyByList(io.cucumber.datatable.DataTable dataTable) {


		
	}
	@Given("that the user is not logged in")
	public void thatTheUserIsNotLoggedIn() {
	    // Write code here that turns the phrase above into concrete actions
	 
	}
	@Given("the id is <{string}> and password is <{string}>")
	public void theIdIsAndPasswordIs(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
	  
	}
	@Then("the user login succeeds")
	public void theUserLoginSucceeds() {
	    // Write code here that turns the phrase above into concrete actions
	 
	}
	@Then("the user is logged in")
	public void theUserIsLoggedIn() {
	    // Write code here that turns the phrase above into concrete actions

	}



	@Then("the user login fails")
	public void theUserLoginFails() {
	    // Write code here that turns the phrase above into concrete actions


	}
	@Then("the user is not logged in")
	public void theUserIsNotLoggedIn() {
	    // Write code here that turns the phrase above into concrete actions


	}




}

