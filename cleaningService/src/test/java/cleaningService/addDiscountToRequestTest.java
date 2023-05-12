package cleaningService;


import static org.junit.Assert.assertTrue;

import java.io.InputStreamReader;
import java.util.Scanner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class addDiscountToRequestTest {
	String name;
	boolean a = false;
	 Scanner s=new Scanner(new InputStreamReader(System.in));

	 
	 
	 @Given("these amount of buy")
	 public void theseAmountOfBuy(io.cucumber.datatable.DataTable dataTable) {


		 
	 }
	 @Given("that the customer <{string}> is loggmed in to the company")
	 public void thatTheCustomerIsLoggmedInToTheCompany(String string) {
	     // Write code here that turns the phrase above into concrete actions

	 }
	 @Given("the price <{string}>")
	 public void thePrice(String string) {
	     // Write code here that turns the phrase above into concrete actions

	 }
	 @Then("add discount to request")
	 public void addDiscountToRequest() {
	     // Write code here that turns the phrase above into concrete actions

	 }




	
	
	 
	 @Then("not add discount to request")
	 public void notAddDiscountToRequest() {
	     // Write code here that turns the phrase above into concrete actions

	 }




}

