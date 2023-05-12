package com.cleaning_service;


import java.util.Scanner;

public class LoginFunction {
	static Scanner in=new Scanner(System.in);

    static void viewAllData() {
    	
    	 System.err.println("all worker in system ..........");


 		for(int i=0; i < WorkerFunction.workers.size() ; i++) {
 			
 	        System.err.println(WorkerFunction.workers.get(i).toString());

 		}
     	 System.err.println("...............................");
     	 
     	 System.err.println("all customer in system ..........");

 		for(int i=0; i < CustomerFunction.customers.size() ; i++) {
 			
 	        System.err.println(CustomerFunction.customers.get(i).toString());

 			
 		}
     	 System.err.println("...............................");
     	 
     	 
     	 System.err.println("all product in system ..........");

     	for(int i=0; i < AdminFunction.products.size() ; i++) {
     	
 	        System.err.println(	AdminFunction.products.get(i).toString());

 		}
     	 System.err.println("...............................");
     	 
     	 
     	System.err.println("all Order in system ..........");
        double money = 0.0;
		for(int i=0; i < CustomerFunction.requests.size() ; i++) {
			
	        System.err.println(CustomerFunction.requests.get(i).toString());

	 	money +=CustomerFunction.requests.get(i).p.getPrice();
		}
  	 System.err.println("...............................");
	   	 System.err.println("Full Sales : "+money);
     	 
	}

    static void viewProductData() {
      	 System.err.println("all product in system ..........");

    	for(int i=0; i < AdminFunction.products.size() ; i++) {
    	
	        System.err.println(i+ ". "+	AdminFunction.products.get(i).toString());

		}
    	 System.err.println("...............................");
  	}
    
	static void viewWorkerData() {
   	 System.err.println("all worker in system ..........");


		for(int i=0; i < WorkerFunction.workers.size() ; i++) {
			
	        System.err.println(WorkerFunction.workers.get(i).toString());

		}
    	 System.err.println("...............................");
	}

	static void viewCustomerData() {
	   	 System.err.println("all customer in system ..........");

		for(int i=0; i < CustomerFunction.customers.size() ; i++) {
			
	        System.err.println(CustomerFunction.customers.get(i).toString());

			
		}
    	 System.err.println("...............................");
	}
	
	 static void viewRequestData() {
	   	 System.err.println("all Order in system ..........");
          double money = 0.0;
		for(int i=0; i < CustomerFunction.requests.size() ; i++) {
			
	        System.err.println(CustomerFunction.requests.get(i).toString());
             if(CustomerFunction.requests.get(i).getStatus() ==1)
	      	money +=CustomerFunction.requests.get(i).p.getPrice();
		}
    	 System.err.println("...............................");
	   	 System.err.println("Full Sales : "+money);
    	 System.err.println("...............................");
    	 
// should call function to restall all order  before print order
	}
	
	static void addProduct() {
		boolean b = true;
    	String name;
    	String d,c;
    	double p1;
    	while(b) {
        System.err.println("Enter name of product :");
    	name= in.nextLine();
    	if(AdminFunction.CheckIfProductCanAdd( name)) {
    		System.err.println("Enter description for product :");
    		d = in.nextLine();
    		System.err.println("Enter category for product :");
    		c = in.nextLine();
    		System.err.println("Enter price for product :");
    		p1 = in.nextDouble();
    		Product p = new Product(name,d,c,p1);
    		AdminFunction.products.add(p);
			WorkerFunction.products.add(p);
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
    	
    	if(  AdminFunction.searchproduct( name) !=-1) {
    		int index = AdminFunction.searchproduct(name);
           	AdminFunction.products.remove(index);
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
    	
    	if(  AdminFunction.searchproduct( name) !=-1) {
    		int index = AdminFunction.searchproduct(name);
           	AdminFunction.products.remove(index);
    		System.err.println("Enter new name of product :");
        	name1= in.nextLine();
    		System.err.println("Enter new description for product :");
    		d = in.nextLine();
    		System.err.println("Enter new category for product :");
    		c = in.nextLine();
    		System.err.println("Enter new price for product :");
    		p1 = in.nextDouble();
    		Product p = new Product(name1,d,c,p1);
    		AdminFunction.products.add(p);
			WorkerFunction.products.add(p);
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
		InvoiceOrder.setcustomername(user);
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
        
        Product p = AdminFunction.searchproductindex(i);
        Request r = new Request (user , date , time , 0,p);
        CustomerFunction.addRequest(user , r);
        InvoiceOrder.requests.add(r);
       
       
        
        
        CustomerFunction.checkAllOrder();
	}

	public static void deleteOrder(String user) {
    	int i;
    	
    	InvoiceOrder.setcustomername(user);
		InvoiceOrder.viewallrequest();
		
        System.err.println("Enter index of request");
        i=in.nextInt();
        InvoiceOrder.requests.remove(i);
        CustomerFunction.requests.remove(i);
		CustomerFunction.checkAllOrder();
		System.err.println("remove order successfully.");
		System.err.println("...............................");


	}

	public static void editOrder(String user) {
		
		boolean b = true;
		InvoiceOrder.viewallrequest();
		
		
		int i,i1;
		String date1;
    	String time1;
    	String test;
    	
    	 System.err.println("Enter index of request");
         i =in.nextInt();
         test =in.nextLine();
         

        
         Request r  = InvoiceOrder.searchOrderindex(i);
        
         
         

    	if(InvoiceOrder.searchindexOfOrder(r) != -1) {
    		InvoiceOrder.requests.remove(i);
   	        CustomerFunction.requests.remove(i);

    		  System.err.println("Enter new index of product");
    	        i1=in.nextInt();
    	        test =in.nextLine();
    	         Product p = AdminFunction.searchproductindex(i1);

    	        System.err.println("Enter new time for order");
    	      

    	        time1 = in.nextLine();
    	        
    	    	System.err.println("Enter new date for order");
    	    	date1 = in.nextLine();
    	    	Request r1 = new Request(user ,date1,time1,0,p );
    	    	InvoiceOrder.requests.add(r1);
    	    	CustomerFunction.requests.add(r1);
				System.err.println("edit order successfully.");

			System.err.println("...............................");
    		b=false;
    	}else {
    		 System.err.println(" the order not exite , Enter name order ...");
         	 System.err.println("...............................");

    	}
    	}
	
	
	
	}
	
	


