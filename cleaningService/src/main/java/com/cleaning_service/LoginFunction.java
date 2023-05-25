package com.cleaning_service;

import java.util.Scanner;

public class LoginFunction {
	static Scanner in=new Scanner(System.in);
    static void viewAllData() {
		// TODO Auto-generated method stub
    	
    	 System.out.println("all worker in system ..........");


 		for(int i=0; i < WorkerFunction.workers.size() ; i++) {
 			
 	        System.out.println(WorkerFunction.workers.get(i).toString());

 		}
     	 System.out.println("...............................");
     	 
     	 System.out.println("all customer in system ..........");

 		for(int i=0; i < CustomerFunction.customers.size() ; i++) {
 			
 	        System.out.println(CustomerFunction.customers.get(i).toString());

 			
 		}
     	 System.out.println("...............................");
     	 
     	 
     	 System.out.println("all product in system ..........");

     	for(int i=0; i < AdminFunction.products.size() ; i++) {
     	
 	        System.out.println(	AdminFunction.products.get(i).toString());

 		}
     	 System.out.println("...............................");
     	 
     	 
     	System.out.println("all Order in system ..........");
        double money = 0.0;
		for(int i=0; i < CustomerFunction.requests.size() ; i++) {
			
	        System.out.println(CustomerFunction.requests.get(i).toString());

	 	money +=CustomerFunction.requests.get(i).p.getPrice();
		}
  	 System.out.println("...............................");
	   	 System.out.println("Full Sales : "+money);
     	 
	}

    static void viewProductData() {
  		// TODO Auto-generated method stub
    //	 ArrayList<product> products=new ArrayList<product>();
      	 System.out.println("all product in system ..........");

    	for(int i=0; i < AdminFunction.products.size() ; i++) {
    	
	        System.out.println(i+ ". "+	AdminFunction.products.get(i).toString());

		}
    	 System.out.println("...............................");
  	}
    
	static void viewWorkerData() {
		// TODO Auto-generated method stub
   	 System.out.println("all worker in system ..........");


		for(int i=0; i < WorkerFunction.workers.size() ; i++) {
			
	        System.out.println(WorkerFunction.workers.get(i).toString());

		}
    	 System.out.println("...............................");
	}

	static void viewCustomerData() {
		// TODO Auto-generated method stub
	   	 System.out.println("all customer in system ..........");

		for(int i=0; i < CustomerFunction.customers.size() ; i++) {
			
	        System.out.println(CustomerFunction.customers.get(i).toString());

			
		}
    	 System.out.println("...............................");
	}
	
	 static void viewRequestData() {
		// TODO Auto-generated method stub
	   	 System.out.println("all Order in system ..........");
          double money = 0.0;
		for(int i=0; i < CustomerFunction.requests.size() ; i++) {
			
	        System.out.println(CustomerFunction.requests.get(i).toString());
             if(CustomerFunction.requests.get(i).getStatus() ==1)
	      	money +=CustomerFunction.requests.get(i).p.getPrice();
		}
    	 System.out.println("...............................");
	   	 System.out.println("Full Sales : "+money);
    	 System.out.println("...............................");
    	 
// should call function to restoll all order  before print order
	}
	
	static void addProduct() {
		boolean b = true;
    	String name;
    	String d,c;
    	double p1;
    	while(b) {
        System.out.println("Enter name of product :");
    	name= in.nextLine();
    	if(AdminFunction.CheckIfProductCanAdd( name)) {
    		System.out.println("Enter description for product :");
    		d = in.nextLine();
    		System.out.println("Enter category for product :");
    		c = in.nextLine();
    		System.out.println("Enter price for product :");
    		p1 = in.nextDouble();
    		Product p = new Product(name,d,c,p1);
    		AdminFunction.products.add(p);
			WorkerFunction.products.add(p);
			System.out.println("add product successfully");
	     	 System.out.println("...............................");

    		b=false;
    	}else {
    		 System.out.println(" the product exite , Enter new product ...");
    	
         	 System.out.println("...............................");
}
    	}
		
	}
	
	static void removeProduct() {
		boolean b = true;
    	String name;
    	while(b) {
        System.out.println("Enter name of product :");
    	name= in.nextLine();
    	// delete it by index
    	
    	if(  AdminFunction.searchproduct( name) !=-1) {
    		int index = AdminFunction.searchproduct(name);
           	AdminFunction.products.remove(index);
	        	System.out.println("remove product successfully");
        	 System.out.println("...............................");


    		b=false;
    	}else {
    		 System.out.println(" the product not exite , Enter name product ...");
         	 System.out.println("...............................");

    	}
    	}
	}
	
	static void editProduct() {
		
		boolean b = true;
    	String name,name1;
    	String d,c;
    	double p1;
    	while(b) {
        System.out.println("Enter name of product :");
    	name= in.nextLine();
    	// delete it by index
    	
    	if(  AdminFunction.searchproduct( name) !=-1) {
    		int index = AdminFunction.searchproduct(name);
           	AdminFunction.products.remove(index);
    		System.out.println("Enter new name of product :");
        	name1= in.nextLine();
    		System.out.println("Enter new description for product :");
    		d = in.nextLine();
    		System.out.println("Enter new category for product :");
    		c = in.nextLine();
    		System.out.println("Enter new price for product :");
    		p1 = in.nextDouble();
    		Product p = new Product(name1,d,c,p1);
    		AdminFunction.products.add(p);
			WorkerFunction.products.add(p);
	        	System.out.println("Edit product successfully");
	     	System.out.println("...............................");

    		b=false;
    	}else {
    		 System.out.println(" the product not exite , Enter name product ...");
         	 System.out.println("...............................");

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
    	System.out.println("Enter index of product");
        i=in.nextInt();
        /////////////////////////////
        hour = in.nextLine();
        ////////////////////////////
        System.out.println("Enter time for order");
        min = in.nextLine();
        time = min;
        System.out.println("Enter date for order");
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
		
        System.out.println("Enter index of request");
        i=in.nextInt();
        InvoiceOrder.requests.remove(i);
        CustomerFunction.requests.remove(i);
		CustomerFunction.checkAllOrder();
		System.out.println("remove order successfully.");
		System.out.println("...............................");


	}

	public static void editOrder(String user) {
		
		boolean b = true;
	//	invoiceOrder.setcustomername(user);
		InvoiceOrder.viewallrequest();
		
		
		int i,i1;
		String date1;
    	String time1;
    	String test;
    	
    	 System.out.println("Enter index of request");
         i =in.nextInt();
         test =in.nextLine();
         

        
         Request r  = InvoiceOrder.searchOrderindex(i);
        
         
         

    	if(InvoiceOrder.searchindexOfOrder(r) != -1) {
    		InvoiceOrder.requests.remove(i);
   	        CustomerFunction.requests.remove(i);

    		  System.out.println("Enter new index of product");
    	        i1=in.nextInt();
    	        test =in.nextLine();
    	         Product p = AdminFunction.searchproductindex(i1);

    	        System.out.println("Enter new time for order");
    	      

    	        time1 = in.nextLine();
    	        
    	    	System.out.println("Enter new date for order");
    	    	date1 = in.nextLine();
    	    	Request r1 = new Request(user ,date1,time1,0,p );
    	    	InvoiceOrder.requests.add(r1);
    	    	CustomerFunction.requests.add(r1);
				System.out.println("edit order successfully.");

			System.out.println("...............................");
    		b=false;
    	}else {
    		 System.out.println(" the order not exite , Enter name order ...");
         	 System.out.println("...............................");

    	}
    	}
	
	public static void notifiCustomer(String n) {
		double d = 1;
        double money = 0.0;
		for(int i=0; i < CustomerFunction.requests.size() ; i++) {
			if(CustomerFunction.requests.get(i).getNameCustomer().equalsIgnoreCase(n)) {
           if(CustomerFunction.requests.get(i).getStatus() ==1) {
        	    System.out.println(CustomerFunction.requests.get(i).toString());

	      	money +=CustomerFunction.requests.get(i).p.getPrice();
	    
           }
		}
			 d = CustomerFunction.addDiscounttoRequest(n,CustomerFunction.requests.get(i).getDate(),CustomerFunction.requests.get(i).getTime());

		}
     money *= d;
	 System.out.println("Full Sales : "+money);
  	 System.out.println("Send email successfully....");
  	 System.out.println("...............................");
  	
  	 // code to send email to customer
	
		
		
	}
	
	public static boolean checkCustomer() {
		boolean b = false;
	for(int i =0; i< CustomerFunction.customers.size();i++) {
		Request.setNameCustomer(CustomerFunction.customers.get(i).getUsername());

		notifiCustomer(CustomerFunction.customers.get(i).getUsername()); 
		b=true;
	}
	 return b;
	}
		
		

	
	
	
	}
	
	

