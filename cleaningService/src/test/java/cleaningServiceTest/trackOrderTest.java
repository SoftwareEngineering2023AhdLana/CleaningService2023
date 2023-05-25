package cleaningServiceTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.cleaning_service.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class trackOrderTest {

Worker w1,w2;;
Request r1,r2,r4;
int isLogin1,isLogin2;
double d1,d2;
Product p1,p2,p3;
boolean a1,a2;
int i1,i2;
boolean flag1 ,  flag2;
boolean f1,f2,f3 = true;
	@Given("that the customer is logged in to the company")
	public void thatTheCustomerIsLoggedInToTheCompany() {
		   w1=new Worker("aliA","1234","ali Ahmad","nablus","0509384751","08:00","23:00");
					WorkerFunction.workers.add(w1);
					   w2=new Worker("ali","1234","ali Ahmad","nablus","0509384751","08:00","23:00");
						WorkerFunction.workers.add(w1);

		            p1  = new Product("Berber carpet","wool","carpet",150.0);
					p2  = new Product("Persian rugt","synthetic","carpet",300.0);
					p3  = new Product("Sofa cover","fits 3-seat sofa, cotton","cover",250.0);
					AdminFunction.products.add(p1);
					AdminFunction.products.add(p2);
					AdminFunction.products.add(p3);
					WorkerFunction.products.add(p1);
					WorkerFunction.products.add(p2);
					WorkerFunction.products.add(p3);

					r1 = new Request("sami","1/2/2010","11:30",0,p1);
					r2 = new Request("sami","5/7/2023","12:30",0,p2);

					CustomerFunction.requests.add(r1);
					CustomerFunction.requests.add(r2);
					
					 InvoiceOrder.requests.add(r1);
					 InvoiceOrder.requests.add(r2);
	//	Login.main_login();
					 
					 
					
					
		
	}
	@Given("the time of the order is after the current local time")
	public void theTimeOfTheOrderIsAfterTheCurrentLocalTime() {
		 isLogin1 = Login.checkLoginStatus("aliA","1234");

	}
	@When("the customer checks the order status")
	public void theCustomerChecksTheOrderStatus() {
		if(isLogin1 == 3 )a1 =true;

		i1 = CustomerFunction.checkIfRequestPassed(r2.getDate(),r2.getTime());
	//	if(i1 == 1)flag1 =true;
		if(i1 == 1&&a1==true)f1 =true;
		
		
	
		

	}
	@Then("the order status is marked as {string}")
	public void theOrderStatusIsMarkedAs(String string) {

		
		
	}
	@Then("the updated order status is stored in the customer's record")
	public void theUpdatedOrderStatusIsStoredInTheCustomerSRecord() {

		
		assertTrue(f1 == true);
		
		
	}


	
	@Given("the time of the order is before the current local time")
	public void theTimeOfTheOrderIsBeforeTheCurrentLocalTime() {
	
		 isLogin2 = Login.checkLoginStatus("aliA","1234");

	}
	@When("the worker checks the order status")
	public void theWorkerChecksTheOrderStatus() {
		if(isLogin2 == 3 )a2 =true;

	 i2 = CustomerFunction.checkIfRequestPassed(r1.getDate(),r1.getTime());

		
		if(i2 == -1 && a2==true)f2 =true;
	
	}



	
	@Then("the order status remains unchanged as {string}")
	public void theOrderStatusRemainsUnchangedAs(String string) {
		
		assertTrue(f2 = true);
		

		
	}



}