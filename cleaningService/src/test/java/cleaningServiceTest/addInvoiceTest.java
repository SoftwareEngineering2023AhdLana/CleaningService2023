package cleaningServiceTest;

import static org.junit.Assert.assertTrue;

import cleaningServiceMain.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class addInvoiceTest {
	Customer c2,c1;
	Request r1,r2,r4;
	int isLogin1,isLogin2;
	double d1,d2;
	Product p1,p2,p3;
	boolean a1,a2;
	int num;
	@Given("that the customer is logged in")
	public void thatTheCustomerIsLoggedIn() {

		 c1=new Customer("sami","1234","sami saif","Jerusalem","0503456789");
         CustomerFunction.customers.add(c1);  

         p1  = new Product("Berber carpet","wool","carpet",150.0);
p2  = new Product("Persian rugt","synthetic","carpet",300.0);
p3  = new Product("Sofa cover","fits 3-seat sofa, cotton","cover",250.0);
AdminFunction.products.add(p1);
AdminFunction.products.add(p2);
AdminFunction.products.add(p3);
WorkerFunction.products.add(p1);
WorkerFunction.products.add(p2);
WorkerFunction.products.add(p3);

r1 = new Request("sami","6/5/2023","1:30",0,p1);
r2 = new Request("sami","5/5/2023","12:30",0,p2);
r4 = new Request("sami","15/5/2023","10:00",0,p3);

CustomerFunction.requests.add(r1);
CustomerFunction.requests.add(r2);
CustomerFunction.requests.add(r4);

InvoiceOrder.requests.add(r1);
InvoiceOrder.requests.add(r2);
InvoiceOrder.requests.add(r4);
		
	}
	@Given("they have an order")
	public void theyHaveAnOrder() {

		

        isLogin1 = Login.checkLoginStatus("sami","1234"); 

            
        num = CustomerFunction.requests.size();

	}
	@When("the customer tries to add the invoice")
	public void theCustomerTriesToAddTheInvoice() {

		if(isLogin1 == 2 )a1 =true;
		if(a1 == true && num >0)a2 =true;
		
	}
	@Then("the invoice can be generated")
	public void theInvoiceCanBeGenerated() {

		
		
	}
	@Then("the invoice is successfully generated")
	public void theInvoiceIsSuccessfullyGenerated() {
assertTrue (a2 == true);
		
	}



}
