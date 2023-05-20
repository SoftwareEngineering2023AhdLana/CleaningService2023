package com.cleaning_service;

import java.util.List;
import java.util.logging.Logger;

public class ReportGenerator {
    private static final Logger logger = Logger.getLogger(ReportGenerator.class.getName());

    public static int calculateTotalDeliveredItems(List<Invoice> invoices) {
        int totalDeliveredItems = 0;
        for (Invoice invoice : invoices) {
            totalDeliveredItems += invoice.getItemsToClean().size();
        }
        logger.info("Total delivered items: " + totalDeliveredItems);
        return totalDeliveredItems;
    }

    public static double calculateTotalCash(List<Invoice> invoices) {
        double totalCash = 0.0;
        for (Invoice invoice : invoices) {
            totalCash += invoice.getPrice();
        }
        logger.info("Total cash: " + totalCash);
        return totalCash;
    }

    public static double calculateTotalPaid(List<Invoice> invoices) {
        double totalPaid = 0.0;
        for (Invoice invoice : invoices) {
            if (invoice.isPaid()) {
                totalPaid += invoice.getPrice();
            }
        }
        logger.info("Total paid: " + totalPaid);
        return totalPaid;
    }

    public static double calculateTotalDebts(List<Invoice> invoices) {
        double totalDebts = 0.0;
        for (Invoice invoice : invoices) {
            if (!invoice.isPaid()) {
                totalDebts += invoice.getPrice();
            }
        }
        logger.info("Total debts: " + totalDebts);
        return totalDebts;
    }
}
