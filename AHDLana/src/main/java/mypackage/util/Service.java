package mypackage.util;

public class Service {

	 int serviceNo;
	 String name;
	 double price ;

	public Service( int sNo,String n, double p) {
		serviceNo = sNo;
		name = n;
		price = p;
	}
	
	public void setserviceNo(int sNo) {
		serviceNo = sNo;
		
	}
	public int getserviceNo() {
		return serviceNo;
	}

	
	public void setPrice(double Price) {
		price = Price;
		
	}
	
	public double getPrice() {
		return price;
	}

	
	public void setName(String Name) {
		name = Name;
		
	}
	
	public String getName() {
		return name;
	}
	@Override
	public String toString()
	{
		return serviceNo +name +"  " +price;
	}

}

