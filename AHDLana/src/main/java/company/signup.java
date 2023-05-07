package company;

import java.util.Scanner;

public class signup {

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
	public signup()
	{
		System.out.println("Welcome to the Sign up \n"+
							"----------------------------------------------\n"+
							"Please enter your new username : ");
		String u=in.nextLine();
		while(search(u))
		{
			System.out.println("Username already exists, try again \nEnter your new username :");
			u=in.nextLine();
		}
		System.out.println("Please enter the password : ");
		String p=in.nextLine();
		System.out.println("Please enter your name :");
		String n=in.nextLine();
		System.out.println("Please enter your address :");
		String a=in.nextLine();
		System.out.println("Please enter your phone");
		String ph=in.nextLine();
		customer cus=new customer(u,p,n,a,ph);
		customerFunction.customers.add(cus);
		System.out.println("User is added to the company successfully");
	}
	
	
}
