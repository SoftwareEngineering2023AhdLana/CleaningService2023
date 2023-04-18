import static org.junit.Assert.assertTrue;

import company.adminFunction;
import company.product;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class adminAddProduct {
	String name;
	String s2,s3,s4;
	Double price;
	Boolean b;
	product s;
	
	
	@Given("these are the services")
	public void these_are_the_services(io.cucumber.datatable.DataTable dataTable) {
	   
	    // For other transformations you can register a DataTableType.
		if(adminFunction.products.size()<4)
		{
			for(int i=0;i<4;i++) 
			{
				product s= new product(dataTable.cell(i, 0), dataTable.cell(i, 1),dataTable.cell(i, 2),dataTable.cell(i, 3),Double.parseDouble(dataTable.cell(i, 4)));
				adminFunction.products.add(s);	
			}
		}
	
	}
	@Given("that the admin is logged in")
	public void that_the_admin_is_logged_in() {
	    // Write code here that turns the phrase above into concrete actions

	}
	@Given("the product does not already exist")
	public void the_product_does_not_already_exist() {
	    // Write code here that turns the phrase above into concrete actions

	}
	@Given("the product is {string} and its price is {double}")
	public void the_product_is_and_its_price_is(String string1,String string2,String string3,String string4, Double double1) {
	    // Write code here that turns the phrase above into concrete actions
		   name=string1;
		    price=double1;
		    s2=string2; s3 =string3;s4 = string4;
		    s=new product(name,s2,s3,s4, price);
			b=adminFunction.CheckIfProductCanAdd(s);
	
	}
	@When("admin tries to add the product to the company")
	public void admin_tries_to_add_the_product_to_the_company() {
	    // Write code here that turns the phrase above into concrete actions

	
	}
	@Then("the product can be added")
	public void the_product_can_be_added() {
	    // Write code here that turns the phrase above into concrete actions
		assertTrue("The product exists and cannot be added",!b);

	
	}
	@Then("the product is added")
	public void the_product_is_added() {
	    // Write code here that turns the phrase above into concrete actions
adminFunction.AddProduct(s);
	}



	@Given("the product already exists")
	public void the_product_already_exists() {
	    // Write code here that turns the phrase above into concrete actions

	
	}

	@Then("the product cannot be added")
	public void the_product_cannot_be_added() {
	    // Write code here that turns the phrase above into concrete actions
		assertTrue("The product can be added",b);
	
	}
	@Then("the product is not added")
	public void the_product_is_not_added() {
	    // Write code here that turns the phrase above into concrete actions

	
	}



}
