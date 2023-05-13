package com.cleaning_service;


import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Signup {

	static Scanner in=new Scanner(System.in);
	public static Boolean search(String u)
	{
		for(int i=0;i<CustomerFunction.customers.size();i++)
		{
			if(u.equals(CustomerFunction.customers.get(i).getUsername()))
			{
				return true;
			}
		}
		for(int i=0;i<AdminFunction.admins.size();i++)
		{
			if(u.equals(AdminFunction.admins.get(i).getUsername()))
			{
				return true;
			}
		}
		for(int i=0;i<WorkerFunction.workers.size();i++)
		{
			if(u.equals(WorkerFunction.workers.get(i).getUsername()))
			{
				return true;
			}
		}
		return false;
	}
	Logger logger=Logger.getLogger(
			Signup.class.getName());
	
	 Signup()
	{
		 
		logger.log(Level.INFO,"Welcome to the Sign up \n"+
							"----------------------------------------------\n"+
							"Please enter your new user name : ");
		String u=in.nextLine();
		boolean search =search(u);
		while(Boolean.TRUE.equals(search))
		{
			logger.log(Level.INFO,"Username already e xists, try again \nEnter your new username :");
			u=in.nextLine();
		}
		logger.log(Level.INFO,"Please enter the password : ");
		String p=in.nextLine();
		logger.log(Level.INFO,"Please enter your password :");
		String n=in.nextLine();
		logger.log(Level.INFO,"Please enter your phone Number :");
		String a=in.nextLine();
		logger.log(Level.INFO,"Please enter your address");
		String ph=in.nextLine();
		Customer cus=new Customer(u,p,n,a,ph);
		CustomerFunction.customers.add(cus);
		logger.log(Level.INFO,"customer is added to the system successfully");
	}
	
	
}

