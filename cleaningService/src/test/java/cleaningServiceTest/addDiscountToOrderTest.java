package cleaningServiceTest;

import static org.junit.Assert.assertTrue;

import cleaningServiceMain.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class addDiscountToOrderTest {

Customer c2,c1;
Request r1,r2,r4,r3;
int isLogin1,isLogin2;
double d1,d2;
Product p1,p2,p3;
boolean a1,a2;
	@Given("the price of the order is greater than {int}")
	public void thePriceOfTheOrderIsGreaterThan(Integer int1) {


        c1=new Customer("sami","1234","sami saif","Jerusalem","0503456789");
        CustomerFunction.customers.add(c1);   
        c2=new Customer("Adam","1234","sami saif","Jerusalem","0503456789");
        CustomerFunction.customers.add(c2);   

        p1  = new Product("Berber carpet","wool","carpet",150.0);
p2  = new Product("Persian rugt","synthetic","carpet",300.0);
p3  = new Product("Sofa cover","fits 3-seat sofa, cotton","cover",50.0);
AdminFunction.products.add(p1);
AdminFunction.products.add(p2);
AdminFunction.products.add(p3);
WorkerFunction.products.add(p1);
WorkerFunction.products.add(p2);
WorkerFunction.products.add(p3);

r1 = new Request("sami","6/5/2023","1:30",0,p1);
r2 = new Request("sami","5/5/2023","12:30",0,p2);
r4 = new Request("sami","15/5/2023","10:00",0,p3);
 r3 = new Request("Adam","15/5/2023","10:00",0,p3);

CustomerFunction.requests.add(r1);
CustomerFunction.requests.add(r2);
CustomerFunction.requests.add(r3);
CustomerFunction.requests.add(r4);
InvoiceOrder.requests.add(r1);
InvoiceOrder.requests.add(r2);
InvoiceOrder.requests.add(r3);
InvoiceOrder.requests.add(r4);
	}
	@When("the user applies a discount to the order")
	public void theUserAppliesADiscountToTheOrder() {
        isLogin1 = Login.checkLoginStatus("sami","1234"); 

            // if isLogin == 2 --> True

         d1 = CustomerFunction.addDiscounttoRequest("sami","15/5/2023","10:00");
         if(isLogin1 == 2 && d1 == 0.2)a1 =true;


		
	}
	@Then("the discount is added to the order request")
	public void theDiscountIsAddedToTheOrderRequest() {

		
		
	}
	@Then("the discount information is stored in the customer's record")
	public void theDiscountInformationIsStoredInTheCustomerSRecord() {

		assertTrue(a1 == true);
		
	}



	@Given("the price of the order is less than {int}")
	public void thePriceOfTheOrderIsLessThan(Integer int1) {

		 
        isLogin2 = Login.checkLoginStatus("Adam","1234");


        d2 = CustomerFunction.addDiscounttoRequest("Adam","15/5/2023","10:00");

        if(isLogin2 == 2 && d2 == 1)a2 =true;
	}
	@When("the user attempts to apply a discount to the order")
	public void theUserAttemptsToApplyADiscountToTheOrder() {

		
	}
	@Then("the discount is not added to the order request")
	public void theDiscountIsNotAddedToTheOrderRequest() {

		assertTrue(a2 == true);
		
		
	}



}
