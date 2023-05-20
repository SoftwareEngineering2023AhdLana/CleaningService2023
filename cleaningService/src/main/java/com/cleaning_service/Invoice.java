package com.cleaning_service;


import java.util.ArrayList;
import java.util.List;
 import java.util.logging.Logger;

    public class Invoice {
        private static final Logger logger = Logger.getLogger(Invoice.class.getName());

        private String invoiceNumber;
        private Customer customer;
        private String deliveryAddress;
        private List<Product> itemsToClean;
        private double price;
        private String paymentStatus;

        public Invoice(String invoiceNumber, Customer customer, String deliveryAddress, List<Product> itemsToClean, double price, String paymentStatus) {
            this.invoiceNumber = invoiceNumber;
            this.customer = customer;
            this.deliveryAddress = deliveryAddress;
            this.itemsToClean = itemsToClean;
            this.price = price;
            this.paymentStatus = paymentStatus;
        }

        // Setters and getters for all attributes

        public String getInvoiceNumber() {
            return invoiceNumber;
        }

        public void setInvoiceNumber(String invoiceNumber) {
            this.invoiceNumber = invoiceNumber;
        }

        public Customer getCustomer() {
            return customer;
        }

        public void setCustomer(Customer customer) {
            this.customer = customer;
        }

        public String getDeliveryAddress() {
            return deliveryAddress;
        }

        public void setDeliveryAddress(String deliveryAddress) {
            this.deliveryAddress = deliveryAddress;
        }

        public List<Product> getItemsToClean() {
            return itemsToClean;
        }

        public void setItemsToClean(List<Product> itemsToClean) {
            this.itemsToClean = itemsToClean;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public String getPaymentStatus() {
            return paymentStatus;
        }

        public void setPaymentStatus(String paymentStatus) {
            this.paymentStatus = paymentStatus;
        }

        
    public String generateInvoice() {
        StringBuilder invoiceBuilder = new StringBuilder();
        invoiceBuilder.append("Invoice:\n");
        invoiceBuilder.append("Customer: ").append(customer.getName()).append("\n");
        invoiceBuilder.append("Delivery Address: ").append(deliveryAddress).append("\n");
        invoiceBuilder.append("Items to Clean:\n");
        for (Product product : itemsToClean) {
            invoiceBuilder.append("- ").append(product.getName()).append("\n");
        }
        invoiceBuilder.append("Price: ").append(price).append("\n");
        return invoiceBuilder.toString();
    }
    public boolean isPaid() {
        // Example logic: Check if the payment status is "paid"
        if (paymentStatus.equalsIgnoreCase("paid")) {
            logger.info("Invoice is paid: " + invoiceNumber);
            return true;
        } else {
            logger.info("Invoice is not paid: " + invoiceNumber);
            return false;
        }
    }
}

