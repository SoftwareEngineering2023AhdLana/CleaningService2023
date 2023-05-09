package cleaningService2023;

import static org.junit.Assert.assertTrue;

import java.io.InputStreamReader;
import java.util.Scanner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class adminAddProductTest {
String name;
boolean a = true;	

 String picture;
 String description;
 String category;
 double price ;
Scanner s=new Scanner(new InputStreamReader(System.in));

	@Given("these are the services")
	public void theseAreTheServices(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
		 System.out.print("the product name: ");
		 name = s.nextLine();
		 
		 for(int i=0;i<3;i++)
			{
				
				if((	name.equalsIgnoreCase( dataTable.cell(i, 0)) ) ) {
					 a=false;
					
				}
				
			
			}

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

	}
	@Then("the product can be added")
	public void theProductCanBeAdded() {
	    // Write code here that turns the phrase above into concrete actions
      assertTrue(a==true);
	}
	@Then("the product is added")
	public void theProductIsAdded() {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.print("the product picture: ");
		picture = s.nextLine();
		 System.out.print("the product description: ");
		description = s.nextLine();
		 System.out.print("the product category: ");
		category = s.nextLine();
		 System.out.print("the product price: ");
		price = s.nextDouble();
   
	}


	
	
	

	@Given("the product already exists")
	public void theProductAlreadyExists() {
	    // Write code here that turns the phrase above into concrete actions

	}
	@Then("the product cannot be added")
	public void theProductCannotBeAdded() {
	    // Write code here that turns the phrase above into concrete actions
    assertTrue(a==false);
	}
	@Then("the product is not added")
	public void theProductIsNotAdded() {
	    // Write code here that turns the phrase above into concrete actions

	}



}
