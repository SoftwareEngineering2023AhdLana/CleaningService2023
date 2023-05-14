package com.cleaning_service;



import java.util.ArrayList;
import java.util.List;
public class AdminFunction {
	
	static List<Admin> admins=new ArrayList<Admin>();
	static List<Product> products=new ArrayList<Product>();
	
	  AdminFunction() {
		//
	}
	
	public  int search(String w) {
		for(int i=0; i < admins.size() ; i++) {
			if(w.equalsIgnoreCase(admins.get(i).getUsername())) {
				return i;
			}
		}
		
		return -1;
	}

	public static  int searchproduct(String w) {
		for(int i=0; i < products.size() ; i++) {
		
			if(w.equalsIgnoreCase(products.get(i).getName())){
				return i;
			}
		}
			return -1;
	}
		
		
		public static  Product searchproductindex(int w) {
		
		return products.get(w) ;
	}
	public static  Boolean checkIfProductCanAdd(String name) {
		for(int i=0; i < WorkerFunction.products.size() ; i++) {
			
			if(products.get(i).getName().equalsIgnoreCase(name))
			{
				return false;
			}
		}
		
		return true;
		
	}

public   List<Product> findProductsByName(String name) {
	ArrayList<Product> foundProducts = new ArrayList<Product>();
    for (Product product : products) {
        if (product.getName().equalsIgnoreCase(name)) {
            foundProducts.add(product);
        }
    }
    return foundProducts;
}



	public  void addProduct(Product p) {
		products.add(p);
	}
}


