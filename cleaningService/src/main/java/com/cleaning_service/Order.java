package com.cleaning_service;

import java.util.List;
import java.util.logging.Logger;

public class Order {
    private static final Logger logger = Logger.getLogger(Order.class.getName());

    private Customer customer;
    private List<Product> itemsToClean;
    private String status;
    private Worker worker;

    public Order(Customer customer, List<Product> itemsToClean, String status, Worker worker) {
        this.customer = customer;
        this.itemsToClean = itemsToClean;
        this.status = status;
        this.worker = worker;
    }

    // Setters and getters for all attributes

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<Product> getItemsToClean() {
        return itemsToClean;
    }

    public void setItemsToClean(List<Product> itemsToClean) {
        this.itemsToClean = itemsToClean;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Worker getWorker() {
        return worker;
    }

    public void setWorker(Worker worker) {
        this.worker = worker;
    }

    // Additional methods as needed
    // ...

    // Example method to update the order status
    public void updateStatus(String newStatus) {
        logger.info("Updating order status to: " + newStatus);
        this.status = newStatus;
    }

    // Example method to assign a worker to the order
    public void assignWorker(Worker worker) {
        logger.info("Assigning worker to order");
        this.worker = worker;
    }

    // ... other methods
}
