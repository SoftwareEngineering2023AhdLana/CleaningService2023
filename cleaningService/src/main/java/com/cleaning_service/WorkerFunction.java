package com.cleaning_service;


import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class WorkerFunction {
	public WorkerFunction(){
		//default constructor
	}
	Logger logger=Logger.getLogger(
			WorkerFunction.class.getName());
	protected static List<Worker> workers=new ArrayList<Worker>();
	protected static List<Product> products=new ArrayList<Product>();
	public   void findAvilableWorker() {
		String n="no available worker... ";
     	boolean b = false;
		LocalTime currentTime = LocalTime.now();
        System.out.println("Current time is: " + currentTime);
        LocalTime start,end;
		for(int j = 0; j < 6 ;j++) {
				String timest=workers.get(j).getTimeStart();
				String timeen=workers.get(j).getTimeEnd();
			 logger.log(Level.INFO,timest);
			 logger.log(Level.INFO,timeen);
			 	
			   start = LocalTime.of( Integer.parseInt(workers.get(j).getTimeStart().split(":")[0]) ,Integer.parseInt(workers.get(j).getTimeStart().split(":")[1]));
			   String st ="start time is: " + start;
			   logger.log(Level.INFO,st);
			   end = LocalTime.of(Integer.parseInt(workers.get(j).getTimeEnd().split(":")[0]), Integer.parseInt(workers.get(j).getTimeEnd().split(":")[1])); 
			   String en="end time is: " + end;
			   logger.log(Level.INFO,en);

		        if (currentTime.isAfter(start) &&   (currentTime.isBefore(end)) ){
		        	String wname=workers.get(j).getName();
		        	logger.log(Level.INFO,wname);
		        	b= true;
               		break;
		        }
		      
		}
		if(!b)
			 logger.log(Level.INFO,n);
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
	public boolean findAvilableWorkerTest() {
     	boolean b = false;
		LocalTime currentTime = LocalTime.now();
        LocalTime start;
        LocalTime end;
		for(int j = 0; j < 6 ;j++) {
		
		  
			   start = LocalTime.of( Integer.parseInt(workers.get(j).getTimeStart().split(":")[0]) ,Integer.parseInt(workers.get(j).getTimeStart().split(":")[1])); 
			   end = LocalTime.of(Integer.parseInt(workers.get(j).getTimeEnd().split(":")[0]), Integer.parseInt(workers.get(j).getTimeEnd().split(":")[1])); 

		        if (currentTime.isAfter(start) &&   (currentTime.isBefore(end)) ){
		        
                 b= true;
               		break;
		        }
		      
		}
       return b;
}
	
	
}


