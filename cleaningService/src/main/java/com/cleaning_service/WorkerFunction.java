package com.cleaning_service;


import java.util.ArrayList;
import java.util.List;

public class WorkerFunction {
	public WorkerFunction(){
		
	}
	protected static List<Worker> workers=new ArrayList<Worker>();
	protected static List<Product> products=new ArrayList<Product>();
	public   void findAvilableWorker() {
		String n="no available worker... ";
     	boolean b = false;
		LocalTime currentTime = LocalTime.now();
        System.out.println("Current time is: " + currentTime);
        LocalTime start,end;
		for(int j = 0; j < 6 ;j++) {
		
		      System.out.println(workers.get(j).getTimeStart());
		      System.out.println(workers.get(j).getTimeEnd());

			   start = LocalTime.of( Integer.parseInt(workers.get(j).getTimeStart().split(":")[0]) ,Integer.parseInt(workers.get(j).getTimeStart().split(":")[1])); 
		        System.out.println("start time is: " + start);
			   end = LocalTime.of(Integer.parseInt(workers.get(j).getTimeEnd().split(":")[0]), Integer.parseInt(workers.get(j).getTimeEnd().split(":")[1])); 
		        System.out.println("end time is: " + end);

		        if (currentTime.isAfter(start) &&   (currentTime.isBefore(end)) ){
		        	System.out.println(workers.get(j).getName());
                 b= true;
               		break;
		        }
		      
		}
		if(!b)System.out.println(n);
	}
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


