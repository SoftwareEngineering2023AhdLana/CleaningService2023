import static org.junit.Assert.assertTrue;

import company.adminFunction;
import company.customerFunction;
import company.workerFunction;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class logoutTest {
	String u;
	Boolean status;
	static int index=-1;
	static int c0a1=-1;
	Boolean b;
	
	public static void search(String u)
	{
		for(int i=0;i<customerFunction.customers.size();i++)
		{
			if(u.equals(customerFunction.customers.get(i).getUsername()))
			{
				c0a1=0;
				index=i;
				break;
			}
		}
		for(int i=0;i<adminFunction.admins.size();i++)
		{
			if(u.equals(adminFunction.admins.get(i).getUsername()))
			{
				c0a1=1;
				index=i;
				break;
			}
		}
		for(int i=0;i<workerFunction.workers.size();i++)
		{
			if(u.equals(workerFunction.workers.get(i).getUsername()))
			{
				c0a1=2;
				index=i;
				break;
			}
		}

	}
	@Given("that the user {string} is logged in")
	public void that_the_user_is_logged_in(String string) {
	    // Write code here that turns the phrase above into concrete actions
		u=string;
		b=false;
		index=customerFunction.search(string);
		if(index==-1)
		{
			index=adminFunction.search(string);
			if(adminFunction.admins.get(index).getLogState()==true)
				b=true;
			else
				b=false;
		}
		else if(index==-3) {

			index=workerFunction.search(string);
			if(workerFunction.workers.get(index).getLogState()==true)
				b=true;
			else
				b=false;
		}
		else
		{
			if(customerFunction.customers.get(index).getLogState()==true)
				b=true;
			else
				b=false;
		}
	
	}

	@Then("the user logs out")
	public void the_user_logs_out() {
	    // Write code here that turns the phrase above into concrete actions
		assertTrue("The user can't log out because they are not logged in",b);

	}
	@Then("user is redirected to the login portal")
	public void user_is_redirected_to_the_login_portal() {
	    // Write code here that turns the phrase above into concrete actions
		search(u);
		if(c0a1==0)
			customerFunction.customers.get(index).setLogState(false);
		else if(c0a1==1)
			adminFunction.admins.get(index).setLogState(false);
		else
			workerFunction.workers.get(index).setLogState(false);

	}

	@Given("that the user {string} is not logged in")
	public void that_the_user_is_not_logged_in(String string) {
	    // Write code here that turns the phrase above into concrete actions
		b=false;
		index=customerFunction.search(string);
		if(index==-1)
		{
			index=workerFunction.search(string);
			if(workerFunction.workers.get(index).getLogState()==true)
				b=true;
			else
				b=false;
		}
		else
		{
			if(customerFunction.customers.get(index).getLogState()==true)
				b=true;
			else
				b=false;
		}
	}
	@When("user wants to log out")
	public void user_wants_to_log_out() {
	    // Write code here that turns the phrase above into concrete actions
	}
	@Then("the user logout fails")
	public void the_user_logout_fails() {
	    // Write code here that turns the phrase above into concrete actions
		assertTrue("The user can log out",!b);
	}
	@Then("the user is not logged in")
	public void the_user_is_not_logged_in() {
	    // Write code here that turns the phrase above into concrete actions
	}




}
