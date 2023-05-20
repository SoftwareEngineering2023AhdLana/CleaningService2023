package com.cleaning_service;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class Worker {
    private String id;
    private String name;
    private String phone;
    private String address;

    private static final Logger logger = Logger.getLogger(Worker.class.getName());

    public Worker(String id, String name, String phone, String address) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.address = address;
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

    // Additional methods

    public void sendOrderCompletionNotification(Customer customer) {
        String message = "Dear " + customer.getName() + ", your order is complete.";
        // Logic to send email notification to the customer
        // Implement your email sending logic here
        logger.info("Sending email to " + customer.getEmail() + ": " + message);
    }

    // List to store instances of Worker
    private static List<Worker> workerList = new ArrayList<Worker>();

    public static void addWorker(Worker worker) {
        workerList.add(worker);
    }

    public static List<Worker> getAllWorkers() {
        return workerList;
    }

    // Other methods related to Worker
}
