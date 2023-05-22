package com.cleaning_service;


import java.util.ArrayList;
import java.util.List;

public class Admin {


		private String name;
		private String username;
		private String password;
		private String address;
		private String phoneNumber;
		private Boolean logState=false;
		List<Product> products=new ArrayList<Product>();

		public Admin() 
		{
			addP();
		}
		public Admin(String s1,String s2,String s3,String s4,String s5)// user name,pass,name,address,phone
		{
			this.username=s1;
			this.password=s2;
			this.name=s3;
			this.address=s4;
			this.phoneNumber = s5;
		}
		public String getName() 
		{
			return name;
		}
		public void setName(String name) 
		{
			this.name = name;
		}
		public String getUsername() 
		{
			return username;
		}
		public void setUsername(String username)
		{
			this.username = username;
		}
		public String getPassword() 
		{
			return password;
		}
		public void setPassword(String password) 
		{
			this.password = password;
		}
		public Boolean getLogState() {
			return logState;
		}
		public void setLogState(Boolean logStat) {
			this.logState = logStat;
		}
		public String getPhoneNumber() {
			return phoneNumber;
		}
		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}

		
		public void addProduct(Product p)
		{
			products.add(p);
		}
		public boolean addProductTest(Product product  ) {
			   boolean flag = false;
				   for( int i  = 0 ; i < products.size(); i++) {
					    if(product.getName().equalsIgnoreCase(products.get(i).getName())){
					    flag = true;
					    }
				   

			   }
			    return !flag;

		   }
			public  void addP() {
				  Product p1 =  new Product("Capet Wash per meter","wool","carpet1",40.0);
				  Product p2 =  new Product("Curtains Wash per C9urtain","synthetic","carpet1",70.0);
				  Product p3 =  new Product("covers Wash per Cover","fits 3-seat sofa, cotton","cover",20.0);
				   
				    addProduct(p1);
				    addProduct(p2);
				    addProduct(p3);
			}
		    
		
		
	}




