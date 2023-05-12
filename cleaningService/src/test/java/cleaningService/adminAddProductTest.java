package cleaningService;


import static org.junit.Assert.assertTrue;

import java.io.InputStreamReader;
import java.util.Scanner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class adminAddProductTest {
String name;
boolean a = true;	

 String picture;
 String description;
 String category;
 double price ;
Scanner s=new Scanner(new InputStreamReader(System.in));


@Given("these are the services")
public void theseAreTheServices(io.cucumber.datatable.DataTable dataTable) {
  
}
@Given("that the admin is logged in")
public void thatTheAdminIsLoggedIn() {
    // Write code here that turns the phrase above into concrete actions


}
@Given("the product does not already exist")
public void theProductDoesNotAlreadyExist() {
    // Write code here that turns the phrase above into concrete actions


}
@Given("the product is <{string}> and its price is {double}")
public void theProductIsAndItsPriceIs(String string, Double double1) {
    // Write code here that turns the phrase above into concrete actions


}
@When("admin tries to add the product to the company")
public void adminTriesToAddTheProductToTheCompany() {
    // Write code here that turns the phrase above into concrete actions


}
@Then("the product can be added")
public void theProductCanBeAdded() {
    // Write code here that turns the phrase above into concrete actions


}
@Then("the product is added")
public void theProductIsAdded() {
    // Write code here that turns the phrase above into concrete actions


}





@Given("the product already exists")
public void theProductAlreadyExists() {
    // Write code here that turns the phrase above into concrete actions


}




@Then("the product cannot be added")
public void theProductCannotBeAdded() {
    // Write code here that turns the phrase above into concrete actions


}
@Then("the product is not added")
public void theProductIsNotAdded() {
    // Write code here that turns the phrase above into concrete actions


}



}
