package cleaningService;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import java.util.Scanner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;



public class logintest {
    
	boolean a = false;
	String name;
	String pass;
	
	 
	
	 @Given("I have the following users in my company by list")
	 public void iHaveTheFollowingUsersInMyCompanyByList(io.cucumber.datatable.DataTable dataTable) {
	     // Write code here that turns the phrase above into concrete actions
	     // For automatic transformation, change DataTable to one of
	     // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	     // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	     // Double, Byte, Short, Long, BigInteger or BigDecimal.
	     //
	     // For other transformations you can register a DataTableType.

		 Scanner s=new Scanner(System.in);
		 System.out.print("UserID: ");
		 name = s.nextLine();

         System.out.print("Password: ");
		 pass = s.nextLine();
		for(int i=0;i<5;i++)
		{
			
			if((	name.equalsIgnoreCase( dataTable.cell(i, 0)) ) && (pass.equalsIgnoreCase( dataTable.cell(i, 1)) )) {
				 a=true;
				
			}
			
		
		}
	 }
	 @Given("that the user is not logged in")
	 public void thatTheUserIsNotLoggedIn() {
	     // Write code here that turns the phrase above into concrete actions

	 
	 }
	 @Given("the id is <{string}> and password is <{string}>")
	 public void theIdIsAndPasswordIs(String string, String string2) {
	     // Write code here that turns the phrase above into concrete actions

	 
	 }
	 @Then("the user login succeeds")
	 public void theUserLoginSucceeds() {
	     // Write code here that turns the phrase above into concrete actions
		 assertEquals(a,true);

	 
	 }
	 @Then("the user is logged in")
	 public void theUserIsLoggedIn() {
	     // Write code here that turns the phrase above into concrete actions

	 }



	 @Then("the user login fails")
	 public void theUserLoginFails() {
	     // Write code here that turns the phrase above into concrete actions

	 
	 }
	 @Then("the user is not logged in")
	 public void theUserIsNotLoggedIn() {
	     // Write code here that turns the phrase above into concrete actions
		 assertEquals(a,false);

	 
	 }

}

