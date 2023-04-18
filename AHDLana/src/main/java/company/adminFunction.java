package company;

import java.util.ArrayList;

public class adminFunction {
	static public ArrayList<admin> admins=new ArrayList<admin>();
	static public ArrayList<product> products=new ArrayList<product>();

	public static int search(String w) {
		for(int i=0; i < admins.size() ; i++) {
			if(w.equals(admins.get(i).getUsername())) {
				return i;
			}
		}
		
		return -1;
	}
	public static Boolean CheckIfProductCanAdd(product p) {
		for(int i=0; i < workerFunction.products.size() ; i++) {
			
			if(products.get(i).getName().equalsIgnoreCase(p.getName()))
			{
				return false;
			}
		}
		
		return true;
		
	}
	
	public static void AddProduct(product p) {
		products.add(p);
	}
}
