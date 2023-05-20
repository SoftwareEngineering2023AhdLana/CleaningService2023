package com.cleaning_service;

import java.util.logging.Logger;

public class DiscountCalculator {
    private static final Logger logger = Logger.getLogger(DiscountCalculator.class.getName());

    public static double calculateDiscount(Customer customer, double amount) {
        // Example logic: Calculate discount based on customer usage
        double discountPercentage = 0.0;
        if (customer.getTotalAmountSpent() > 400 && customer.getNumberOfOrders() > 5) {
            discountPercentage = 10.0;
            logger.info("Applying discount of " + discountPercentage + "% for customer: " + customer.getName());
        } else {
            logger.info("No discount applicable for customer: " + customer.getName());
        }

        double discountAmount = amount * (discountPercentage / 100);
        return amount - discountAmount;
    }
}
