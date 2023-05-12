package cleaningService;

import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
public class notificationDoneOrderTest {
	String name;
	String np;
	boolean a = false;
	Scanner s=new Scanner(new InputStreamReader(System.in));
	/////////////////////////////////////////////////////////////////
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM");  
	LocalDateTime now = LocalDateTime.now();
	int currentDay=Integer.parseInt(dtf.format(now).split(" ")[0].split("/")[0]);
	int currentMonth=Integer.parseInt(dtf.format(now).split(" ")[0].split("/")[1]);




	@Given("these are the Order and customer")
	public void theseAreTheOrderAndCustomer(io.cucumber.datatable.DataTable dataTable) {


	}
	@Given("the the Time of order is after the local time now")
	public void theTheTimeOfOrderIsAfterTheLocalTimeNow() {
	    // Write code here that turns the phrase above into concrete actions

	}
	@Given("the order is pass")
	public void theOrderIsPass() {
	    // Write code here that turns the phrase above into concrete actions


	}
	@Then("send notofication to customer")
	public void sendNotoficationToCustomer() {
	    // Write code here that turns the phrase above into concrete actions

	}



}

