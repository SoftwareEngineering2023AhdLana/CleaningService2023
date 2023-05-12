package cleaningService;

import static org.junit.Assert.assertTrue;

import java.io.InputStreamReader;
import java.util.Scanner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class customerAddInvoiceTest {

	String name,nam1;
	String np;
	String price;
	boolean a = false;
	Scanner s=new Scanner(new InputStreamReader(System.in));

	
	
	@Given("these are the invoice of customer")
	public void theseAreTheInvoiceOfCustomer(io.cucumber.datatable.DataTable dataTable) {


		
	}
	@Given("that the customer <{string}> is logged  in")
	public void thatTheCustomerIsLoggedIn(String string) {
	    // Write code here that turns the phrase above into concrete actions


	}
	@Given("they have an order")
	public void theyHaveAnOrder() {
	    // Write code here that turns the phrase above into concrete actions


	}
	@When("the order tries to add the invoice")
	public void theOrderTriesToAddTheInvoice() {
	    // Write code here that turns the phrase above into concrete actions


	}
	@Then("the invoice can be generated")
	public void theInvoiceCanBeGenerated() {
	    // Write code here that turns the phrase above into concrete actions

	}
	@Then("the invoice is generated")
	public void theInvoiceIsGenerated() {
	    // Write code here that turns the phrase above into concrete actions

	}




}

