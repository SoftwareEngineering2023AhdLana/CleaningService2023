import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class customerRemoveReqTest {

	@Given("we have customer request table.")
	public void we_have_customer_request_table(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //

	
	
	}
	@Given("that the customer  {string} is logged in")
	public void that_the_customer_is_logged_in(String string) {
	    // Write code here that turns the phrase above into concrete actions

	
	
	}
	@Given("the entered date is {string} and time is {string}")
	public void the_entered_date_is_and_time_is(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions

	
	}
	@Given("the date and time exist in the customer's request's")
	public void the_date_and_time_exist_in_the_customer_s_request_s() {
	    // Write code here that turns the phrase above into concrete actions

	
	}
	@Then("the date and time can be removed")
	public void the_date_and_time_can_be_removed() {
	    // Write code here that turns the phrase above into concrete actions

	
	}
	@Then("the date and time are removed")
	public void the_date_and_time_are_removed() {
	    // Write code here that turns the phrase above into concrete actions

	
	
	}





	@Given("the date and time do not exist in the customer's request's")
	public void the_date_and_time_do_not_exist_in_the_customer_s_request_s() {
	    // Write code here that turns the phrase above into concrete actions

	
	
	}
	@Then("the date and time can not be removed")
	public void the_date_and_time_can_not_be_removed() {
	    // Write code here that turns the phrase above into concrete actions

	
	
	}
	@Then("the date and time are not removed")
	public void the_date_and_time_are_not_removed() {
	    // Write code here that turns the phrase above into concrete actions

	
	
	}



}
