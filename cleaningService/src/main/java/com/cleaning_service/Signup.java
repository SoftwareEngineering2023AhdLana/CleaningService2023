package com.cleaning_service;


import java.util.Scanner;

public class Signup {

	static Scanner in=new Scanner(System.in);
	public static Boolean search(String u)
	{
		for(int i=0;i<customerFunction.customers.size();i++)
		{
			if(u.equals(customerFunction.customers.get(i).getUsername()))
			{
				return true;
			}
		}
		for(int i=0;i<adminFunction.admins.size();i++)
		{
			if(u.equals(adminFunction.admins.get(i).getUsername()))
			{
				return true;
			}
		}
		for(int i=0;i<workerFunction.workers.size();i++)
		{
			if(u.equals(workerFunction.workers.get(i).getUsername()))
			{
				return true;
			}
		}
		return false;
	}
	public Signup()
	{
		System.out.println("Welcome to the Sign up \n"+
							"----------------------------------------------\n"+
							"Please enter your new user name : ");
		String u=in.nextLine();
		while(search(u))
		{
			System.out.println("Username already e xists, try again \nEnter your new username :");
			u=in.nextLine();
		}
		System.out.println("Please enter the password : ");
		String p=in.nextLine();
		System.out.println("Please enter your password :");
		String n=in.nextLine();
		System.out.println("Please enter your phone Number :");
		String a=in.nextLine();
		System.out.println("Please enter your address");
		String ph=in.nextLine();
		Customer cus=new Customer(u,p,n,a,ph);
		customerFunction.customers.add(cus);
		System.out.println("customer is added to the system successfully");
	}
	
	
}

