package com.cleaning_service;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;
import java.util.logging.Logger;

public class EmailNotification {
	private EmailNotification() {
		//default constructor
	}
    private static final Logger logger = Logger.getLogger(EmailNotification.class.getName());

    private static final String EMAIL_HOST = "your-email-host";
    private static final String EMAIL_USERNAME = "your-email-username";
    private static final String EMAIL_PASSWORD = "your-email-password";
    private static final String EMAIL_FROM = "your-email-from-address";

    public static void sendOrderCompletionEmail(Customer customer) {
        // Example logic: Send email notification to the customer
        String subject = "Order Completion Notification";
        String message = "Dear " + customer.getName() + ", your order is now complete.";

        Properties props = new Properties();
        props.put("mail.smtp.host", EMAIL_HOST);
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.port", "587");

        Session session = Session.getInstance(props, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(EMAIL_USERNAME, EMAIL_PASSWORD);
            }
        });

        try {
            MimeMessage mimeMessage = new MimeMessage(session);
            mimeMessage.setFrom(new InternetAddress(EMAIL_FROM));
            mimeMessage.addRecipient(Message.RecipientType.TO, new InternetAddress(customer.getEmail()));
            mimeMessage.setSubject(subject);
            mimeMessage.setText(message);

            Transport.send(mimeMessage);

            logger.info("Sent order completion email to customer: " + customer.getName());
        } catch (MessagingException e) {
            logger.severe("Failed to send order completion email: " + e.getMessage());
        }
    }
}
