package com.makePayment;

import java.util.*;
public class TicketBooking {

	private String stageEvent;
    private String customer;
    private int noOfSeats;
    private String paymentMethod;
    private double amount;

    public TicketBooking() {
    }

    public TicketBooking(String stageEvent, String customer, int noOfSeats) {
        this.stageEvent = stageEvent;
        this.customer = customer;
        this.noOfSeats = noOfSeats;
    }

    public String getStageEvent() {
        return stageEvent;
    }

    public void setStageEvent(String stageEvent) {
        this.stageEvent = stageEvent;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public int getNoOfSeats() {
        return noOfSeats;
    }

    public void setNoOfSeats(int noOfSeats) {
        this.noOfSeats = noOfSeats;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void makePayment(Double amount) {
        this.paymentMethod = "Cash";
        this.amount = amount;
        System.out.println("\nPayment Details:");
        System.out.println("Payment Method: Cash");
        System.out.println("Amount Paid: " + amount);
    }

    public void makePayment(String walletNumber, Double amount) {
        this.paymentMethod = "Wallet";
        this.amount = amount;
        System.out.println("\nPayment Details:");
        System.out.println("Payment Method: Wallet");
        System.out.println("Wallet Number: " + walletNumber);
        System.out.println("Amount Paid: " + amount);
    }

    public void makePayment(String creditCard, String ccv, String name, Double amount) {
        this.paymentMethod = "Credit Card";
        this.amount = amount;
        System.out.println("\nPayment Details:");
        System.out.println("Payment Method: Credit Card");
        System.out.println("Card Holder: " + name);
        System.out.println("Card Number: " + maskCreditCard(creditCard));
        System.out.println("CCV: " + ccv);
        System.out.println("Amount Paid: " + amount);
    }

    private String maskCreditCard(String creditCard) {
        if (creditCard == null || creditCard.length() < 4) {
            return creditCard;
        }
        return "---" + creditCard.substring(creditCard.length() - 4);
    }

    public void printReceipt() {
        System.out.println("\n Transaction Receipt ");
        System.out.println("Stage Event: " + stageEvent);
        System.out.println("Customer: " + customer);
        System.out.println("Number of Seats: " + noOfSeats);
        System.out.println("Payment Method: " + paymentMethod);
        System.out.println("Amount Paid: " + amount);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Stage Show Ticket Booking System");
        
        System.out.print("Enter Stage Event Name: ");
        String event = scanner.nextLine();
        
        System.out.print("Enter Customer Name: ");
        String customer = scanner.nextLine();
        
        System.out.print("Enter Number of Seats: ");
        int seats = scanner.nextInt();
        scanner.nextLine(); 
        
        TicketBooking booking = new TicketBooking(event, customer, seats);
        
        
        System.out.println("\nSelect Payment Method:");
        System.out.println("1. Cash");
        System.out.println("2. Wallet");
        System.out.println("3. Credit Card");
        System.out.print("Enter choice (1-3): ");
        int choice = scanner.nextInt();
        scanner.nextLine(); 
        
        System.out.print("Enter Amount: $");
        double amount = scanner.nextDouble();
        scanner.nextLine(); 
        
        switch (choice) {
            case 1:
                booking.makePayment(amount);
                break;
            case 2:
                System.out.print("Enter Wallet Number: ");
                String walletNumber = scanner.nextLine();
                booking.makePayment(walletNumber, amount);
                break;
            case 3:
                System.out.print("Enter Credit Card Number: ");
                String cardNumber = scanner.nextLine();
                System.out.print("Enter CCV: ");
                String ccv = scanner.nextLine();
                System.out.print("Enter Card Holder Name: ");
                String name = scanner.nextLine();
                booking.makePayment(cardNumber, ccv, name, amount);
                break;
            default:
                System.out.println("Invalid payment method selected!"); 
        }
        
        // Print receipt
        booking.printReceipt();
        
        scanner.close();
    }
}
