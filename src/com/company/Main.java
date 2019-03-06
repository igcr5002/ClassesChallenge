package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        BankAccount account = new BankAccount();
        account.setAccountNumber(2354);
        account.setBalance(1500);
        account.setCustomerName("Cristian Ignat");
        account.setEmail("cristian@email.com");
        account.setPhoneNumber(55501234);
        account.depositFunds(200);
        account.withdrawFunds(1300);
        account.withdrawFunds(3000);


    }
}
