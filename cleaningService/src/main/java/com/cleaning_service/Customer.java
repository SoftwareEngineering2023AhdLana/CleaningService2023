package com.cleaning_service;
import java.util.ArrayList;
import java.util.List;

public class Customer {
	  private String id;
	    private String name;
	    private String phone;
	    private String address;
	    private String email;
	    private String password;
	    private List<Invoice> invoices;

	    public Customer(String id, String name, String phone, String address, String email,String password) {
	        this.id = id;
	        this.name = name;
	        this.phone = phone;
	        this.address = address;
	        this.email = email;
	        this.password = password;
	        this.invoices = new ArrayList<Invoice>();
	    }
    // Setters and getters for all attributes
    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    // Additional methods as needed

    // List to store instances of Customer
    private static List<Customer> customerList = new ArrayList<Customer>();

    public static void addCustomer(Customer customer) {
        customerList.add(customer);
    }

    public static List<Customer> getAllCustomers() {
        return customerList;
    }

    // Other methods related to Customer

    public static Customer findCustomerByName(String name) {
        for (Customer customer : customerList) {
            if (customer.getName().equalsIgnoreCase(name)) {
                return customer;
            }
        }
        return null;
    }
    public double getTotalAmountSpent() {
        double totalAmount = 0.0;
        for (Invoice invoice : invoices) {
            totalAmount += invoice.getPrice();
        }
        return totalAmount;
    }
    public int getNumberOfOrders() {
        return invoices.size();
    }

    
}