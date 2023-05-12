package com.cleaning_service;


import java.util.Scanner;

public class loginFunction {
	static Scanner in=new Scanner(System.in);

    static void viewAllData() {
    	
    	 System.err.println("all worker in system ..........");


 		for(int i=0; i < workerFunction.workers.size() ; i++) {
 			
 	        System.err.println(workerFunction.workers.get(i).toString());

 		}
     	 System.err.println("...............................");
     	 
     	 System.err.println("all customer in system ..........");

 		for(int i=0; i < customerFunction.customers.size() ; i++) {
 			
 	        System.err.println(customerFunction.customers.get(i).toString());

 			
 		}
     	 System.err.println("...............................");
     	 
     	 
     	 System.err.println("all product in system ..........");

     	for(int i=0; i < adminFunction.products.size() ; i++) {
     	
 	        System.err.println(	adminFunction.products.get(i).toString());

 		}
     	 System.err.println("...............................");
     	 
     	 
     	System.err.println("all Order in system ..........");
        double money = 0.0;
		for(int i=0; i < customerFunction.requests.size() ; i++) {
			
	        System.err.println(customerFunction.requests.get(i).toString());

	 	money +=customerFunction.requests.get(i).p.getPrice();
		}
  	 System.err.println("...............................");
	   	 System.err.println("Full Sales : "+money);
     	 
	}

    static void viewProductData() {
      	 System.err.println("all product in system ..........");

    	for(int i=0; i < adminFunction.products.size() ; i++) {
    	
	        System.err.println(i+ ". "+	adminFunction.products.get(i).toString());

		}
    	 System.err.println("...............................");
  	}
    
	static void viewWorkerData() {
   	 System.err.println("all worker in system ..........");


		for(int i=0; i < workerFunction.workers.size() ; i++) {
			
	        System.err.println(workerFunction.workers.get(i).toString());

		}
    	 System.err.println("...............................");
	}

	static void viewCustomerData() {
	   	 System.err.println("all customer in system ..........");

		for(int i=0; i < customerFunction.customers.size() ; i++) {
			
	        System.err.println(customerFunction.customers.get(i).toString());

			
		}
    	 System.err.println("...............................");
	}
	
	 static void viewRequestData() {
	   	 System.err.println("all Order in system ..........");
          double money = 0.0;
		for(int i=0; i < customerFunction.requests.size() ; i++) {
			
	        System.err.println(customerFunction.requests.get(i).toString());
             if(customerFunction.requests.get(i).getStatus() ==1)
	      	money +=customerFunction.requests.get(i).p.getPrice();
		}
    	 System.err.println("...............................");
	   	 System.err.println("Full Sales : "+money);
    	 System.err.println("...............................");
    	 
// should call function to restoll all order  before print order
	}
	
	static void addProduct() {
		boolean b = true;
    	String name;
    	String d,c;
    	double p1;
    	while(b) {
        System.err.println("Enter name of product :");
    	name= in.nextLine();
    	if(adminFunction.CheckIfProductCanAdd( name)) {
    		System.err.println("Enter description for product :");
    		d = in.nextLine();
    		System.err.println("Enter category for product :");
    		c = in.nextLine();
    		System.err.println("Enter price for product :");
    		p1 = in.nextDouble();
    		Product p = new Product(name,d,c,p1);
    		adminFunction.products.add(p);
			workerFunction.products.add(p);
			System.err.println("add product successfully");
	     	 System.err.println("...............................");

    		b=false;
    	}else {
    		 System.err.println(" the product exite , Enter new product ...");
    	
         	 System.err.println("...............................");
}
    	}
		
	}
	
	static void removeProduct() {
		boolean b = true;
    	String name;
    	while(b) {
        System.err.println("Enter name of product :");
    	name= in.nextLine();
    	// delete it by index
    	
    	if(  adminFunction.searchproduct( name) !=-1) {
    		int index = adminFunction.searchproduct(name);
           	adminFunction.products.remove(index);
	        	System.err.println("remove product successfully");
        	 System.err.println("...............................");


    		b=false;
    	}else {
    		 System.err.println(" the product not exite , Enter name product ...");
         	 System.err.println("...............................");

    	}
    	}
	}
	
	static void editProduct() {
		
		boolean b = true;
    	String name,name1;
    	String d,c;
    	double p1;
    	while(b) {
        System.err.println("Enter name of product :");
    	name= in.nextLine();
    	// delete it by index
    	
    	if(  adminFunction.searchproduct( name) !=-1) {
    		int index = adminFunction.searchproduct(name);
           	adminFunction.products.remove(index);
    		System.err.println("Enter new name of product :");
        	name1= in.nextLine();
    		System.err.println("Enter new description for product :");
    		d = in.nextLine();
    		System.err.println("Enter new category for product :");
    		c = in.nextLine();
    		System.err.println("Enter new price for product :");
    		p1 = in.nextDouble();
    		Product p = new Product(name1,d,c,p1);
    		adminFunction.products.add(p);
			workerFunction.products.add(p);
	        	System.err.println("Edit product successfully");
	     	System.err.println("...............................");

    		b=false;
    	}else {
    		 System.err.println(" the product not exite , Enter name product ...");
         	 System.err.println("...............................");

    	}
    	}
		
	}
    	
	//////////////////////////////////////////
   //////////////////////////////////////////
  //////////////////////////////////////////
	
	public static void addOrderCustomer(String user) {
		viewProductData();
		invoiceOrder.setcustomername(user);
		int i;
    	String date;
    	String time;
    	String hour,min;
    	System.err.println("Enter index of product");
        i=in.nextInt();
        /////////////////////////////
        hour = in.nextLine();
        ////////////////////////////
        System.err.println("Enter time for order");
        min = in.nextLine();
        time = min;
        System.err.println("Enter date for order");
    	date = in.nextLine();
        
        Product p = adminFunction.searchproductindex(i);
        Request r = new Request (user , date , time , 0,p);
        customerFunction.addRequest(user , r);
        invoiceOrder.requests.add(r);
       
       
        
        
        customerFunction.checkAllOrder();
	}

	public static void deleteOrder(String user) {
    	int i;
    	
    	invoiceOrder.setcustomername(user);
		invoiceOrder.viewallrequest();
		
        System.err.println("Enter index of request");
        i=in.nextInt();
        invoiceOrder.requests.remove(i);
        customerFunction.requests.remove(i);
		customerFunction.checkAllOrder();
		System.err.println("remove order successfully.");
		System.err.println("...............................");


	}

	public static void editOrder(String user) {
		
		boolean b = true;
	//	invoiceOrder.setcustomername(user);
		invoiceOrder.viewallrequest();
		
		
		int i,i1;
		String date1;
    	String time1;
    	String test;
    	
    	 System.err.println("Enter index of request");
         i =in.nextInt();
         test =in.nextLine();
         

        
         Request r  = invoiceOrder.searchOrderindex(i);
        
         
         

    	if(invoiceOrder.searchindexOfOrder(r) != -1) {
    		invoiceOrder.requests.remove(i);
   	        customerFunction.requests.remove(i);

    		  System.err.println("Enter new index of product");
    	        i1=in.nextInt();
    	        test =in.nextLine();
    	         Product p = adminFunction.searchproductindex(i1);

    	        System.err.println("Enter new time for order");
    	      

    	        time1 = in.nextLine();
    	        
    	    	System.err.println("Enter new date for order");
    	    	date1 = in.nextLine();
    	    	Request r1 = new Request(user ,date1,time1,0,p );
    	    	invoiceOrder.requests.add(r1);
    	    	customerFunction.requests.add(r1);
				System.err.println("edit order successfully.");

			System.err.println("...............................");
    		b=false;
    	}else {
    		 System.err.println(" the order not exite , Enter name order ...");
         	 System.err.println("...............................");

    	}
    	}
	
	
	
	}
	
	


