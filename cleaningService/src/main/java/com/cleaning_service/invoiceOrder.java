package com.cleaning_service;



	import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
	public class invoiceOrder {


	static String customerName;
	static public ArrayList<Request> requests=new ArrayList<Request>();
	 String TimeOfInvoice;
	 static double totalPrice=0;
	 
	public static String getTimeOfInvoice() {
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");  
		LocalDateTime now = LocalDateTime.now();
		return dtf.format(now);
	}
	public void addrequest(Request r) {
		customerName = r.getNameCustomer();
		requests.add(r);
	}
public static void setcustomername(String n) {
	customerName=n;
	
}
public static ArrayList<Request> request(String customern) {
	ArrayList<Request> a = new ArrayList<Request>() ;
	for(int i =0 ; i < requests.size(); i++) 
		if(requests.get(i).getNameCustomer().equalsIgnoreCase(customerName)) 
             a.add(requests.get(i))	;
	
	
	return a;
}
	public static void print()
	{
			System.out.print("************ customer name : "+customerName +"  *****************\n");
			viewallrequest();
			System.out.println("Total price : "+totalPrice);

			System.out.println("Time of invoice : "+getTimeOfInvoice());
       	 System.out.println("...............................");

	}

	
	public static Request searchOrderindex(int w) {
		
		return requests.get(w);
	}
public static int searchindexOfOrder(Request w) {
		
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
			System.out.print(i + ". "+requests.get(i).getproduct().getName()+"\n Time of order : "+requests.get(i).getTime()+" and Date of order : "+requests.get(i).getDate()+"\n***************************************************\n");
			totalPrice +=requests.get(i).getproduct().getPrice();

			}
	}
	}
	
	}

