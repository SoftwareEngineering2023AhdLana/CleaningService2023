import java.lang.String;
import java.util.ArrayList;


public class Customer {
	
	String id;
	String name;
	String address;
	String phone;

	 ArrayList<Customer> c = new ArrayList<Customer>();
	 Customer(){
		 this.id ="";
		 this.name=" ";
		 this.address=" ";
		 this.phone = " ";
	 }
	  Customer(String i, String n, String a,String p){
		  this.id =i;
		  this.name =n;
		  this.address = a;
		  this.phone =p;
	  }
	  public void addCustomer(Customer cc) {
		  c.add(cc);
	  }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
