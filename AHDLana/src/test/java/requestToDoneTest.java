import static org.junit.Assert.assertTrue;

import company.customerFunction;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class requestToDoneTest {
	String username,date,time;
	int result=0;
	@Given("that the customer {string} is logged in to the company")
	public void that_the_customer_is_logged_in_to_the_company(String string) {
	    // Write code here that turns the phrase above into concrete actions
	     username=string;
	}
	@Given("the date {string} and time {string} of the request have passed")
	public void the_date_and_time_of_the_request_have_passed(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
	     date=string;
	     time=string2;
	  //   result=customerFunction.checkIfAppointmentPassed(date,time);
	    result=customerFunction.checkIfRequestPassed( string, string2);
	
	}
	@Then("the request is turned into a Done")
	public void the_request_is_turned_into_a_done() {
	    // Write code here that turns the phrase above into concrete actions
		assertTrue("The Request has not passed yet",result==1);

	}
	@Then("it is stored in the customer")
	public void it_is_stored_in_the_customer() {
	    // Write code here that turns the phrase above into concrete actions
		customerFunction.changeRequestToDone(username,date,time);
	
	}



}
