package com.cleaning_service;


import java.util.ArrayList;

public class workerFunction {
	static public ArrayList<Worker> workers=new ArrayList<Worker>();
	static public ArrayList<Product> products=new ArrayList<Product>();

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


