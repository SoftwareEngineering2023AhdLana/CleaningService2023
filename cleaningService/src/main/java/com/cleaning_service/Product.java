package com.cleaning_service;

import java.util.logging.Logger;

public class Product {
    private static final Logger logger = Logger.getLogger(Product.class.getName());

    private String category;
    private String name;
    private String picture;
    private String description;
    private boolean specialTreatmentRequired;
    private double price;

    public Product(String category, String name, String picture, String description, boolean specialTreatmentRequired, double price) {
        this.category = category;
        this.name = name;
        this.picture = picture;
        this.description = description;
        this.specialTreatmentRequired = specialTreatmentRequired;
        this.price = price;
    }

    // Setters and getters for all attributes

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getPicture() {
        return picture;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setSpecialTreatmentRequired(boolean specialTreatmentRequired) {
        this.specialTreatmentRequired = specialTreatmentRequired;
    }

    public boolean isSpecialTreatmentRequired() {
        return specialTreatmentRequired;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    // Additional methods as needed

    // Example method to perform a special treatment on the product
    public void performSpecialTreatment() {
  
        if (specialTreatmentRequired) {
    
            logger.info("Performing special treatment for product: " + name);
          
        } else {
            logger.info("No special treatment required for product: " + name);
        }
    }

    // Example method to check if the product is eligible for a discount
    public boolean isEligibleForDiscount() {
        if (specialTreatmentRequired && price > 400.0) {
            logger.info("Product is eligible for a discount: " + name);
            return true;
        } else {
            logger.info("Product is not eligible for a discount: " + name);
            return false;
        }
    }
}
