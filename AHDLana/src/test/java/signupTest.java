import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;



import static org.junit.Assert.assertTrue;

import company.adminFunction;
import company.customerFunction;
import company.workerFunction;



public class signupTest {

	static Boolean found=false;
	
	public static Boolean search(String u)
	{
		for(int i=0;i<customerFunction.customers.size();i++)
		{
			if(u.equals(customerFunction.customers.get(i).getUsername()))
			{
				return true;
			}
		}
		for(int i=0;i<adminFunction.admins.size();i++)
		{
			if(u.equals(adminFunction.admins.get(i).getUsername()))
			{
				return true;
			}
		}
		for(int i=0;i<workerFunction.workers.size();i++)
		{
			if(u.equals(workerFunction.workers.get(i).getUsername()))
			{
				return true;
			}
		}
		return false;
	}
	
	
	@Given("that the user {string} is  not logged in")
	public void that_the_user_is_not_logged_in(String string) {
	    // Write code here that turns the phrase above into concrete actions

		found=search(string);

	}
	@Given("they do not have an account in the system")
	public void they_do_not_have_an_account_in_the_system() {
	    // Write code here that turns the phrase above into concrete actions

	
	
	
	}
	@Then("the sign up succeeds")
	public void the_sign_up_succeeds() {
	    // Write code here that turns the phrase above into concrete actions

	
	
		assertTrue(!found);

	}
	@Then("the user is redirected to the login page")
	public void the_user_is_redirected_to_the_login_page() {
	    // Write code here that turns the phrase above into concrete actions

	
	}

	
	@Given("they does have an account in the system")
	public void they_does_have_an_account_in_the_system() {
	    // Write code here that turns the phrase above into concrete actions
	}
	@Then("the sign up fails")
	public void the_sign_up_fails() {
	    // Write code here that turns the phrase above into concrete actions
		assertTrue(found);
	}
	@Then("the user is prompted to try again")
	public void the_user_is_prompted_to_try_again() {
	    // Write code here that turns the phrase above into concrete actions

	
	
	
	}





}
