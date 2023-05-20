package com.cleaning_service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class.getName());

    private static List<Admin> adminList = new ArrayList<Admin>();
    private static List<Worker> workerList = new ArrayList<Worker>();
    private static List<Customer> customerList = new ArrayList<Customer>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            logger.info("===== Sign Up / Login Menu =====");
            logger.info("1. Sign Up");
            logger.info("2. Login");
            logger.info("0. Exit");
            logger.info("===============================");

            logger.info("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    signUp(scanner);
                    break;
                case 2:
                    login(scanner);
                    break;
                case 0:
                    logger.info("Exiting the application");
                    return;
                default:
                    logger.info("Invalid choice. Please try again.");
            }
        }
    }

    private static void signUp(Scanner scanner) {
        logger.info("==== Sign Up ====");
        logger.info("1. Sign Up as Admin");
        logger.info("2. Sign Up as Worker");
        logger.info("3. Sign Up as Customer");

        logger.info("Enter your choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        switch (choice) {
            case 1:
                signUpAdmin(scanner);
                break;
            case 2:
                signUpWorker(scanner);
                break;
            case 3:
                signUpCustomer(scanner);
                break;
            default:
                logger.info("Invalid choice. Please try again.");
        }
    }

    private static void signUpAdmin(Scanner scanner) {
        logger.info("==== Admin Sign Up ====");
        logger.info("Enter username: ");
        String username = scanner.nextLine();
        logger.info("Enter password: ");
        String password = scanner.nextLine();

        Admin admin = new Admin(username, password);
        adminList.add(admin);

        logger.info("Admin sign up successful!");
    }

    private static void signUpWorker(Scanner scanner) {
        logger.info("==== Worker Sign Up ====");
        logger.info("Enter username: ");
        String username = scanner.nextLine();
        logger.info("Enter password: ");
        String password = scanner.nextLine();
        logger.info("Enter phone: ");
        String phone = scanner.nextLine();
        logger.info("Enter address: ");
        String address = scanner.nextLine();
        Worker worker = new Worker(username, password, phone, address);
        workerList.add(worker);

        logger.info("Worker sign up successful!");
    }

    private static void signUpCustomer(Scanner scanner) {
        logger.info("==== Customer Sign Up ====");
        logger.info("Enter username: ");
        String username = scanner.nextLine();
        logger.info("Enter password: ");
        String password = scanner.nextLine();
        logger.info("Enter name: ");
        String name = scanner.nextLine();
        logger.info("Enter address: ");
        String address = scanner.nextLine();
        logger.info("Enter email: ");
        String email = scanner.nextLine();
        logger.info("Enter phone: ");
        String phone = scanner.nextLine();
        Customer customer = new Customer(username, name, phone, address,email, password);
        customerList.add(customer);

        logger.info("Customer sign up successful!");
    }

    private static void login(Scanner scanner) {
        logger.info("==== Login ====");
        logger.info("Please enter your username: ");
        String username = scanner.nextLine();

        logger.info("Please enter your password: ");
        String password = scanner.nextLine();

        boolean isLoggedIn = authenticate(username, password);
        if (isLoggedIn) {
            String userType = determineUserType(username);
            logger.info("Login successful for user: " + username);

            displayMenu(userType, scanner);
        } else {
            logger.warning("Login failed for user: " + username);
            logger.info("Invalid username or password. Please try again.");
        }
    }

    private static boolean authenticate(String username, String password) {
        // Add your authentication logic here
        // This is a basic example that checks if the username and password match a predefined value
        String validUsername = "admin";
        String validPassword = "password";

        return username.equals(validUsername) && password.equals(validPassword);
    }

    private static String determineUserType(String username) {
        if (adminList.stream().anyMatch(admin -> admin.getUsername().equals(username))) {
            return "admin";
        } else if (workerList.stream().anyMatch(worker -> worker.getId().equals(username))) {
            return "worker";
        } else if (customerList.stream().anyMatch(customer -> customer.getId().equals(username))) {
            return "customer";
        } else {
            return ""; // Return an empty string for unknown user types
        }
    }

    private static void displayMenu(String userType, Scanner scanner) {
        switch (userType) {
            case "admin":
                displayAdminMenu(scanner);
                break;
            case "customer":
                displayCustomerMenu(scanner);
                break;
            case "worker":
                displayWorkerMenu(scanner);
                break;
            default:
                logger.warning("Unknown user type. Cannot display menu.");
        }
    }

    private static void displayAdminMenu(Scanner scanner) {
        while (true) {
            logger.info("===== Admin Menu =====");
            logger.info("1. Manage Customers");
            logger.info("2. Manage Workers");
            logger.info("3. Generate Reports");
            logger.info("0. Logout");
            logger.info("======================");

            logger.info("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    // Handle manage customers logic
                    break;
                case 2:
                    // Handle manage workers logic
                    break;
                case 3:
                    // Handle generate reports logic
                    break;
                case 0:
                    logger.info("Admin logged out");
                    return;
                default:
                    logger.info("Invalid choice. Please try again.");
            }
        }
    }

    private static void displayCustomerMenu(Scanner scanner) {
        while (true) {
            logger.info("===== Customer Menu =====");
            logger.info("1. Place an Order");
            logger.info("2. View Orders");
            logger.info("0. Logout");
            logger.info("========================");

            logger.info("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    // Handle place an order logic
                    break;
                case 2:
                    // Handle view orders logic
                    break;
                case 0:
                    logger.info("Customer logged out");
                    return;
                default:
                    logger.info("Invalid choice. Please try again.");
            }
        }
    }

    private static void displayWorkerMenu(Scanner scanner) {
        while (true) {
            logger.info("===== Worker Menu =====");
            logger.info("1. View Assigned Orders");
            logger.info("2. Complete an Order");
            logger.info("0. Logout");
            logger.info("=======================");

            logger.info("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    // Handle view assigned orders logic
                    break;
                case 2:
                    // Handle complete an order logic
                    break;
                case 0:
                    logger.info("Worker logged out");
                    return;
                default:
                    logger.info("Invalid choice. Please try again.");
            }
        }
    }
}
