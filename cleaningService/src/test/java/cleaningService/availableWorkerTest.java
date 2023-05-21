package cleaningService;



import static org.junit.Assert.assertTrue;

import com.cleaning_service.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class availableWorkerTest {
WorkerFunction w =  new WorkerFunction();
boolean b;
	@Given("i have workers in system")
	public void iHaveWorkersInSystem() {
	    // Write code here that turns the phrase above into concrete actions

    b =   w.findAvilableWorkerTest();
	
	}
	@When("the user  is log in")
	public void theUserIsLogIn() {
	    // Write code here that turns the phrase above into concrete actions


	}
	@When("need to show avilable worker")
	public void needToShowAvilableWorker() {
	    // Write code here that turns the phrase above into concrete actions


	}
	@Then("print available worker or not")
	public void printAvailableWorkerOrNot() {
	    // Write code here that turns the phrase above into concrete actions

if(b = true) {
	w.findAvilableWorker();
	assertTrue(b == true);
}

else {
	w.findAvilableWorker();
	assertTrue(b == false);

}

	}



}
