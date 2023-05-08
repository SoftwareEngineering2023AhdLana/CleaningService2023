package cleaningService2023;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class invouceAllOrder {
String customerName;
static public ArrayList<request> requests=new ArrayList<request>();
 String TimeOfInvoice;
 double totalPrice=0;
 
public LocalDateTime getTimeOfInvoice() {
	LocalDateTime now = LocalDateTime.now();

	return now;
}
public void addrequest(request r) {
	customerName = r.getNameCustomer();
	requests.add(r);
}

public void print()
{
		System.out.print("*****  "+ customerName+"  *****\n");
		for(int i =0 ; i < requests.size(); i++) {
			System.out.print(i + " "+requests.get(i).getproduct().getName()+"\n Time of order : "+requests.get(i).getTime()+"and Date of order : "+requests.get(i).getDate()+"\n***************************************************\n");
		totalPrice +=requests.get(i).getproduct().getPrice();
		}
		System.out.print("Total price : "+totalPrice);

		System.out.print("\nTime of invoice : "+getTimeOfInvoice());
		
}

}
