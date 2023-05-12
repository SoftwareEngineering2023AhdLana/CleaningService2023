package com.cleaning_service;


import java.util.ArrayList;

public class admin {


		private String name;
		private String username;
		private String password;
		private String address;
		private String phoneNumber;
		private Boolean logState=false;
		static public ArrayList<product> products=new ArrayList<product>();

		public admin() 
		{
			
		}
		public admin(String s1,String s2,String s3,String s4,String s5)// user name,pass,name,address,phone
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

		
		public void addProduct(product p)
		{
			products.add(p);
		}
		
		
	}




