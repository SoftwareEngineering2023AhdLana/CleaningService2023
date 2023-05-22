package com.cleaning_service;



	import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

	public class InvoiceOrder {
		public InvoiceOrder(){
			//default constructor
		}


	 static String customerName;
	 protected static final List<Request> requests=new ArrayList<Request>();
	 String timeofinvoice;
	 static double totalPrice=0;
	 
	public static String getTimeOfInvoice() {
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");  
		LocalDateTime now = LocalDateTime.now();
		return dtf.format(now);
	}
	public static void addrequest(Request r) {
		customerName = r.getNameCustomer();
		requests.add(r);
	}
public static   void setcustomername(String n) {
	customerName=n;
	
}
public  List<Request> request() {
	List<Request> a = new ArrayList<Request>() ;
	for(int i =0 ; i < requests.size(); i++) 
		if(requests.get(i).getNameCustomer().equalsIgnoreCase(customerName)) 
             a.add(requests.get(i))	;
	
	
	return a;
}
	public static void print()
	{
		Logger logger=Logger.getLogger(
				InvoiceOrder.class.getName());
		String statement1 ="************ customer name : "+ customerName +"  *****************\n";
			logger.log(Level.INFO,statement1);
			viewallrequest();
			String statement2 ="Total price : "+totalPrice;
			logger.log(Level.INFO,statement2);
			String statement3 ="Time of invoice : "+getTimeOfInvoice();
			logger.log(Level.INFO,statement3);
			logger.log(Level.INFO,"...............................");

	}

	
	public static  Request searchOrderindex(int w) {
		
		return requests.get(w);
	}
public static  int searchindexOfOrder(Request w) {
		
	for(int i =0 ; i < requests.size(); i++) {
		if(requests.get(i)==w) {
		return i;

		}
}
		return -1;
	}
	public static void viewallrequest() {
		for(int i =0 ; i < requests.size(); i++) {
			if(requests.get(i).getNameCustomer().equalsIgnoreCase(customerName)) {
				Logger logger=Logger.getLogger(
						InvoiceOrder.class.getName());
						String footer =i + ". "+requests.get(i).getproduct().getName()+"\n Time of order : "+requests.get(i).getTime()+" and Date of order : "+requests.get(i).getDate()+"\n***************************************************\n";
					
				logger.log(Level.INFO,footer);
		
			totalPrice +=requests.get(i).getproduct().getPrice();

			}
	}
	}
	
	}

