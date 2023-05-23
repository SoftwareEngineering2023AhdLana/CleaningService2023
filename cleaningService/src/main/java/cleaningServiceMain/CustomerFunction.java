package cleaningServiceMain;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class CustomerFunction {
	static public ArrayList<Customer> customers=new ArrayList<Customer>();
	static public ArrayList<Request> requests=new ArrayList<Request>();
	  public  void addC1() {
		   Customer c = new Customer();
		    
		    
			c.setUsername("lana");
			c.setPassword("123456");
			c.setName("Julia Williams");
			c.setPhoneNumber("123456");
			c.setAddress("Tel Aviv");
			c.setEmail("julia@company.com");
			
      customers.add(c);
		
	}
	public  String addCustomer(String string) {
		addC1();
		// TODO Auto"-generated method stub
		for(int i = 0;  i<  customers.size(); i++) {
			if(customers.get(i).getUsername().equalsIgnoreCase(string))
			return "Customer already exists";
		}
		return "Customer added successfully";
	}

	public  String addCustomerWithInfo(Customer customer) {

		if(customer.getEmail() ==" "||customer.getPhoneNumber() == " "||customer.getPassword ()== " "||customer.getName() ==" "||customer.getUsername() ==" ")
		return "Please enter valid information.";
		return "Customer added successfully";
	}
	public static int search(String c)
	{
		for(int i=0;i<customers.size();i++)
		{
			if(c.equalsIgnoreCase(customers.get(i).getUsername()))
				return i;
		}
		return -1;
	}
	
	public static void addRequest(String customer , Request r) {
		customers.get(search(customer)).addToCustomerRequestDone(r);
	}
	
	public static void editRequest(String username,String oldDate,String newDate,String oldTime,String newTime , Product old , Product newp ) {
		int index=search(username);
		for(int i=0;i<customers.get(index).getRequests().size();i++)
		{
			if((oldDate.equalsIgnoreCase(customers.get(index).getRequests().get(i).getDate()))&&(oldTime.equals(customers.get(index).getRequests().get(i).getTime())))
			{
				customers.get(index).getRequests().get(i).setDate(newDate);
				customers.get(index).getRequests().get(i).setTime(newTime);
				customers.get(index).getRequests().get(i).setProduct(newp);
				System.out.println("edit order successfully.");

				break;
			}
		}
	}

	public static void removeRequest(String username,String date,String time,Product p)
	{
		int index=search(username);
		List<Request> a;
		a=customers.get(index).getRequests();
		for(int i=0;i<a.size();i++)
		{
			if((date.equalsIgnoreCase(a.get(i).getDate()))&&(time.equals(a.get(i).getTime()))&&(p.equals(a.get(i).getproduct())))
			{
				customers.get(index).removeRequest(i);
				System.out.println("remove order successfully.");
				
				break;
			}
		}
	}
	
	public static void removeinvoice(String username,String date,String time,Product p)
	{
		int index=search(username);
		ArrayList<Request> a = InvoiceOrder.requests;
		//a=invoiceOrder.request(username);
		for(int i=0;i<a.size();i++)
		{
			if((date.equalsIgnoreCase(a.get(i).getDate()))&&(time.equals(a.get(i).getTime()))&&(p.equals(a.get(i).getproduct())))
			{
				InvoiceOrder.requests.remove(i);
				System.out.println("remove order successfully.");
				
				break;
			}
		}
	}
	
	public static void changeRequestToDone(String username,String date,String time)
	{
		for(int i=0;i<requests.size();i++)
		{
			if( date.equalsIgnoreCase(requests.get(i).getDate()) && time.equals(requests.get(i).getTime()) )
			{
				requests.get(i).setStatus(1);
				break;
			}
		}
		int index=search(username);
		for(int i=0;i<customers.get(index).getRequests().size();i++)
		{
			if( date.equalsIgnoreCase(customers.get(index).getRequests().get(i).getDate()) && time.equals(customers.get(index).getRequests().get(i).getTime()) )
			{	
				customers.get(index).getRequests().get(i).setStatus(1);
				customers.get(index).resorRequestStill();
				break;
			}
		}
	
	}
	
	public static double invoiceRequestDone(String username,String date,String time)
	{
		double discount = addDiscounttoRequest( username, date, time);
		int index=search(username);
		for(int i=0;i<customers.get(index).getRequests().size();i++)
		{
			if( date.equalsIgnoreCase(customers.get(index).getRequests().get(i).getDate()) && time.equals(customers.get(index).getRequests().get(i).getTime()) )
			{
				if(customers.get(index).getRequests().get(i).getStatus()==1)
					return  discount * customers.get(index).getRequests().get(i).getproduct().getPrice();
				
			}
		}
		return -1;
	}
	
	public static double addDiscounttoRequest(String username,String date,String time) {
		int index=search(username);
		for(int i=0;i<customers.get(index).getRequests().size();i++)
		{
			if( date.equalsIgnoreCase(customers.get(index).getRequests().get(i).getDate()) && time.equals(customers.get(index).getRequests().get(i).getTime()) )
			{
				if(customers.get(index).getRequests().get(i).getStatus()==1)
					if(customers.get(index).getRequests().get(i).getproduct().getPrice() >= 200.0)
					return 0.20;
			}
			}
		
		return 1;
    }
	
	public static int checkIfRequestPassed(String date,String time)
	{
		int hour=Integer.parseInt(time.split(":")[0]);
		int minute=Integer.parseInt(time.split(":")[1]);
		/////////////////////////////////////////////////////////
		int day=Integer.parseInt(date.split("/")[0]);
		int month=Integer.parseInt(date.split("/")[1]);
		int year=Integer.parseInt(date.split("/")[2]);
		/////////////////////////////////////////////////////////////////
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");  
		LocalDateTime now = LocalDateTime.now();
		int currentDay=Integer.parseInt(dtf.format(now).split(" ")[0].split("/")[0]);
		int currentMonth=Integer.parseInt(dtf.format(now).split(" ")[0].split("/")[1]);
		int currentYear=Integer.parseInt(dtf.format(now).split(" ")[0].split("/")[2]);
		////////////////////////////////////////////////////////////////////////////////////////////////
		int currentHour=Integer.parseInt(dtf.format(now).split(" ")[1].split(":")[0]);
		int currentMinute=Integer.parseInt(dtf.format(now).split(" ")[1].split(":")[1]);
		//////////////////////////////////////////////////////////////////////////////////////////////
		if((currentDay>day)||(currentMonth>month)||(currentYear>year))
			return 1;
		else if((currentDay<day)||(currentMonth<month)||(currentYear<year))
			return -1;
		else if((currentDay==day)&&(currentMonth==month)&&(currentYear==year))
		{
			if((currentHour>=hour)&&(currentMinute>=minute))
				return 1;
			else
				return -1;
		}
		return -1;
				
	}
	
	public static void checkAllOrder() {
		for(int i=0;i<requests.size();i++) {
			requests.get(i).setStatus(checkIfRequestPassed(requests.get(i).getDate(),requests.get(i).getTime()));
		}
		
		Customer.resorRequestStill();
	}
	
	// need to wirte function that check all order if still or done  in worker to notify customer if order done
	
	
	
	public static void viewallrequest( String n) {
		for(int i =0 ; i < requests.size(); i++) {
			if(requests.get(i).getNameCustomer().equalsIgnoreCase(n)) {
			System.out.print(i + ". "+requests.get(i).getproduct().getName()+"\n Time of order : "+requests.get(i).getTime()+" and Date of order : "+requests.get(i).getDate()+"\n***************************************************\n");
		}
	}
	}
	
	
	

}

