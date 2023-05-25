package cleaningServiceTest;

import static org.junit.Assert.assertTrue;

import com.cleaning_service.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class notificationDoneOrderTest {
boolean b;
	@Given("the the Time of order is after the local time now")
	public void theTheTimeOfOrderIsAfterTheLocalTimeNow() {
	  CustomerFunction.checkAllOrder();
  	b=  LoginFunction.checkCustomer();
		
		
	}
	@Given("the order is pass")
	public void theOrderIsPass() {

		
		
	}
	@Then("send notofication to customer")
	public void sendNotoficationToCustomer() {
assertTrue(b == true);
		
		
	}



}