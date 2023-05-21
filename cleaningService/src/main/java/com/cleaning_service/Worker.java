package com.cleaning_service;



public class Worker {


	private String username;
	private String password;
	private String name;
	private String phoneNumber;
	private String address;
	private Boolean logState=false;
	private String timeStart;
	private String timeEnd;
	public Worker() 
	{
		
	}
	public Worker(String s1,String s2,String s3,String s4,String s5,String TS,String TE)// user name,pass,name,address,phone
	{
		this.username=s1;
		this.password=s2;
		this.name=s3;
		this.address=s4;
		this.phoneNumber=s5;
		this.timeStart=TS;
		this.timeEnd = TE;
		
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public String getUsername() 
	{
		return username;
	}
	public void setUsername(String username)
	{
		this.username = username;
	}
	public String getPassword() 
	{
		return password;
	}
	public void setPassword(String password) 
	{
		this.password = password;
	}
	public Boolean getLogState() {
		return logState;
	}
	public void setLogState(Boolean logStat) {
		this.logState = logStat;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	 @Override
	    public String toString() {
	        return "Worker{" +
	                "username =" + username +
	                ", name ='" + name + '\'' +
	                ", phone Number ='" + phoneNumber + '\'' +
	                ", address ='" + address + '\'' +
	                '}';
	}
	 
		public String getTimeStart() {
		return timeStart;
	}
	public  void setTimeStart(String timeStart) {
		this.timeStart = timeStart;
	}
	public String getTimeEnd() {
		return timeEnd;
	}
	public void setTimeEnd(String timeEnd) {
		this.timeEnd = timeEnd;
	}
	
	
}



