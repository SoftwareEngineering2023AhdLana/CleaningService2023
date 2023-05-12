package com.cleaning_service;


import java.util.ArrayList;
import java.util.List;

public class workerFunction {
	static protected List<Worker> workers=new ArrayList<Worker>();
	static protected List<Product> products=new ArrayList<Product>();

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


