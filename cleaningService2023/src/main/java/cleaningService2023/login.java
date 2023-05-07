package cleaningService2023;



import java.util.ArrayList;
import java.util.Scanner;

public class login {
	static Scanner in=new Scanner(System.in);
	static int index=-1;
	static int indexOfOrder;
	static String dateOfOrder;
	static String timeOfOrder;
	public login() {}

	//                   DONE :) 
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
        	loginFunction.viewCustomerData();
        } else if (choice == 2) {
        	loginFunction.viewWorkerData();
        } else if (choice == 3) {
        	loginFunction.viewProductData();
        }
        else if (choice == 4) {
        	loginFunction.viewAllData();
        }
        else if (choice == 5) {
        	loginFunction.viewRequestData();
        } else if (choice == 6) {
        	loginFunction.addProduct();
        	
        }
        else if (choice == 7) {
            // Edit product
        	loginFunction.editProduct();
        }
        else if (choice == 8) {
        	loginFunction.removeProduct();
        }
        else if (choice == 9) {
            System.out.println("Logging out...");
        	 System.out.println("...............................");

          //  System.exit(0);
            x=1;
        } else {
            System.out.println("Invalid choice. Please enter 1, 2, 3,4,5,6 or 7.");
        	 System.out.println("...............................");

        }
      }
        
    }

	    ///////////////////////////////////////////////////////////
	   ///////////////////////////////////////////////////////////
	  ///////////////////////////////////////////////////////////
	 ///////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////
   ///////////////////////////////////////////////////////////
  ///////////////////////////////////////////////////////////
 ///////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////

	private static void customerMenu(String user) {
		// TODO Auto-generated method stub
		  int x = 0;
    	  while(x != 1) {
        System.out.println("Welcome, CUSTOMER!");
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
        	loginFunction.viewProductData();
        } else if (choice == 2) {
        	addOrder(user);
        } else if (choice == 3) {
        //  Edit order
        	editOrder(user);
        }
        else if (choice == 4) {
       //  delete order
        	removeOrder(user);
        	
        }
        else if (choice == 5) {
      // show invoice for order
        	invoiceOrder(user);
        	
        	
       	 System.out.println("...............................");
	
        } 
        else if (choice == 6) {
            System.out.println("Logging out...");
        	 System.out.println("...............................");

          //  System.exit(0);
            x=1;
        } else {
            System.out.println("Invalid choice. Please enter 1, 2, 3,4,5 or 6.");
        	 System.out.println("...............................");

        }
      }
	}
	
	public static void addOrder(String user) {

        //	 add order.
      
        	int i;
        	String date1;
        	String time;
        	
        	loginFunction.viewProductData();
        	
            System.out.println("Enter index of product");
            i=in.nextInt();
            indexOfOrder=i;
            System.out.println("Enter time for order");
            time = in.nextLine();
            timeOfOrder = time;
        	System.out.println("Enter date for order");
        	date1 = in.nextLine();
        	dateOfOrder = date1;
           
            product p = adminFunction.searchproductindex(i);
            request r = new request (user , date1 , time , 0,p);
        	customerFunction.addRequest(user , r);
        	
        	//???
         System.out.println("...............................");
         System.out.println("your order :");
         System.out.println(r.toString());
    	 System.out.println("...............................");
    		customerFunction.checkAllOrder();
	}
	
	public static void editOrder(String user) {


    	int i,i1;
    	String date,date1;
    	String time,time1;
    	
    	loginFunction.viewProductData();

        System.out.println("Enter index of product");
        i =in.nextInt();
        
        System.out.println("Enter time for order");
        time = in.nextLine();
        
    	System.out.println("Enter date for order");
    	date = in.nextLine();
       
        product p = adminFunction.searchproductindex(i);
        
        System.out.println("Enter new index of product");
        i1=in.nextInt();
        
        System.out.println("Enter new time for order");
        time1 = in.nextLine();
        
    	System.out.println("Enter new date for order");
    	date1 = in.nextLine();
       
        product p1 = adminFunction.searchproductindex(i1);
        
        customerFunction.editRequest(user, date, date1, time, time1, p, p1);
        
    	System.out.println("...............................");
    	customerFunction.checkAllOrder();
	}
	
	public static void removeOrder(String user) {

        //	 add order.
      
        	int i;
        	String d="";
        	String time;
        	
        	loginFunction.viewProductData();
        	
            System.out.println("Enter index of product");
            i=in.nextInt();
            
            System.out.println("Enter time or order");
            time = in.nextLine();
            
        	System.out.println("Enter date for order");
        	d = in.nextLine();
           
           product p = adminFunction.searchproductindex(i);
       //     request r = new request (user , date1 , time , 0,p);
        	customerFunction.removeRequest(user , d,time,p);
        	
        	//???
    	 System.out.println("...............................");
    		customerFunction.checkAllOrder();
	}
	
	public static void allRequestDone(String username)
	{
		int index=customerFunction.search(username);
		for(int i=0;i<customerFunction.customers.get(index).getRequests().size();i++)
		{
			if(customerFunction.customers.get(index).getRequests().get(i).getStatus()==1) {
				
				System.out.println(customerFunction.customers.get(index).getRequests().get(i).toString());
				
			}
		}
		
	}
	
	public static void invoiceOrder(String user) {
	allRequestDone(user);
	System.out.println(	customerFunction.invoiceRequestDone(user, dateOfOrder, timeOfOrder));
	}
	    ///////////////////////////////////////////////////////////
	   ///////////////////////////////////////////////////////////
	  ///////////////////////////////////////////////////////////
	 ///////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////
   ///////////////////////////////////////////////////////////
  ///////////////////////////////////////////////////////////
 ///////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////

	private static void workerMenu() {
		// TODO Auto-generated method stub
		
	}
	
        ///////////////////////////////////////////////////////////
       ///////////////////////////////////////////////////////////
      ///////////////////////////////////////////////////////////
     ///////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////
   ///////////////////////////////////////////////////////////
  ///////////////////////////////////////////////////////////
 ///////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////

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
				
			//	System.out.print("Welcome to the admin page \\n");
				adminMenu();
			}
			else if(res==-1)
			{
				adminFunction.admins.get(index).setLogState(false);
				System.out.println("Invalid admin name or password. Try again");
			}
			else if(res==2)
			{
				customerFunction.customers.get(index).setLogState(true);
				customerFunction c=new customerFunction();
				System.out.print("Welcome to the customer page \n");
				customerMenu(customerFunction.customers.get(index).getUsername());
			}
			else if(res==1)
			{
				customerFunction.customers.get(index).setLogState(false);
				System.out.println("Invalid customer name or password. Try again");
			}
			else if(res==3)
			{
				workerFunction.workers.get(index).setLogState(true);
				customerFunction w=new customerFunction();
				System.out.print("Welcome to the worker page \n");
				workerMenu();
				
			}
			else if(res==-3)
			{
				workerFunction.workers.get(index).setLogState(false);
				System.out.println("Invalid worker name or password. Try again");
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
		
			admin a1=new admin("lanahasan","12345","lana hasan","nablus","050677677");
			admin a2=new admin("ahdGhazal","123123","ahd Ghazal","Ramallah","0501234567");
			admin a3=new admin("samsam","1234","sam sam","Jerusalem","0501020356");
			adminFunction.admins.add(a1);
			adminFunction.admins.add(a2);
			adminFunction.admins.add(a3);
			worker w1=new worker("AhmadM","12345","Ahmad Mohamad","nablus","0502222222");		
			worker w2=new worker("razan12","123123","razan","nablus","0502345678");
			worker w3=new worker("aliA","1234","ali Ahmad","nablus","0509384751");
			workerFunction.workers.add(w1);
			workerFunction.workers.add(w2);
			workerFunction.workers.add(w3);
			customer c1=new customer("leen1","12345","leen","Ramallah","0501111111");		
			customer c2=new customer("ahd","123123","ahd ghazal","Bethlehem","0502348765");
			customer c3=new customer("sami","1234","sami saif","Jerusalem","0503456789");
			customerFunction.customers.add(c1);
			customerFunction.customers.add(c2);
			customerFunction.customers.add(c3);
			///                        name           description    category   price
			product p1  = new product("Berber carpet","wool","carpet",150.0);
			product p2  = new product("Persian rugt","synthetic","carpet",300.0);
			product p3  = new product("Sofa cover","fits 3-seat sofa, cotton","cover",250.0);
			adminFunction.products.add(p1);
			adminFunction.products.add(p2);
			adminFunction.products.add(p3);
			workerFunction.products.add(p1);
			workerFunction.products.add(p2);
			workerFunction.products.add(p3);
			
			request r1 = new request("leen1","6/5/2023","1:30",0,p1);
			request r2 = new request("sami","5/5/2023","12:30",0,p2);
			request r3 = new request("sami","15/5/2023","2:00",0,p1);
			request r4 = new request("sami","7/5/2023","10:00",0,p3);

			customerFunction.requests.add(r1);
			customerFunction.requests.add(r2);
			customerFunction.requests.add(r3);
			customerFunction.requests.add(r4);
			customerFunction.checkAllOrder();
			main_login();
		
	}
	
}

