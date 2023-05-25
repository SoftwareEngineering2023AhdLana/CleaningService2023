package cleaningServiceTest;



import static org.junit.Assert.assertTrue;

import com.cleaning_service.*;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class adminReportTest {
	Admin a ;
	boolean flag ;
	int isLogin1;
	@When("the admin generates the customer names report with their order details")
	public void theAdminGeneratesTheCustomerNamesReportWithTheirOrderDetails() {
		 a=new Admin("AdamA","12345","Adam Ahmad","nablus","050677677");
		AdminFunction.admins.add(a);
		isLogin1 = Login.checkLoginStatus("AdamA","12345");
	}
	@Then("the report can be generated")
	public void theReportCanBeGenerated() {

		
		if(isLogin1 == -2)flag  = true;
		assertTrue(flag == true);
		
	}



}