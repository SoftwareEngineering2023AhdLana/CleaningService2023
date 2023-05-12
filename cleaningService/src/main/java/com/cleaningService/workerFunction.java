package com.cleaningService;


import java.util.ArrayList;

public class workerFunction {
	static public ArrayList<worker> workers=new ArrayList<worker>();
	static public ArrayList<product> products=new ArrayList<product>();

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


