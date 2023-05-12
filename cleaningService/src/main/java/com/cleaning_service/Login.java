package com.cleaning_service;



import java.util.ArrayList;
import java.util.Scanner;

public class Login {
	static Scanner in=new Scanner(System.in);
	static int index=-1;
	static int indexOfOrder;
	static String dateOfOrder;
	static String timeOfOrder;
	public Login() {}

    private static void adminMenu() {
    	  int x = 0;
    	  while(x != 1) {
        System.out.println("Welcome, admin!");
        System.out.println("1. View customer data.");
        System.out.println("2. View worker data.");
        System.out.println("3. View product data.");
        System.out.println("4. View all data.");
        System.out.println("5. View all order.");
        System.out.println("6. add product.");
        System.out.println("7. Edit product.");
        System.out.println("8. delete product.");
        System.out.println("9. Log out.");
        System.out.print("Enter your choice: ");

      
        int choice = in.nextInt();
  	  in.nextLine();

        if (choice == 1) {
        	LoginFunction.viewCustomerData();
        } else if (choice == 2) {
        	LoginFunction.viewWorkerData();
        } else if (choice == 3) {
        	LoginFunction.viewProductData();
        }
        else if (choice == 4) {
        	LoginFunction.viewAllData();
        }
        else if (choice == 5) {
        	LoginFunction.viewRequestData();
        } else if (choice == 6) {
        	LoginFunction.addProduct();
        	
        }
        else if (choice == 7) {
            // Edit product
        	LoginFunction.editProduct();
        }
        else if (choice == 8) {
        	LoginFunction.removeProduct();
        }
        else if (choice == 9) {
            System.out.println("Logging out...");
        	 System.out.println("...............................");

        
            x=1;
        } else {
            System.out.println("Invalid choice. Please enter 1, 2, 3,4,5,6 or 7.");
        	 System.out.println("...............................");

        }
      }
        
    }

	   

	private static void customerMenu(String user) {
		  int x = 0;
		  InvoiceOrder.customerName = user;
    	  while(x != 1) {
        System.out.println("Welcome, CUSTOMER!");
        // print the available worker depend the time customer login
        System.out.println("1. View product data.");
        System.out.println("2. add order.");
        System.out.println("3. Edit order.");
        System.out.println("4. delete order.");
        System.out.println("5. show invoice for order.");
        System.out.println("6. Log out.");
        System.out.print("Enter your choice: ");

      
        int choice = in.nextInt();
  	    in.nextLine();

        if (choice == 1) {
        	LoginFunction.viewProductData();
        } else if (choice == 2) {
        	LoginFunction.addOrderCustomer(user);
        
        } else if (choice == 3) {
        	LoginFunction.editOrder(user);

        }
        else if (choice == 4) {

        	LoginFunction.deleteOrder(user);
        	
        	
        }
        else if (choice == 5) {

        InvoiceOrder.print();
        	


        } 
        else if (choice == 6) {
            System.out.println("Logging out...");
        	 System.out.println("...............................");

            x=1;
        } else {
            System.out.println("Invalid choice. Please enter 1, 2, 3,4,5 or 6.");
        	 System.out.println("...............................");

        }
      }
	}
	
	    

	private static void workerMenu(String user) {
		  int x = 0;
  	  while(x != 1) {
      System.out.println("Welcome, worker!");
      System.out.println("1. Notify the customer when order Done .");
      System.out.println("2. Generate Statistics.");
      System.out.println("3. Log out.");
      System.out.print("Enter your choice: ");

    
      int choice = in.nextInt();
	    in.nextLine();

      if (choice == 1) {


      } else if (choice == 2) {


      } 
      else if (choice == 3) {
          System.out.println("Logging out...");
      	 System.out.println("...............................");

          x=1;
      } else {
          System.out.println("Invalid choice. Please enter 1, 2 or 3.");
      	 System.out.println("...............................");

      }
    }		
	}
	 
	
	
	
	
	public Login(ArrayList<Admin> a,ArrayList<Customer> c,ArrayList<Worker> w)
	{
		for(int i=0;i<a.size();i++)
			AdminFunction.admins.add(a.get(i));
		
		for(int i=0;i<c.size();i++)
			CustomerFunction.customers.add(c.get(i));
	
		for(int i=0;i<a.size();i++)
			WorkerFunction.workers.add(w.get(i));
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
				AdminFunction.admins.get(index).setLogState(true);
				AdminFunction a=new AdminFunction();
				adminMenu();
			}
			else if(res==-1)
			{
				AdminFunction.admins.get(index).setLogState(false);
				System.out.println("Invalid admin name or password. Try again");
			}
			else if(res==2)
			{
				CustomerFunction.customers.get(index).setLogState(true);
				CustomerFunction c=new CustomerFunction();
				customerMenu(CustomerFunction.customers.get(index).getUsername());
			}
			else if(res==1)
			{
				CustomerFunction.customers.get(index).setLogState(false);
				System.out.println("Invalid customer name or password. Try again");
			}
			else if(res==3)
			{
				WorkerFunction.workers.get(index).setLogState(true);
				CustomerFunction w=new CustomerFunction();
				workerMenu(CustomerFunction.customers.get(index).getUsername());
				
			}
			else if(res==-3)
			{
				WorkerFunction.workers.get(index).setLogState(false);
				System.out.println("Invalid worker name or password. Try again");
			}
			else if(res==0)
			{
				System.out.println("user name do not exist\n"
								+ "You will be sign up \n"
								+ "Loading..........................");
				Signup SU=new Signup();
			}
		}
	}
	
	public static int checkLoginStatus(String u,String p)
	{

		for(int i=0;i<CustomerFunction.customers.size();i++)
		{
			if(u.equals(CustomerFunction.customers.get(i).getUsername()))
			{	
				index=i;
				if(p.equals(CustomerFunction.customers.get(i).getPassword()))
					return 2;
				else
					return 1;
			}
		}
		for(int i=0;i<AdminFunction.admins.size();i++)
		{
			if(u.equals(AdminFunction.admins.get(i).getUsername()))
			{	
				index=i;
				if(p.equals(AdminFunction.admins.get(i).getPassword()))
					return -2;
				else
					return -1;
			}
		}
		for(int i=0;i<WorkerFunction.workers.size();i++)
		{
			if(u.equals(WorkerFunction.workers.get(i).getUsername()))
			{	
				index=i;
				if(p.equals(WorkerFunction.workers.get(i).getPassword()))
					return 3;
				else
					return -3;
			}
		}
		return 0;
	}
	
	public static void main(String[] args)
	{
		
			Admin a1=new Admin("lanahasan","12345","lana hasan","nablus","050677677");
			Admin a2=new Admin("ahdGhazal","123123","ahd Ghazal","Ramallah","0501234567");
			Admin a3=new Admin("samsam","1234","sam sam","Jerusalem","0501020356");
			AdminFunction.admins.add(a1);
			AdminFunction.admins.add(a2);
			AdminFunction.admins.add(a3);
			Worker w1=new Worker("AhmadM","12345","Ahmad Mohamad","nablus","0502222222");		
			Worker w2=new Worker("razan12","123123","razan","nablus","0502345678");
			Worker w3=new Worker("aliA","1234","ali Ahmad","nablus","0509384751");
			WorkerFunction.workers.add(w1);
			WorkerFunction.workers.add(w2);
			WorkerFunction.workers.add(w3);
			Customer c1=new Customer("leen1","12345","leen","Ramallah","0501111111");		
			Customer c2=new Customer("ahd","123123","ahd ghazal","Bethlehem","0502348765");
			Customer c3=new Customer("sami","1234","sami saif","Jerusalem","0503456789");
			CustomerFunction.customers.add(c1);
			CustomerFunction.customers.add(c2);
			CustomerFunction.customers.add(c3);
			///                        name           description    category   price
			Product p1  = new Product("Berber carpet","wool","carpet",150.0);
			Product p2  = new Product("Persian rugt","synthetic","carpet",300.0);
			Product p3  = new Product("Sofa cover","fits 3-seat sofa, cotton","cover",250.0);
			AdminFunction.products.add(p1);
			AdminFunction.products.add(p2);
			AdminFunction.products.add(p3);
			WorkerFunction.products.add(p1);
			WorkerFunction.products.add(p2);
			WorkerFunction.products.add(p3);
			
			Request r1 = new Request("sami","6/5/2023","1:30",0,p1);
			Request r2 = new Request("sami","5/5/2023","12:30",0,p2);
			Request r4 = new Request("sami","15/5/2023","10:00",0,p3);

			CustomerFunction.requests.add(r1);
			CustomerFunction.requests.add(r2);
			CustomerFunction.requests.add(r4);
			
			 InvoiceOrder.requests.add(r1);
			 InvoiceOrder.requests.add(r2);
			 InvoiceOrder.requests.add(r4);
			 
			CustomerFunction.checkAllOrder();
			main_login();
		
	}
	
}

