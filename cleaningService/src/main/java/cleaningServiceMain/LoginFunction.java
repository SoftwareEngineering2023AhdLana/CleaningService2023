package cleaningServiceMain;


import java.util.Scanner;

public class loginFunction {
	static Scanner in=new Scanner(System.in);
	public static workerFunction  w = new workerFunction();
    static void viewAllData() {
		// TODO Auto-generated method stub
    	
    	 System.out.println("all worker in system ..........");


 		for(int i=0; i < w.workers.size() ; i++) {
 			
 	        System.out.println(w.workers.get(i).toString());

 		}
     	 System.out.println("...............................");
     	 
     	 System.out.println("all customer in system ..........");

 		for(int i=0; i < customerFunction.customers.size() ; i++) {
 			
 	        System.out.println(customerFunction.customers.get(i).toString());

 			
 		}
     	 System.out.println("...............................");
     	 
     	 
     	 System.out.println("all product in system ..........");

     	for(int i=0; i < adminFunction.products.size() ; i++) {
     	
 	        System.out.println(	adminFunction.products.get(i).toString());

 		}
     	 System.out.println("...............................");
     	 
     	 
     	System.out.println("all Order in system ..........");
        double money = 0.0;
		for(int i=0; i < customerFunction.requests.size() ; i++) {
			
	        System.out.println(customerFunction.requests.get(i).toString());

	 	money +=customerFunction.requests.get(i).p.getPrice();
		}
  	 System.out.println("...............................");
	   	 System.out.println("Full Sales : "+money);
     	 
	}

    static void viewProductData() {
  		// TODO Auto-generated method stub
    //	 ArrayList<product> products=new ArrayList<product>();
      	 System.out.println("all product in system ..........");

    	for(int i=0; i < adminFunction.products.size() ; i++) {
    	
	        System.out.println(i+ ". "+	adminFunction.products.get(i).toString());

		}
    	 System.out.println("...............................");
  	}
    
	static void viewWorkerData() {
		// TODO Auto-generated method stub
   	 System.out.println("all worker in system ..........");


		for(int i=0; i < w.workers.size() ; i++) {
			
	        System.out.println(w.workers.get(i).toString());

		}
    	 System.out.println("...............................");
	}

	static void viewCustomerData() {
		// TODO Auto-generated method stub
	   	 System.out.println("all customer in system ..........");

		for(int i=0; i < customerFunction.customers.size() ; i++) {
			
	        System.out.println(customerFunction.customers.get(i).toString());

			
		}
    	 System.out.println("...............................");
	}
	
	 static void viewRequestData() {
		// TODO Auto-generated method stub
	   	 System.out.println("all Order in system ..........");
          double money = 0.0;
		for(int i=0; i < customerFunction.requests.size() ; i++) {
			
	        System.out.println(customerFunction.requests.get(i).toString());
             if(customerFunction.requests.get(i).getStatus() ==1)
	      	money +=customerFunction.requests.get(i).p.getPrice();
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
    	if(adminFunction.CheckIfProductCanAdd( name)) {
    		System.out.println("Enter description for product :");
    		d = in.nextLine();
    		System.out.println("Enter category for product :");
    		c = in.nextLine();
    		System.out.println("Enter price for product :");
    		p1 = in.nextDouble();
    		product p = new product(name,d,c,p1);
    		adminFunction.products.add(p);
			workerFunction.products.add(p);
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
    	
    	if(  adminFunction.searchproduct( name) !=-1) {
    		int index = adminFunction.searchproduct(name);
           	adminFunction.products.remove(index);
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
    	
    	if(  adminFunction.searchproduct( name) !=-1) {
    		int index = adminFunction.searchproduct(name);
           	adminFunction.products.remove(index);
    		System.out.println("Enter new name of product :");
        	name1= in.nextLine();
    		System.out.println("Enter new description for product :");
    		d = in.nextLine();
    		System.out.println("Enter new category for product :");
    		c = in.nextLine();
    		System.out.println("Enter new price for product :");
    		p1 = in.nextDouble();
    		product p = new product(name1,d,c,p1);
    		adminFunction.products.add(p);
			workerFunction.products.add(p);
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
		invoiceOrder.setcustomername(user);
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
        
        product p = adminFunction.searchproductindex(i);
        request r = new request (user , date , time , 0,p);
        customerFunction.addRequest(user , r);
        invoiceOrder.requests.add(r);
       
       
        
        
        customerFunction.checkAllOrder();
	}

	public static void deleteOrder(String user) {
    	int i;
    	
    	invoiceOrder.setcustomername(user);
		invoiceOrder.viewallrequest();
		
        System.out.println("Enter index of request");
        i=in.nextInt();
        invoiceOrder.requests.remove(i);
        customerFunction.requests.remove(i);
		customerFunction.checkAllOrder();
		System.out.println("remove order successfully.");
		System.out.println("...............................");


	}

	public static void editOrder(String user) {
		
		boolean b = true;
	//	invoiceOrder.setcustomername(user);
		invoiceOrder.viewallrequest();
		
		
		int i,i1;
		String date1;
    	String time1;
    	String test;
    	
    	 System.out.println("Enter index of request");
         i =in.nextInt();
         test =in.nextLine();
         

        
         request r  = invoiceOrder.searchOrderindex(i);
        
         
         

    	if(invoiceOrder.searchindexOfOrder(r) != -1) {
    		invoiceOrder.requests.remove(i);
   	        customerFunction.requests.remove(i);

    		  System.out.println("Enter new index of product");
    	        i1=in.nextInt();
    	        test =in.nextLine();
    	         product p = adminFunction.searchproductindex(i1);

    	        System.out.println("Enter new time for order");
    	      

    	        time1 = in.nextLine();
    	        
    	    	System.out.println("Enter new date for order");
    	    	date1 = in.nextLine();
    	    	request r1 = new request(user ,date1,time1,0,p );
    	    	invoiceOrder.requests.add(r1);
    	    	customerFunction.requests.add(r1);
				System.out.println("edit order successfully.");

			System.out.println("...............................");
    		b=false;
    	}else {
    		 System.out.println(" the order not exite , Enter name order ...");
         	 System.out.println("...............................");

    	}
    	}
	
	public static void notifiCustomer(String n) {
		boolean a = false;
        double money = 0.0;
		for(int i=0; i < customerFunction.requests.size() ; i++) {
			if(customerFunction.requests.get(i).getNameCustomer().equalsIgnoreCase(n)) {
           if(customerFunction.requests.get(i).getStatus() ==1) {
        	    System.out.println(customerFunction.requests.get(i).toString());

	      	money +=customerFunction.requests.get(i).p.getPrice();
	    
           }
		}
		}
	
	 System.out.println("Full Sales : "+money);
  	 System.out.println("Send email successfully....");
  	 System.out.println("...............................");
  	 
  	 // code to send email to customer
	
		
		
	}
	
	
	public static void checkCustomer() {
	for(int i =0; i< customerFunction.customers.size();i++) {
		request.setNameCustomer(customerFunction.customers.get(i).getUsername());

		notifiCustomer(customerFunction.customers.get(i).getUsername()); 
	}
	
	}
		
		
	
	
	
	
	}
	
	


