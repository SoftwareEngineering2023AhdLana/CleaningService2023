package cleaningService;


import java.awt.List;
import java.util.ArrayList;

public class product {
private String name;
//private String picture;
private String description;
private String category;
private double price ;

public product() {}
public product(String s1,String s3,String s4,double p)
{
	this.name=s1;
	//this.picture=s2;
	this.description=s3;
	this.category=s4;
	this.price= p;
}
public String getCategory() {
	return category;
}
public void setCategory(String category) {
	this.category = category;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
/*
public String getPicture() {
	return picture;
}
public void setPicture(String picture) {
	this.picture = picture;
}
*/
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
@Override
public String toString()
{
	//  	return name +"  " +category +"  " +picture+"  " +description+"  " +  price;
  return "product {" +
    "name =" + name +
    ", category ='" + category + '\'' +
    ", description ='" + description + '\'' +
    ", price ='" + price + '\'' +
    '}';
}
}

