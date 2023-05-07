import static org.junit.Assert.assertTrue;

import company.adminFunction;
import company.customerFunction;
import company.request;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class customerAddReqTest {
	   static String username,date,time;
	    int result=0;
	    
		  public customerAddReqTest()
		  {
		  }
		  
		  
	@Given("that the  customer {string} is logged in")
	public void that_the_customer_is_logged_in(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions

		if(customerFunction.customers.get(0).getRequests().size()==0)
		{
			for(int i=0;i<3;i++)
			{
				request a=new request(dataTable.cell(i, 1),dataTable.cell(i, 2),0,adminFunction.products.get(i));
				customerFunction.requests.add(a);
				int index=customerFunction.search(dataTable.cell(i,0));
				customerFunction.customers.get(index).addToCustomerRequest(a);
			}
		}
	
	}
	@Given("has request an appointment with date {string} and time {string}")
	public void has_request_an_appointment_with_date_and_time(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
	
	
	}
	@Given("the request name is {string} with price {double}")
	public void the_request_name_is_with_price(String string, Double double1) {
	    // Write code here that turns the phrase above into concrete actions

	
	}
	@When("customer tries to add the request")
	public void customer_tries_to_add_the_request() {
	    // Write code here that turns the phrase above into concrete actions

	
	}
	@Then("the request can be chosen")
	public void the_request_can_be_chosen() {
	    // Write code here that turns the phrase above into concrete actions

	
	
	}
	@Then("the request is added to the customer")
	public void the_request_is_added_to_the_customer() {
	    // Write code here that turns the phrase above into concrete actions
	
	
	}



}
