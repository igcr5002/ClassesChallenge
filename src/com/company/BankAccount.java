package com.company;

public class BankAccount {

    private int accountNumber;
    private int balance;
    private String customerName;
    private String email;
    private double phoneNumber;

    public void setAccountNumber (int number) {
        this.accountNumber = number;
    }
    public int getAccountNumber () {
        return this.accountNumber;
    }
    public void setBalance (int balance) {
        this.balance = balance;
    }
    public int getBalance () {
        return this.balance;
    }
    public void setCustomerName (String name) {
        this.customerName = name;
    }
    public String getCustomerName () {
        return this.customerName;
    }
    public void setEmail (String email) {
        this.email = email;
    }
    public String getEmail () {
        return this.email;
    }
    public void setPhoneNumber (double phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public double getPhoneNumber () {
        return this.phoneNumber;
    }

    public void depositFunds (int deposit) {
        System.out.println("Amount deposited: " + deposit);
        this.balance += deposit;
        System.out.println("New balance is: " + this.balance);
    }
    public void withdrawFunds (int withdraw) {
        if(this.balance - withdraw < 0) {
            System.out.println("Insufficient funds!");
        } else {
            System.out.println("Amount withdrawn: " + withdraw);
            this.balance -= withdraw;
            System.out.println("New balance is: " + this.balance);
        }
    }


}
