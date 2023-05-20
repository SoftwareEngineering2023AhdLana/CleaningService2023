package com.cleaning_service;


public class Admin {
    private String username;
    private String password;

    public Admin(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // Setters and getters for all attributes

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    // Additional methods as needed

    // Example method to perform admin-specific tasks
    public void performAdminTask() {
        // Perform admin task
        System.out.println("Performing admin task...");
    }

    // Example method to authenticate admin
    public boolean authenticate(String enteredUsername, String enteredPassword) {
        return username.equals(enteredUsername) && password.equals(enteredPassword);
    }
}



