import static org.junit.Assert.assertTrue;

import company.admin;
import company.adminFunction;
import company.customer;
import company.customerFunction;
import company.login;
import company.worker;
import company.workerFunction;
import io.cucumber.core.stepexpression.DataTableArgument;
import io.cucumber.datatable.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginTest {
	login l;
	String u,p;
	int result;
	int index=-1;
	int c0a1=-1;
	public loginTest()
	{
	}
	
	@Given("these are the users")
	public void these_are_the_users(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
		if((customerFunction.customers.size()<3)&&(adminFunction.admins.size()<3)&&(workerFunction.workers.size()<3))
		{
			
			for(int i=0;i<3;i++)
			{
				admin ad=new admin();
				ad.setUsername(dataTable.cell(i, 0));
				ad.setPassword(dataTable.cell(i, 1));
				ad.setName(dataTable.cell(i, 2));
				ad.setPhoneNumber("059976"+i+i+i+i);
				adminFunction.admins.add(ad);
			}
			worker w1=new worker("AhmadM","12345","Ahmad Mohamad","nablus","050677677");		
			worker w2=new worker("razan12","123123","razan","nablus","050677677");
			worker w3=new worker("aliA","1234","ali Ahmad","nablus","050677677");
			workerFunction.workers.add(w1);
			workerFunction.workers.add(w2);
			workerFunction.workers.add(w3);
			customer c1=new customer("leen1","12345","leen","nablus","050677677");		
			customer c2=new customer("ahd","123123","ahd ghazal","nablus","050677677");
			customer c3=new customer("sami","1234","sami saif","nablus","050677677");
			customerFunction.customers.add(c1);
			customerFunction.customers.add(c2);
			customerFunction.customers.add(c3);
		}
	}
	@Given("that the worker {string} is not logged in")
	public void that_the_worker_is_not_logged_in(String string) {
	    // Write code here that turns the phrase above into concrete actions
	}
	@When("worker tries to login")
	public void worker_tries_to_login() {
	    // Write code here that turns the phrase above into concrete actions
	  
	}
	@When("username is {string} and password is {string}")
	public void username_is_and_password_is(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions

		u=string;
		p=string2;
		result=login.checkLoginStatus(u, p);
		if(result!=0)
		{
			for(int i=0;i<adminFunction.admins.size();i++)
			{
				if(u.equals(adminFunction.admins.get(i).getUsername()))
				{
					index=i;
					c0a1=0;
					break;
				}			
			}
			for(int i=0;i<workerFunction.workers.size();i++)
			{
				if(u.equals(workerFunction.workers.get(i).getUsername()))
				{
					index=i;
					c0a1=1;
					break;
				}			
			}
			for(int i=0;i<customerFunction.customers.size();i++)
			{
				if(u.equals(customerFunction.customers.get(i).getUsername()))
				{
					index=i;
					c0a1=1;
					break;
				}			
			}
		}
	
	}
	@Then("the worker login succeeds")
	public void the_worker_login_succeeds() {
	    // Write code here that turns the phrase above into concrete actions
		assertTrue(result==3);
	}
	@Then("the worker is logged in")
	public void the_worker_is_logged_in() {
	    // Write code here that turns the phrase above into concrete actions
		index=workerFunction.search(u);
		if(c0a1==0)
		{
			workerFunction.workers.get(index).setLogState(true);
		}
	}


	
	@When("worker tries to log in")
	public void worker_tries_to_log_in() {
	    // Write code here that turns the phrase above into concrete actions
	   
	}
	
	@Then("the worker login fails")
	public void the_worker_login_fails() {
	    // Write code here that turns the phrase above into concrete actions
		assertTrue(result==-3);
	}
	@Then("the worker is not logged in")
	public void the_worker_is_not_logged_in() {
	    // Write code here that turns the phrase above into concrete actions

	}


	
	
	
	
	//********************************************************************
	//********************************************************************
	//********************************************************************





	@Given("that the admin {string} is not logged in")
	public void that_the_admin_is_not_logged_in(String string) {
	    // Write code here that turns the phrase above into concrete actions
	  
	}
	@When("admin tries to log in")
	public void admin_tries_to_log_in() {
	    // Write code here that turns the phrase above into concrete actions
	 
	}
	
	@Then("the admin login succeeds")
	public void the_admin_login_succeeds() {
	    // Write code here that turns the phrase above into concrete actions
		assertTrue(result==-2);

	}
	@Then("the admin is logged in")
	public void the_admin_is_logged_in() {
	    // Write code here that turns the phrase above into concrete actions
		index=adminFunction.search(u);
		if(c0a1==1)
		{
			adminFunction.admins.get(index).setLogState(true);
		}
	}



	@Then("the admin login fails")
	public void the_admin_login_fails() {
	    // Write code here that turns the phrase above into concrete actions
		assertTrue(result==-1);

	}
	@Then("the admin is not logged in")
	public void the_admin_is_not_logged_in() {
	    // Write code here that turns the phrase above into concrete actions
	   
	}


	
	
	//********************************************************************
	//********************************************************************
	//********************************************************************

	@Given("that the customer {string} is not logged in")
	public void that_the_customer_is_not_logged_in(String string) {
	    // Write code here that turns the phrase above into concrete actions
	  
	}
	@When("customer tries to log in")
	public void customer_tries_to_log_in() {
	    // Write code here that turns the phrase above into concrete actions
	
	}

	@Then("the customer login succeeds")
	public void the_customer_login_succeeds() {
	    // Write code here that turns the phrase above into concrete actions
		assertTrue(result==2);

	}
	@Then("the customer is logged in")
	public void the_customer_is_logged_in() {
	    // Write code here that turns the phrase above into concrete actions
		index=customerFunction.search(u);
		if(c0a1==1)
		{
			customerFunction.customers.get(index).setLogState(true);
		}
	}



	@Then("the customer login fails")
	public void the_customer_login_fails() {
	    // Write code here that turns the phrase above into concrete actions
		assertTrue(result==1);

	}
	@Then("the customer is not logged in")
	public void the_customer_is_not_logged_in() {
	    // Write code here that turns the phrase above into concrete actions
	 
	}


	
	//********************************************************************
	//********************************************************************
	//********************************************************************


	@Given("that no one is not logged in")
	public void that_no_one_is_not_logged_in() {
	    // Write code here that turns the phrase above into concrete actions
	
	}
	@When("user tries to log in")
	public void user_tries_to_log_in() {
	    // Write code here that turns the phrase above into concrete actions

	}
	@Then("login fails")
	public void login_fails() {
	    // Write code here that turns the phrase above into concrete actions
		assertTrue(result==0);
	}
	@Then("the user is redirected to sign up page")
	public void the_user_is_redirected_to_sign_up_page() {
	    // Write code here that turns the phrase above into concrete actions
	}



	
	

}




