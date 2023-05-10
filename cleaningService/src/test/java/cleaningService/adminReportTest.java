package cleaningService;


import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class adminReportTest {

	double totalprice =0;
	@Given("these admin")
	public void theseAdmin(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	
for(int i=3;i<6;i++)
{
	totalprice += Double.parseDouble(dataTable.cell(i,1));
	
		
}

System.out.println("available product");
for(int i=6;i<9;i++)
{
	System.out.println(dataTable.cell(i,0)+" "+dataTable.cell(i,1));
	
		
}

	}



	@Given("that the admin <{string}> is logged in")
	public void thatTheAdminIsLoggedIn(String string) {
	    // Write code here that turns the phrase above into concrete actions

	}
	@Given("there are customer in the company")
	public void thereAreCustomerInTheCompany() {
	    // Write code here that turns the phrase above into concrete actions

	}
	@Given("at least one customer has an request")
	public void atLeastOneCustomerHasAnRequest() {
	    // Write code here that turns the phrase above into concrete actions

	}
	@Then("the report can be generated")
	public void theReportCanBeGenerated() {
	    // Write code here that turns the phrase above into concrete actions
assertTrue(true);
System.out.print("total price :  ");
System.out.println(totalprice);
	}





}

