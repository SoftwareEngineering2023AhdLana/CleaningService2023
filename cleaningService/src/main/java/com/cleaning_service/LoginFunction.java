package com.cleaning_service;


import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoginFunction {
	LoginFunction(){
		
	}
	 
	  
	static Scanner in=new Scanner(System.in);

    static void viewAllData() {
    	Logger logger=Logger.getLogger(
				LoginFunction.class.getName());
    	
    	logger.log(Level.INFO,"all worker in system ..........");


 		for(int i=0; i < WorkerFunction.workers.size() ; i++) {
 			
 	       logger.log(Level.INFO,WorkerFunction.workers.get(i).toString());

 		}
     	logger.log(Level.INFO,"...............................");
     	 
     	logger.log(Level.INFO,"all customer in system ..........");

 		for(int i=0; i < CustomerFunction.customers.size() ; i++) {
 			
 	       logger.log(Level.INFO,CustomerFunction.customers.get(i).toString());

 			
 		}
     	logger.log(Level.INFO,"...............................");
     	 
     	 
     	logger.log(Level.INFO,"all product in system ..........");

     	for(int i=0; i < AdminFunction.products.size() ; i++) {
     	
 	       logger.log(Level.INFO,	AdminFunction.products.get(i).toString());

 		}
     	logger.log(Level.INFO,"...............................");
     	 
     	 
     	logger.log(Level.INFO,"all Order in system ..........");
        double money = 0.0;
		for(int i=0; i < CustomerFunction.requests.size() ; i++) {
			
	       logger.log(Level.INFO,CustomerFunction.requests.get(i).toString());

	 	money +=CustomerFunction.requests.get(i).p.getPrice();
		}
  	logger.log(Level.INFO,"...............................");
	   	logger.log(Level.INFO,"Full Sales : "+money);
     	 
	}

    static void viewProductData() {
    	Logger logger=Logger.getLogger(
				LoginFunction.class.getName());
      	logger.log(Level.INFO,"all product in system ..........");

    	for(int i=0; i < AdminFunction.products.size() ; i++) {
    	
	       logger.log(Level.INFO,i+ ". "+	AdminFunction.products.get(i).toString());

		}
    	logger.log(Level.INFO,"...............................");
  	}
    
	static void viewWorkerData() {
		Logger logger=Logger.getLogger(
				LoginFunction.class.getName());
   	logger.log(Level.INFO,"all worker in system ..........");


		for(int i=0; i < WorkerFunction.workers.size() ; i++) {
			
	       logger.log(Level.INFO,WorkerFunction.workers.get(i).toString());

		}
    	logger.log(Level.INFO,"...............................");
	}

	static void viewCustomerData() {
		Logger logger=Logger.getLogger(
				LoginFunction.class.getName());
	   	logger.log(Level.INFO,"all customer in system ..........");

		for(int i=0; i < CustomerFunction.customers.size() ; i++) {
			
	       logger.log(Level.INFO,CustomerFunction.customers.get(i).toString());

			
		}
    	logger.log(Level.INFO,"...............................");
	}
	
	 static void viewRequestData() {
		 Logger logger=Logger.getLogger(
					LoginFunction.class.getName());
	   	logger.log(Level.INFO,"all Order in system ..........");
          double money = 0.0;
		for(int i=0; i < CustomerFunction.requests.size() ; i++) {
			
	       logger.log(Level.INFO,CustomerFunction.requests.get(i).toString());
             if(CustomerFunction.requests.get(i).getStatus() ==1)
	      	money +=CustomerFunction.requests.get(i).p.getPrice();
		}
    	logger.log(Level.INFO,"...............................");
	   	logger.log(Level.INFO,"Full Sales : "+money);
    	logger.log(Level.INFO,"...............................");
    	 
// should call function to restall all order  before print order
	}
	
	static void addProduct() {
		Logger logger=Logger.getLogger(
				LoginFunction.class.getName());
		boolean b = true;
    	String name;
    	String d,c;
    	double p1;
    	while(b) {
       logger.log(Level.INFO,"Enter name of product :");
    	name= in.nextLine();
    	if(AdminFunction.checkIfProductCanAdd( name)) {
    		logger.log(Level.INFO,"Enter description for product :");
    		d = in.nextLine();
    		logger.log(Level.INFO,"Enter category for product :");
    		c = in.nextLine();
    		logger.log(Level.INFO,"Enter price for product :");
    		p1 = in.nextDouble();
    		Product p = new Product(name,d,c,p1);
    		AdminFunction.products.add(p);
			WorkerFunction.products.add(p);
			logger.log(Level.INFO,"add product successfully");
	     	logger.log(Level.INFO,"...............................");

    		b=false;
    	}else {
    		logger.log(Level.INFO," the product exite , Enter new product ...");
    	
         	logger.log(Level.INFO,"...............................");
}
    	}
		
	}
	
	static void removeProduct() {
		Logger logger=Logger.getLogger(
				LoginFunction.class.getName());
		boolean b = true;
    	String name;
    	while(b) {
       logger.log(Level.INFO,"Enter name of product :");
    	name= in.nextLine();
    	// delete it by index
    	
    	if(  AdminFunction.searchproduct( name) !=-1) {
    		int index = AdminFunction.searchproduct(name);
           	AdminFunction.products.remove(index);
	        	logger.log(Level.INFO,"remove product successfully");
        	logger.log(Level.INFO,"...............................");


    		b=false;
    	}else {
    		logger.log(Level.INFO," the product not exite , Enter name product ...");
         	logger.log(Level.INFO,"...............................");

    	}
    	}
	}
	
	static void editProduct() {
		Logger logger=Logger.getLogger(
				LoginFunction.class.getName());
		
		boolean b = true;
    	String name;
    	String name1;
    	String d,c;
    	double p1;
    	while(b) {
       logger.log(Level.INFO,"Enter name of product :");
    	name= in.nextLine();
    	// delete it by index
    	
    	if(  AdminFunction.searchproduct( name) !=-1) {
    		int index = AdminFunction.searchproduct(name);
           	AdminFunction.products.remove(index);
    		logger.log(Level.INFO,"Enter new name of product :");
        	name1= in.nextLine();
    		logger.log(Level.INFO,"Enter new description for product :");
    		d = in.nextLine();
    		logger.log(Level.INFO,"Enter new category for product :");
    		c = in.nextLine();
    		logger.log(Level.INFO,"Enter new price for product :");
    		p1 = in.nextDouble();
    		Product p = new Product(name1,d,c,p1);
    		AdminFunction.products.add(p);
			WorkerFunction.products.add(p);
	        	logger.log(Level.INFO,"Edit product successfully");
	     	logger.log(Level.INFO,"..............................");

    		b=false;
    	}else {
    		logger.log(Level.INFO," the product not exite , Enter name product ...");
         	logger.log(Level.INFO,"................................");

    	}
    	}
		
	}
    	
	//////////////////////////////////////////
   //////////////////////////////////////////
  //////////////////////////////////////////
	
	public static void addOrderCustomer(String user) {
		Logger logger=Logger.getLogger(
			LoginFunction.class.getName());
		viewProductData();
		InvoiceOrder.setcustomername(user);
		int i;
    	String date;
    	String time;
    	String min;
    	logger.log(Level.INFO,"Enter index of product");
        i=in.nextInt();
   
        ////////////////////////////
       logger.log(Level.INFO,"Enter time for order");
        min = in.nextLine();
        time = min;
       logger.log(Level.INFO,"Enter date for order");
    	date = in.nextLine();
        
        Product p = AdminFunction.searchproductindex(i);
        Request r = new Request (user , date , time , 0,p);
        CustomerFunction.addRequest(user , r);
        InvoiceOrder.requests.add(r);
       
       
        
        
        CustomerFunction.checkAllOrder();
	}

	public static void deleteOrder(String user) {
		Logger logger=Logger.getLogger(
				LoginFunction.class.getName());
    	int i;
    	
    	InvoiceOrder.setcustomername(user);
		InvoiceOrder.viewallrequest();
		
       logger.log(Level.INFO,"Enter index of request");
        i=in.nextInt();
        InvoiceOrder.requests.remove(i);
        CustomerFunction.requests.remove(i);
		CustomerFunction.checkAllOrder();
		logger.log(Level.INFO,"remove order successfully.");
		logger.log(Level.INFO,"...............................");


	}

	public static void editOrder(String user) {
		Logger logger=Logger.getLogger(
				LoginFunction.class.getName());
		
		boolean b = true;
		InvoiceOrder.viewallrequest();
		
		
		int i,i1;
		String date1;
    	String time1;
    	String test;
    	
    	logger.log(Level.INFO,"Enter index of request");
         i =in.nextInt();
         test =in.nextLine();
         

        
         Request r  = InvoiceOrder.searchOrderindex(i);
        
         
         

    	if(InvoiceOrder.searchindexOfOrder(r) != -1) {
    		InvoiceOrder.requests.remove(i);
   	        CustomerFunction.requests.remove(i);

    		 logger.log(Level.INFO,"Enter new index of product");
    	        i1=in.nextInt();
    	        test =in.nextLine();
    	         Product p = AdminFunction.searchproductindex(i1);

    	       logger.log(Level.INFO,"Enter new time for order");
    	      

    	        time1 = in.nextLine();
    	        
    	    	logger.log(Level.INFO,"Enter new date for order");
    	    	date1 = in.nextLine();
    	    	Request r1 = new Request(user ,date1,time1,0,p );
    	    	InvoiceOrder.requests.add(r1);
    	    	CustomerFunction.requests.add(r1);
				logger.log(Level.INFO,"edit order successfully.");

			logger.log(Level.INFO,"...............................");
    		b=false;
    	}else {
    		logger.log(Level.INFO," the order not exite , Enter name order ...");
         	logger.log(Level.INFO,"...............................");

    	}
    	}
	
	
	
	}
	
	


