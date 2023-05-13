package cleaningService;


import static org.junit.Assert.*;

import java.io.InputStreamReader;
import java.util.Scanner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class addCustomerTest {
	String name;
	boolean a = true;
	 String phone;
	 String address;
	 String email;
	 String password;
	 Scanner s=new Scanner(new InputStreamReader(System.in));
	

	@Given("these are the customer")
	public void theseAreTheCustomer(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.

		 System.out.print("Enter your user name: ");
		 name = s.nextLine();
		 
		 for(int i=0;i<3;i++)
			{
				
				if((	name.equalsIgnoreCase( dataTable.cell(i,1)) ) ) {
					 a=false;
					
				}
				
			
			}
	
	
	
	}
	@Given("the customer<{string}> does not already exist")
	public void theCustomerDoesNotAlreadyExist(String string) {
	    // Write code here that turns the phrase above into concrete actions

	}
	@When("cutomer tries log in")
	public void cutomerTriesLogIn() {
	    // Write code here that turns the phrase above into concrete actions

	}
	@Then("the customer can be added")
	public void theCustomerCanBeAdded() {
	    // Write code here that turns the phrase above into concrete actions
	     assertEquals(a,true);
	}
	@Then("the customer is added successful")
	public void theCustomerIsAddedSuccessful() {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.print("the phone: ");
		 phone = s.nextLine();
			 System.out.print("the address: ");
			 address = s.nextLine();
			 System.out.print("the email: ");
			 email = s.nextLine();
			 System.out.print("the password : ");
			 password = s.nextLine();
			
			 
	}



	@Given("the customer <{string}> already exists")
	public void theCustomerAlreadyExists(String string) {
	    // Write code here that turns the phrase above into concrete actions

	}

	@Then("the customer cannot be added")
	public void theCustomerCannotBeAdded() {
	    // Write code here that turns the phrase above into concrete actions
		 assertEquals(a,false);
	}
	@Then("the customer is log in fail")
	public void theCustomerIsLogInFail() {
	    // Write code here that turns the phrase above into concrete actions

	}




	
	
	
}

