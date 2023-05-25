package com.cleaning_service;


import java.time.LocalTime;
import java.util.ArrayList;


public class WorkerFunction {
	
	 public  static ArrayList<Worker> workers=new ArrayList<Worker>();
	static public ArrayList<Product> products=new ArrayList<Product>();
public WorkerFunction (){
	
}

	public static  void findAvilableWorker() {
		String n="no available worker... ";
     	boolean b = false;
		LocalTime currentTime = LocalTime.now();
        LocalTime start,end;
		for(int j = 0; j < 6 ;j++) {
		
		   
			   start = LocalTime.of( Integer.parseInt(workers.get(j).getTimeStart().split(":")[0]) ,Integer.parseInt(workers.get(j).getTimeStart().split(":")[1])); 
		//        System.out.println("start time is: " + start);
			   end = LocalTime.of(Integer.parseInt(workers.get(j).getTimeEnd().split(":")[0]), Integer.parseInt(workers.get(j).getTimeEnd().split(":")[1])); 
	//	        System.out.println("end time is: " + end);

		        if (currentTime.isAfter(start) &&   (currentTime.isBefore(end)) ){
		        	System.out.println(workers.get(j).getName());
                 b= true;
               		break;
		        }
		      
		}
		if(!b)System.out.println(n);
	}

	//search worker By Name 	
	public  int search(String w) {
		for(int i=0; i < workers.size() ; i++) {
			if(w.equals(workers.get(i).getUsername())) {
				return i;
			}
		}
		
		return -1;
	}
	
	
}

