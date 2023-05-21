package com.cleaning_service;


import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoginFunction {
	public LoginFunction(){
		
	}
	 
	  
	static Scanner in=new Scanner(System.in);

    static void viewAllData() {
    	Logger logger=Logger.getLogger(
				LoginFunction.class.getName());
    	
    	logger.log(Level.INFO,"all worker in system ..........");


 		for(int i=0; i < WorkerFunction.workers.size() ; i++) {
 			String w =WorkerFunction.workers.get(i).toString();
 	       logger.log(Level.INFO,w);

 		}
     	logger.log(Level.INFO,".................................");
     	 
     	logger.log(Level.INFO,"all customer in system ..........");

 		for(int i=0; i < CustomerFunction.customers.size() ; i++) {
 			String c = CustomerFunction.customers.get(i).toString();
 	       logger.log(Level.INFO,c);

 			
 		}
     	logger.log(Level.INFO,"...............................");
     	 
     	 
     	logger.log(Level.INFO,"all product in system .........");

     	for(int i=0; i < AdminFunction.products.size() ; i++) {
     		String a = AdminFunction.products.get(i).toString();
 	       logger.log(Level.INFO,a);

 		}
     	logger.log(Level.INFO,"............................");
     	 
     	 
     	logger.log(Level.INFO,"all Order in system ..........");
        double money = 0.0;
		for(int i=0; i < CustomerFunction.requests.size() ; i++) {
			String c=CustomerFunction.requests.get(i).toString();
	       logger.log(Level.INFO,c);

	 	money +=CustomerFunction.requests.get(i).p.getPrice();
		}
  	logger.log(Level.INFO,"..............................");
  	String fullsale="Full Sales : "+money;
	   	logger.log(Level.INFO,fullsale);
     	 
	}

    static void viewProductData() {
    	Logger logger=Logger.getLogger(
				LoginFunction.class.getName());
      	logger.log(Level.INFO,"all product in system ..........");

    	for(int i=0; i < AdminFunction.products.size() ; i++) {
    		String a=i+ ". "+	AdminFunction.products.get(i).toString();
	       logger.log(Level.INFO,a);

		}
    	logger.log(Level.INFO,"............................");
  	}
    
	static void viewWorkerData() {
		Logger logger=Logger.getLogger(
				LoginFunction.class.getName());
   	logger.log(Level.INFO,"all worker in system ..........");


		for(int i=0; i < WorkerFunction.workers.size() ; i++) {
			String w =WorkerFunction.workers.get(i).toString();
	       logger.log(Level.INFO,w);

		}
    	logger.log(Level.INFO,"....................................");
	}

	static void viewCustomerData() {
		Logger logger=Logger.getLogger(
				LoginFunction.class.getName());
	   	logger.log(Level.INFO,"all customer in system ..........");

		for(int i=0; i < CustomerFunction.customers.size() ; i++) {
			String c=CustomerFunction.customers.get(i).toString();
	       logger.log(Level.INFO,c);

			
		}
    	logger.log(Level.INFO,".....................................");
	}
	
	 static void viewRequestData() {
		 Logger logger=Logger.getLogger(
					LoginFunction.class.getName());
	   	logger.log(Level.INFO,"all Order in system ..........");
          double money = 0.0;
		for(int i=0; i < CustomerFunction.requests.size() ; i++) {
			String c = CustomerFunction.requests.get(i).toString();
	       logger.log(Level.INFO,c);
             if(CustomerFunction.requests.get(i).getStatus() ==1)
            	 money +=CustomerFunction.requests.get(i).p.getPrice();
		}
    	logger.log(Level.INFO,"..................................");
    	String fullsales="Full Sales : "+money;
	   	logger.log(Level.INFO,fullsales);
    	logger.log(Level.INFO,"..............................");
    	 
// should call function to restall all order  before print order
	}
	
	static void addProduct() {
		Logger logger=Logger.getLogger(
				LoginFunction.class.getName());
		boolean b = true;
    	String name;
    	String d;
    	String c;
    	double p1;
    	while(b) {
       logger.log(Level.INFO,"Enter name of product :");
    	name= in.nextLine();
    	Boolean checkname=AdminFunction.checkIfProductCanAdd(name);
    	if(Boolean.TRUE.equals(checkname)){
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
	     	logger.log(Level.INFO,"...........................");

    		b=false;
    	}else {
    		logger.log(Level.INFO," the product exite , Enter new product ...");
    	
         	logger.log(Level.INFO,".............................");
}
    	}
		
	}
	
	static void removeProduct() {
		Logger logger=Logger.getLogger(
				LoginFunction.class.getName());
		boolean b = true;
    	String name;
    	while(b) {
       logger.log(Level.INFO,"Enter the name of product :");
    	name= in.nextLine();
    	// delete it by index
    	
    	if(  AdminFunction.searchproduct( name) !=-1) {
    		int index = AdminFunction.searchproduct(name);
           	AdminFunction.products.remove(index);
	        	logger.log(Level.INFO,"remove product successfully");
        	logger.log(Level.INFO,".................................");


    		b=false;
    	}else {
    		logger.log(Level.INFO," the product not exite , Enter name product ...");
         	logger.log(Level.INFO,"..................................");

    	}
    	}
	}
	
	static void editProduct() {
		Logger logger=Logger.getLogger(
				LoginFunction.class.getName());
		
		boolean b = true;
    	String name;
    	String name1;
    	String d;
    	String c;
    	double p1;
    	while(b) {
       logger.log(Level.INFO,"Enter name of product  :");
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
	     	logger.log(Level.INFO,"..........................");

    		b=false;
    	}else {
    		logger.log(Level.INFO," the product not exite , Enter name product ...");
         	logger.log(Level.INFO,"............................");

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
		logger.log(Level.INFO,"..................................");


	}

	public static void editOrder(String user) {
		Logger logger=Logger.getLogger(
				LoginFunction.class.getName());
		
		
		InvoiceOrder.viewallrequest();
		
		
		int i;
		int i1;
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

			logger.log(Level.INFO,".............................");
    		
    	}else {
    		logger.log(Level.INFO," the order not exite , Enter name order ...");
         	logger.log(Level.INFO,"..................................");

    	}
    	}
	
	
	public static void notifiCustomer(String n) {
		boolean a = false;
        double money = 0.0;
		for(int i=0; i < CustomerFunction.requests.size() ; i++) {
			if(CustomerFunction.requests.get(i).getNameCustomer().equalsIgnoreCase(n)) {
           if(CustomerFunction.requests.get(i).getStatus() ==1) {
        	    System.out.println(CustomerFunction.requests.get(i).toString());

	      	money +=CustomerFunction.requests.get(i).p.getPrice();
	    
           }
		}
		}
	
	 System.out.println("Full Sales : "+money);
  	 System.out.println("Send email successfully....");
  	 System.out.println("...............................");
  	 
  	 // code to send email to customer
	
		
		
	}
	
	
	public void checkCustomer() {
	for(int i =0; i< CustomerFunction.customers.size();i++) {
		Request r = new Request();
		r.setNameCustomer(CustomerFunction.customers.get(i).getUsername());

		notifiCustomer(CustomerFunction.customers.get(i).getUsername()); 
	}
	
	}
		
	
	}
	
	


