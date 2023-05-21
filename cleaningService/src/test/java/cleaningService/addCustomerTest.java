package cleaningService;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.cleaning_service.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class addCustomerTest {

	Customer customers = new Customer();
    String result1,result2;
    String res1,res2,res3;
    String re1,re2,re3;

 
   
	@Given("the customer {string} does not already exist")
	public void theCustomerDoesNotAlreadyExist(String string) {
	    // Write code here that turns the phrase above into concrete actions

	
	}
	@When("the customer tries to log in")
	public void theCustomerTriesToLogIn() {
	    // Write code here that turns the phrase above into concrete actions
		// Test adding a customer that does not exist
		
		
		 result1 = customers.addCustomer("mohamad");


	
	}
	@Then("the customer can be added")
	public void theCustomerCanBeAdded() {
	    // Write code here that turns the phrase above into concrete actions


	
	}
	@Then("the customer is added successfully")
	public void theCustomerIsAddedSuccessfully() {
	    // Write code here that turns the phrase above into concrete actions
       boolean b = result1.equalsIgnoreCase("Customer added successfully");
		assertEquals(b,true);



	}

//////////////////////////////////////////////////
/////////////////////////////////////////////////	
	


	@Given("the customer {string} already exists")
	public void theCustomerAlreadyExists(String string) {
	    // Write code here that turns the phrase above into concrete actions
	
		// Test adding a customer that already exists
		result2 = customers.addCustomer("lana");

	
	}
	
	@Then("the customer cannot be added")
	public void theCustomerCannotBeAdded() {
	    // Write code here that turns the phrase above into concrete actions
	//	assertEquals("Customer already exists", result2);
           	boolean b = result2.equalsIgnoreCase("Customer already exists");
			assertEquals(b,true);

	}
	@Then("the customer login fails")
	public void theCustomerLoginFails() {
	    // Write code here that turns the phrase above into concrete actions


	
	}



	
//////////////////////////////////////////////////
/////////////////////////////////////////////////	

	
	@Given("I am on the add customer page")
	public void iAmOnTheAddCustomerPage() {
	    // Write code here that turns the phrase above into concrete actions


	
	}
	@When("I enter {string} and {string} and {string} and {string} and {string} and {string}")
	public void iEnterAndAndAndAndAnd(String string, String string2, String string3, String string4, String string5, String string6) {
	    // Write code here that turns the phrase above into concrete actions


	
	}
	@When("I click the submit button")
	public void iClickTheSubmitButton() {
	    // Write code here that turns the phrase above into concrete actions
		
//		assertEquals("Customer added successfully", res1);
//		assertEquals("Customer added successfully", res2);
//		assertEquals("Customer added successfully", res3);

		
		

		Customer customer1 = new Customer();
		customer1.setUsername("julia");
		customer1.setPassword("123456");
		customer1.setName("Julia Williams");
		customer1.setPhoneNumber("123456");
		customer1.setAddress("Tel Aviv");
		customer1.setEmail("julia@company.com");
		res1 = customers.addCustomerWithInfo(customer1);

		Customer customer2 = new Customer();
		customer2.setUsername("david");
		customer2.setPassword("654321");
		customer2.setName("David Brown");
		customer2.setPhoneNumber("052123456");
		customer2.setAddress("Haifa");
		customer2.setEmail("david@company.com");
		res2 = customers.addCustomerWithInfo(customer2);

		Customer customer3 = new Customer();
		customer3.setUsername("sarah");
		customer3.setPassword("432156");
		customer3.setName("Sarah Lee");
		customer3.setPhoneNumber("052312456");
		customer3.setAddress("Jerusalem");
		customer3.setEmail("sarah@company.com");
		res3 = customers.addCustomerWithInfo(customer3);
		
	
	}


	@Then("the customer is added Done")
	public void theCustomerIsAddedDone() {
	    // Write code here that turns the phrase above into concrete actions
		
	    boolean b1 = res1.equalsIgnoreCase("Customer added successfully");
		assertEquals(b1,true);
		boolean b2 = res2.equalsIgnoreCase("Customer added successfully");
		assertEquals(b2,true);
		boolean b3 = res3.equalsIgnoreCase("Customer added successfully");
		assertEquals(b3,true);
	}



	
//////////////////////////////////////////////////
/////////////////////////////////////////////////	

	

	@When("I submit the form")
	public void iSubmitTheForm() {
	    // Write code here that turns the phrase above into concrete actions
		
		
		Customer customer1 = new Customer();
		customer1.setUsername(" ");
		customer1.setPassword("123456");
		customer1.setName("John");
		customer1.setPhoneNumber("123456");
		customer1.setAddress("Tel Aviv");
		customer1.setEmail("john@company.com");
		re1 = customers.addCustomerWithInfo(customer1);

		Customer customer2 = new Customer();
		customer2.setUsername("mike");
		customer2.setPassword(" ");
		customer2.setName("Smith");
		customer2.setPhoneNumber("052123456");
		customer2.setAddress("Haifa");
		customer2.setEmail("mike@company.com");
		re2 = customers.addCustomerWithInfo(customer2);

		Customer customer3 = new Customer();
		customer3.setUsername("amy");
		customer3.setPassword("654321");
		customer3.setName(" ");
		customer3.setPhoneNumber(" ");
		customer3.setAddress("Jerusalem");
		customer3.setEmail("amy@company.com");
		re3 = customers.addCustomerWithInfo(customer3);

	}
	@Then("I should get an error message {string}")
	public void iShouldGetAnErrorMessage(String string) {
	    // Write code here that turns the phrase above into concrete actions
	//	assertEquals("Please enter valid information.", re1);
	//	assertEquals("Please enter valid information.", re2);
	//	assertEquals("Please enter valid information.", re3);

		
		            boolean b1 = re1.equalsIgnoreCase("Please enter valid information.");
					assertEquals(b1,true);
					boolean b2 = re2.equalsIgnoreCase("Please enter valid information.");
					assertEquals(b2,true);
					boolean b3 = re3.equalsIgnoreCase("Please enter valid information.");
					assertEquals(b3,true);
		

	
	}



	


	
	
	
	
	


}
