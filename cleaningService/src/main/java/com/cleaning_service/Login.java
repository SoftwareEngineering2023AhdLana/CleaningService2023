package com.cleaning_service;


import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

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
    		  Logger logger=Logger.getLogger(
						Login.class.getName());
       logger.log(Level.INFO,"Welcome, admin!");
       logger.log(Level.INFO,"1. View customer data.");
       logger.log(Level.INFO,"2. View worker data.");
        logger.log(Level.INFO,"3. View product data.");
        logger.log(Level.INFO,"4. View all data.");
        logger.log(Level.INFO,"5. View all order.");
        logger.log(Level.INFO,"6. add product.");
        logger.log(Level.INFO,"7. Edit product.");
        logger.log(Level.INFO,"8. delete product.");
        logger.log(Level.INFO,"9. Log out.");
        logger.log(Level.INFO,"Enter your choice: ");

      
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
            logger.log(Level.INFO,"Logging out...");
        	 logger.log(Level.INFO,"...........................");

        
            x=1;
        } else {
            logger.log(Level.INFO,"Invalid choice. Please enter 1, 2, 3,4,5,6 or 7.");
        	 logger.log(Level.INFO,".............................");

        }
      }
        
    }

	   

	private static void customerMenu(String user) {
		  int x = 0;
		  Logger logger=Logger.getLogger(
					Login.class.getName());
		  InvoiceOrder.customerName = user;
    	  while(x != 1) {
        logger.log(Level.INFO,"Welcome, CUSTOMER!");
        // print the available worker depend the time customer login
        logger.log(Level.INFO,"the available worker is : ");
        logger.log(Level.INFO,"1. View product data.");
        logger.log(Level.INFO,"2. add order.");
        logger.log(Level.INFO,"3. Edit order.");
        logger.log(Level.INFO,"4. delete order.");
        logger.log(Level.INFO,"5. show invoice for order.");
        logger.log(Level.INFO,"6. Log out.");
        logger.log(Level.INFO,"Enter your choice: ");

      
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
        	
            logger.log(Level.INFO,"Logging out..");
        	 logger.log(Level.INFO,"..............................");

            x=1;
        } else {
            logger.log(Level.INFO,"Invalid choice. Please enter 1, 2, 3,4,5 or 6.");
        	 logger.log(Level.INFO,"............................");

        }
      }
	}
	
	    

	private static void workerMenu(String user) {
		  int x = 0;
		  Logger logger=Logger.getLogger(
					Login.class.getName());
		  
  	  while(x != 1) {
  	  String w = "Welcome, worker"+user+"!";
      logger.log(Level.INFO,w);
      logger.log(Level.INFO,"1. Notify the customer when order Done .");
      logger.log(Level.INFO,"2. Generate Statistics.");
      logger.log(Level.INFO,"3. Log out.");
      logger.log(Level.INFO,"Enter your choice:  ");

    
      int choice = in.nextInt();
	    in.nextLine();

  
      if (choice == 3) {
          logger.log(Level.INFO,"Logging out");
      	 logger.log(Level.INFO,"..................................");

          x=1;
      } else {
          logger.log(Level.INFO,"Invalid choice. Please enter 1, 2 or 3.");
      	 logger.log(Level.INFO,"...................................");

      }
    }		
	}
	 
	
	
	
	
	public Login(List<Admin> a,List<Customer> c,List<Worker> w)
	{
		for(int i=0;i<a.size();i++)
			AdminFunction.admins.add(a.get(i));
		
		for(int i=0;i<c.size();i++)
			CustomerFunction.customers.add(c.get(i));
	
		for(int i=0;i<a.size();i++)
			WorkerFunction.workers.add(w.get(i));
	}
	
	public static void mainLogin()
	{
		  Logger logger=Logger.getLogger(
					Login.class.getName());
		int res=0;
		logger.log(Level.INFO,"Welcome to the Login \n"+"----------------------------------------------");
		while((res==0)||(res==-1)||(res==1)||(res==-3))
		{
			logger.log(Level.INFO,"Enter your username");
			String u=in.nextLine();
			logger.log(Level.INFO,"Enter the password");
			String p=in.nextLine();
			res=checkLoginStatus(u,p);
			if(res==-2)
			{
				AdminFunction.admins.get(index).setLogState(true);
				
				adminMenu();
			}
			else if(res==-1)
			{
				AdminFunction.admins.get(index).setLogState(false);
				logger.log(Level.INFO,"Invalid admin name or password. Try again");
			}
			else if(res==2)
			{
				CustomerFunction.customers.get(index).setLogState(true);
				
				customerMenu(CustomerFunction.customers.get(index).getUsername());
			}
			else if(res==1)
			{
				CustomerFunction.customers.get(index).setLogState(false);
				logger.log(Level.INFO,"Invalid customer name or password. Try again");
			}
			else if(res==3)
			{
				WorkerFunction.workers.get(index).setLogState(true);
		
				workerMenu(CustomerFunction.customers.get(index).getUsername());
				
			}
			else if(res==-3)
			{
				WorkerFunction.workers.get(index).setLogState(false);
				logger.log(Level.INFO,"Invalid worker name or password. Try again");
			}
			else if(res==0)
			{
				logger.log(Level.INFO,"user name do not exist\n"
								+ "You will be sign up \n"
								+ "Loading..........................");
				
			}
		}
	}
	
	public static int checkLoginStatus(String u,String p)
	{

		for(int i=0;i<CustomerFunction.customers.size();i++)
		{
			if(u.equals(CustomerFunction.customers.get(i).getUsername())&&p.equals(CustomerFunction.customers.get(i).getPassword()))
			{	
				index=i;
					return 2;}
			
				else
					return 1;
			}
		
		for(int i=0;i<AdminFunction.admins.size();i++)
		{
			if(u.equals(AdminFunction.admins.get(i).getUsername())&&p.equals(AdminFunction.admins.get(i).getPassword()))
			{	
				index=i;
				
					return -2;
					}
				else
					return -1;
			}
		
		for(int i=0;i<WorkerFunction.workers.size();i++)
		{
			if(u.equals(WorkerFunction.workers.get(i).getUsername())&&p.equals(WorkerFunction.workers.get(i).getPassword()))
			{	
				index=i;
				
					return 3;
					}
				else
					return -3;
			}
		
		return 0;
	}
	
	public static void main(String[] args)
	{
		
			Admin a1=new Admin("lanahasan","1235","lana hasan","nablus","050677677");
			Admin a2=new Admin("ahdGhazal","123","ahd Ghazal","Ramallah","0501234567");
			Admin a3=new Admin("samsam","1234","sam sam","Jerusalem","0501020356");
			AdminFunction.admins.add(a1);
			AdminFunction.admins.add(a2);
			AdminFunction.admins.add(a3);
			Worker w1=new Worker("AhmadM","12345","Ahmad Mohamad","nablus","0502222222","08:00","16:00");
		
			WorkerFunction.workers.add(w1);
	
			Customer c1=new Customer("leen1","12343","leen","Ramallah","0501111111");		
			Customer c2=new Customer("ahd","12312","ahd ghazal","Bethlehem","0502348765");
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
			mainLogin();
		
	}
	
}

