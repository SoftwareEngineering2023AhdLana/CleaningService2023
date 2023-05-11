package cleaningService;


import java.util.ArrayList;

public class workerFunction {
	static public ArrayList<worker> workers=new ArrayList<worker>();
	static public ArrayList<product> products=new ArrayList<product>();
	/* Don't use it here !!!  
	 * 
	 * 
	 * 
	 * 
	 * 
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
	*/
	//search worker By Name 
	public static int search(String w) {
		for(int i=0; i < workers.size() ; i++) {
			if(w.equals(workers.get(i).getUsername())) {
				return i;
			}
		}
		
		return -1;
	}
	
	
}


