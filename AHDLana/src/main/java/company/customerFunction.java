package company;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class customerFunction {
	static public ArrayList<customer> customers=new ArrayList<customer>();
	static public ArrayList<request> requests=new ArrayList<request>();

	public static int search(String c)
	{
		for(int i=0;i<customers.size();i++)
		{
			if(c.equals(customers.get(i).getUsername()))
				return i;
		}
		return -1;
	}
	
	public static void addRequest(String customer , request r) {
		customers.get(search(customer)).addToCustomerRequestDone(r);
	}
	
	public static void editRequest(String username,String oldDate,String newDate,String oldTime,String newTime , product old , product newp ) {
		int index=search(username);
		for(int i=0;i<customers.get(index).getRequests().size();i++)
		{
			if((oldDate.equals(customers.get(index).getRequests().get(i).getDate()))&&(oldTime.equals(customers.get(index).getRequests().get(i).getTime())))
			{
				customers.get(index).getRequests().get(i).setDate(newDate);
				customers.get(index).getRequests().get(i).setTime(newTime);
				customers.get(index).getRequests().get(i).setProduct(newp);

				break;
			}
		}
	}

	// check If Request Passed 
	
	public static void removeRequest(String username,String date,String time)
	{
		int index=search(username);
		ArrayList<request> a;
		a=customers.get(index).getRequests();
		for(int i=0;i<a.size();i++)
		{
			if((date.equals(a.get(i).getDate()))&&(time.equals(a.get(i).getTime())))
			{
				customers.get(index).removeRequest(i);
				break;
			}
		}
	}
	
	public static void changeRequestToDone(String username,String date,String time)
	{
		for(int i=0;i<requests.size();i++)
		{
			if( date.equals(requests.get(i).getDate()) && time.equals(requests.get(i).getTime()) )
			{
				requests.get(i).setStatus(1);
				break;
			}
		}
		int index=search(username);
		for(int i=0;i<customers.get(index).getRequests().size();i++)
		{
			if( date.equals(customers.get(index).getRequests().get(i).getDate()) && time.equals(customers.get(index).getRequests().get(i).getTime()) )
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
			if( date.equals(customers.get(index).getRequests().get(i).getDate()) && time.equals(customers.get(index).getRequests().get(i).getTime()) )
			{
				if(customers.get(index).getRequests().get(i).getStatus()==1)
					return  discount * customers.get(index).getRequests().get(i).getproduct().getPrice();
				else
					return -1;			}
		}
		return -1;
	}
	public static double addDiscounttoRequest(String username,String date,String time) {
		int index=search(username);
		for(int i=0;i<customers.get(index).getRequests().size();i++)
		{
			if( date.equals(customers.get(index).getRequests().get(i).getDate()) && time.equals(customers.get(index).getRequests().get(i).getTime()) )
			{
				if(customers.get(index).getRequests().get(i).getStatus()==1)
					if(customers.get(index).getRequests().get(i).getproduct().getPrice() >= 400.0)
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
		else if((currentDay==day)||(currentMonth==month)||(currentYear==year))
		{
			if((currentHour>=hour)&&(currentMinute>=minute))
				return 1;
			else
				return -1;
		}
		return -1;
				
	}
	
	
	
}
