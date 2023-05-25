package cleaningServiceTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.cleaning_service.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class addProductTest {

	Admin admin = new Admin();
	boolean a  , b;
	Product p1,p2;
	@Given("these are the services")
	public void theseAreTheServices(io.cucumber.datatable.DataTable dataTable) {
	/*
		  Product p1 =  new Product("covers Wash per Cover","fits 3-seat sofa, cotton","cover",20.0);
          a = admin.addProductTest(p1);
          Product p2 =  new Product("cake","fits 3-seat sofa","cover",1500.0);
          a = admin.addProductTest(p2);
	*/
	//admin.addp();

	}
	@Given("that the admin is logged in")
	public void thatTheAdminIsLoggedIn() {
	    // Write code here that turns the phrase above into concrete actions


	
	}
	@Given("the product does not already exist")
	public void theProductDoesNotAlreadyExist() {
	    // Write code here that turns the phrase above into concrete actions
		


	}
	@Given("the product is <{string}> and its price is {double}")
	public void theProductIsAndItsPriceIs(String string, Double double1) {
	    // Write code here that turns the phrase above into concrete actions


	
	}
	@When("admin tries to add the product to the company")
	public void adminTriesToAddTheProductToTheCompany() {
	    // Write code here that turns the phrase above into concrete actions
		 p1 =  new Product("covers Wash per Cover","fits 3-seat sofa, cotton","cover",20.0);
         p2 =  new Product("cake","fits 3-seat sofa","cover",1500.0);
      
	
	}
	@Then("the product can be added")
	public void theProductCanBeAdded() {
	    // Write code here that turns the phrase above into concrete actions

	
	}
	@Then("the product is added")
	public void theProductIsAdded() {
	    // Write code here that turns the phrase above into concrete actions
		 a=admin.addProductTest(p2);
		assertEquals(a,true);

 	
	}



	
	
	
	
	@Given("the product already exists")
	public void theProductAlreadyExists() {
	    // Write code here that turns the phrase above into concrete actions
		
	
	}
	@Then("the product cannot be added")
	public void theProductCannotBeAdded() {
	    // Write code here that turns the phrase above into concrete actions



	
	}
	@Then("the product is not added")
	public void theProductIsNotAdded() {
	    // Write code here that turns the phrase above into concrete actions
      b=admin.addProductTest(p1);
		assertEquals(b,false);

	}





	



}
