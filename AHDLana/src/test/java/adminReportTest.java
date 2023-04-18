import static org.junit.Assert.assertTrue;

import company.adminFunction;
import company.customerFunction;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class adminReportTest {
	String username;
	Boolean b=false;
	Boolean f=false;
	@Given("that the admin {string} is logged in")
	public void that_the_admin_is_logged_in(String string) {
	    // Write code here that turns the phrase above into concrete actions
		username=string;
	}
	@Given("there are customer in the company")
	public void there_are_customer_in_the_company() {
	    // Write code here that turns the phrase above into concrete actions	
		if(customerFunction.customers.size()>0)
			b=true;
		else
			b=false;
	}
	@Given("at least one customer has an request")
	public void at_least_one_customer_has_an_request() {
	    // Write code here that turns the phrase above into concrete actions
		  f=false;
			for(int i=0;i<customerFunction.customers.size();i++)
		    {
		    	if(customerFunction.customers.get(i).getRequests().size()>0)
		    	{
		    		f=true;
		    		break;
		    	}
		    }
	
	}
	@Then("the report can be generated")
	public void the_report_can_be_generated() {
	    // Write code here that turns the phrase above into concrete actions

		assertTrue("The report can not be generated",(f&&b));

	}
	@Then("the report is generated")
	public void the_report_is_generated() {
	    // Write code here that turns the phrase above into concrete actions
		for (int i=0 ; i <customerFunction.customers.size(); i++ ) 
		{
			System.out.println("\nCustomer #"+(i+1));
			System.out.println(customerFunction.customers.get(i));
			System.out.println("customer requests: ");
			
			for (int j=0 ; j <customerFunction.customers.get(i).getRequests().size() ; j++ ) 
			{
				System.out.println("The request#"+(j+1)+" "+ customerFunction.customers.get(i).getRequests().get(j));
			}
		}
	
	}




	@Given("there are products")
	public void there_are_products() {
	    // Write code here that turns the phrase above into concrete actions
		if(adminFunction.products.size()>0)
			b=true;
		else
			b=false;
	
	}
	@Then("the products report can be generated")
	public void the_products_report_can_be_generated() {
	    // Write code here that turns the phrase above into concrete actions
		assertTrue("There are no product",b);

	}
	@Then("the report of the product is generated")
	public void the_report_of_the_product_is_generated() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("\nThese are our services:");
		for(int i=0;i<adminFunction.products.size();i++)
		{
			System.out.println("Service #"+(i+1)+" "+adminFunction.products.get(i));
		}
		System.out.println("\nThese are our team memebers:");
		for(int i=0;i<adminFunction.admins.size();i++)
		{
			System.out.println("Team member #"+(i+1)+" "+adminFunction.admins.get(i));
		}
	
	}



}
