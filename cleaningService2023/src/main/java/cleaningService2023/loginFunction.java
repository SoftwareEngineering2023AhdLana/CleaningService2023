package cleaningService2023;


import java.util.Scanner;

public class loginFunction {
	static Scanner in=new Scanner(System.in);

    static void viewAllData() {
		// TODO Auto-generated method stub
    	
    	 System.out.println("all worker in system ..........");


 		for(int i=0; i < workerFunction.workers.size() ; i++) {
 			
 	        System.out.println(workerFunction.workers.get(i).toString());

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
    	
	        System.out.println(i+ " "+	adminFunction.products.get(i).toString());

		}
    	 System.out.println("...............................");
  	}
    
	static void viewWorkerData() {
		// TODO Auto-generated method stub
   	 System.out.println("all worker in system ..........");


		for(int i=0; i < workerFunction.workers.size() ; i++) {
			
	        System.out.println(workerFunction.workers.get(i).toString());

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
    		System.out.println("Entes.r new name of product :");
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
    	
}

