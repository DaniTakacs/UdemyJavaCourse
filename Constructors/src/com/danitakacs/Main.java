package com.danitakacs;

public class Main {

    public static void main(String[] args) {
        
        BankAccount daniAccount = new BankAccount();

        daniAccount.setAccountNumber("24");
        daniAccount.setBalance(100);
        daniAccount.setCustomerName("Takács Dániel");
        daniAccount.setEmail("darton.d24@gmail.com");
        daniAccount.setPhoneNumber("06302222222");

        System.out.println(daniAccount.getAccountNumber());
        System.out.println(daniAccount.getBalance());
        System.out.println(daniAccount.getCustomerName());
        System.out.println(daniAccount.getEmail());
        System.out.println(daniAccount.getPhoneNumber());

        daniAccount.deposit(20);
        System.out.println(daniAccount.getBalance());

        daniAccount.withdraw(200);

        daniAccount.withdraw(50);
        System.out.println(daniAccount.getBalance());
    }

}
