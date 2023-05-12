package cleaningService;


import static org.junit.Assert.assertTrue;

import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class trackOrderTest {
	String name;
	String np;
	String d="Done",ss="still";
boolean a = false;
	Scanner s=new Scanner(new InputStreamReader(System.in));
	/////////////////////////////////////////////////////////////////
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM");  
	LocalDateTime now = LocalDateTime.now();
	int currentDay=Integer.parseInt(dtf.format(now).split(" ")[0].split("/")[0]);
	int currentMonth=Integer.parseInt(dtf.format(now).split(" ")[0].split("/")[1]);

	
	
	
	
	
	
	

	@Given("these are the Order")
	public void theseAreTheOrder(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.

	}
	@Given("that the customer is logged in to the company")
	public void thatTheCustomerIsLoggedInToTheCompany() {
	    // Write code here that turns the phrase above into concrete actions

	}
	@Given("the Time of order is after the local time now")
	public void theTimeOfOrderIsAfterTheLocalTimeNow() {
	    // Write code here that turns the phrase above into concrete actions

	}
	@Then("the request is turned into a Done")
	public void theRequestIsTurnedIntoADone() {
	    // Write code here that turns the phrase above into concrete actions

	}
	@Then("it is stored in the customer")
	public void itIsStoredInTheCustomer() {
	    // Write code here that turns the phrase above into concrete actions

	}


	

	@Given("the Time of order is befor the local time now")
	public void theTimeOfOrderIsBeforTheLocalTimeNow() {
	    // Write code here that turns the phrase above into concrete actions

	}
	@Then("the request is still")
	public void theRequestIsStill() {
	    // Write code here that turns the phrase above into concrete actions

	}



}

