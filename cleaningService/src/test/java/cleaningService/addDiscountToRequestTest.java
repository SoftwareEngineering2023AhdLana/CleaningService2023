package cleaningService;


import static org.junit.Assert.assertEquals;
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
				
				if((	name.equalsIgnoreCase( dataTable.cell(i,0)) ) ) {
					double n =  Double.parseDouble(dataTable.cell(i,1));
				
					if(n>=400.0 ) {
					 a=true;
					
				}
				
			
				}
			}
	
	
	}
	@Given("that the customer <{string}> is loggmed in to the company")
	public void thatTheCustomerIsLoggmedInToTheCompany(String string) {
	    // Write code here that turns the phrase above into concrete actions
	
	}



	@Given("that the customer <{string}> is logged in to the company")
	public void thatTheCustomerIsLoggedInToTheCompany(String string) {
	    // Write code here that turns the phrase above into concrete actions

	}
	@Given("the price <{string}>")
	public void thePrice(String string) {
	    // Write code here that turns the phrase above into concrete actions

	}
	@Then("add discount to request")
	public void addDiscountToRequest() {
	    // Write code here that turns the phrase above into concrete actions
		 assertEquals(true,a);
	}
	@Then("it is stored in the customer")
	public void itIsStoredInTheCustomer() {
	    // Write code here that turns the phrase above into concrete actions

	}


	
	@Then("not add discount to request")
	public void notAddDiscountToRequest() {
	    // Write code here that turns the phrase above into concrete actions
		 assertEquals(false,a);
	}



}

