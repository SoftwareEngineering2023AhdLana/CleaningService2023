package company;

import java.util.ArrayList;
import java.util.Scanner;

public class login {
	static Scanner in=new Scanner(System.in);
	static int index=-1;
	public login() {}
	
	public login(ArrayList<admin> a,ArrayList<customer> c,ArrayList<worker> w)
	{
		for(int i=0;i<a.size();i++)
			adminFunction.admins.add(a.get(i));
		
		for(int i=0;i<c.size();i++)
			customerFunction.customers.add(c.get(i));
	
		for(int i=0;i<a.size();i++)
			workerFunction.workers.add(w.get(i));
	}
	
	public static void main_login()
	{
		int res=0;
		System.out.println("Welcome to the Login \n"+"----------------------------------------------");
		while((res==0)||(res==-1)||(res==1)||(res==-3))
		{
			System.out.println("Enter your username");
			String u=in.nextLine();
			System.out.println("Enter the password");
			String p=in.nextLine();
			res=checkLoginStatus(u,p);
			if(res==-2)
			{
				adminFunction.admins.get(index).setLogState(true);
				adminFunction a=new adminFunction();
			}
			else if(res==-1)
			{
				adminFunction.admins.get(index).setLogState(false);
				System.out.println("Invalid user name. Try again");
			}
			else if(res==2)
			{
				customerFunction.customers.get(index).setLogState(true);
				customerFunction c=new customerFunction();
			}
			else if(res==1)
			{
				customerFunction.customers.get(index).setLogState(false);
				System.out.println("Invalid user name. Try again");
			}
			else if(res==3)
			{
				workerFunction.workers.get(index).setLogState(true);
				customerFunction w=new customerFunction();
			}
			else if(res==-3)
			{
				workerFunction.workers.get(index).setLogState(false);
				System.out.println("Invalid user name. Try again");
			}
			else if(res==0)
			{
				System.out.println("user name do not exist\n"
								+ "You will be sign up \n"
								+ "Loading..........................");
				signup SU=new signup();
			}
		}
	}
	public static int checkLoginStatus(String u,String p)
	{

		for(int i=0;i<customerFunction.customers.size();i++)
		{
			if(u.equals(customerFunction.customers.get(i).getUsername()))
			{	
				index=i;
				if(p.equals(customerFunction.customers.get(i).getPassword()))
					return 2;
				else
					return 1;
			}
		}
		for(int i=0;i<adminFunction.admins.size();i++)
		{
			if(u.equals(adminFunction.admins.get(i).getUsername()))
			{	
				index=i;
				if(p.equals(adminFunction.admins.get(i).getPassword()))
					return -2;
				else
					return -1;
			}
		}
		for(int i=0;i<workerFunction.workers.size();i++)
		{
			if(u.equals(workerFunction.workers.get(i).getUsername()))
			{	
				index=i;
				if(p.equals(workerFunction.workers.get(i).getPassword()))
					return 3;
				else
					return -3;
			}
		}
		return 0;
	}
	
	public static void main(String[] args)
	{
		/*
			admin a1=new admin("leenhasan","12345","leen hasan","nablus","050677677");
			admin a2=new admin("ahdGhazal","123123","ahd Ghazal","nablus","050677677");
			admin a3=new admin("samsam","1234","sam sam","nablus","050677677");
			adminFunction.admins.add(a1);
			adminFunction.admins.add(a2);
			adminFunction.admins.add(a3);
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
		*/
			main_login();
		
	}
	
}
