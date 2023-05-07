package cleaningService2023;

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
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
		System.out.print(" display Invoice for customer :");
		System.out.print(" \nEnter your name:");
		nam1 = s.nextLine();

		for(int i=0;i<3;i++)
		{
			if(nam1.equalsIgnoreCase(dataTable.cell(i,0))) {
			name = dataTable.cell(i,0) ;
			np =dataTable.cell(i,1);
			price =dataTable.cell(i,3);
			System.out.print("\ncastomer name : "+name+"\n"+"buy product : "+np+"\nprice : "+price+"\n");
			System.out.print("--------------------------------\n");
		}
		}
		
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
assertTrue(a==true);
	}




	
	

}
