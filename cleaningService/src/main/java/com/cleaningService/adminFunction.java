package com.cleaningService;


import java.awt.List;
import java.util.ArrayList;

public class adminFunction {
	static public ArrayList<admin> admins=new ArrayList<admin>();
	static public ArrayList<product> products=new ArrayList<product>();
	
	private adminFunction() {
		
	}
	
	public static int search(String w) {
		for(int i=0; i < admins.size() ; i++) {
			if(w.equalsIgnoreCase(admins.get(i).getUsername())) {
				return i;
			}
		}
		
		return -1;
	}

	public static int searchproduct(String w) {
		for(int i=0; i < products.size() ; i++) {
		
			if(w.equalsIgnoreCase(products.get(i).getName())){
				return i;
			}
		}
			return -1;
	}
		
		
		public static product searchproductindex(int w) {
		
		return products.get(w) ;
	}
	public static Boolean CheckIfProductCanAdd(String name) {
		for(int i=0; i < workerFunction.products.size() ; i++) {
			
			if(products.get(i).getName().equalsIgnoreCase(name))
			{
				return false;
			}
		}
		
		return true;
		
	}

public static  ArrayList<product> findProductsByName(String name) {
	ArrayList<product> foundProducts = new ArrayList<product>();
    for (product product : products) {
        if (product.getName().equalsIgnoreCase(name)) {
            foundProducts.add(product);
        }
    }
    return foundProducts;
}



	public static void AddProduct(product p) {
		products.add(p);
	}
}


