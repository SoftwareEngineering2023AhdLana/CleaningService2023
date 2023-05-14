package com.cleaning_service;

public class Request {
private String nameCustomer;
private String date;
private String time;
Product p;

private int status;//0 still , 1 Done 
Request(){
	
}

public Request(String date , String t) {
	this.date= date;
	this.time=t;
}

public Request(String date , String t, int s) {
	this.date= date;
	this.status=s;
	this.time=t;
	this.setProduct(WorkerFunction.products.get(0));
	
}
public Request(String username ,String date , String t, int s,Product p1) {
	this.nameCustomer=username;
	this.date= date;
	this.status=s;
	this.time=t;
	p=p1;
}

public Product getproduct() {
	return p;
}

public void setProduct(Product p1) {
	this.p = p1;
}
public String getDate() {
	return date;
}

public void setDate(String date) {
	this.date = date;
}

public String getTime() {
	return time;
}

public void setTime(String time) {
	this.time = time;
}

public int getStatus() {
	return status;
}

public void setStatus(int status) {
	this.status = status;
}

@Override
public String toString()
{
	return "name of customer :"+nameCustomer+"\norder: "+this.p.getName()+",  Price: "+this.p.getPrice()+" NIS ,"+" Date: "+date + " ,  Time: " + time + " , Status: "+(status==1?"Done":"Still")
			;
}

public String getNameCustomer() {
	return nameCustomer;
}

public void setNameCustomer(String nameCustomer) {
	this.nameCustomer = nameCustomer;
}

}


