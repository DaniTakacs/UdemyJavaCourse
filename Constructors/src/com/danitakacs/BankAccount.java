package com.danitakacs;

public class BankAccount {

    private String accountNumber;
    private int balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    public void deposit(int deposit) {
        this.balance += deposit;
    }

    public void withdraw(int withdraw) {
        if (this.balance >= withdraw) {
            this.balance -=withdraw;
        } else System.out.println("You don't have enough deposit");
    }
}
