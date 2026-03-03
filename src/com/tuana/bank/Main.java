package com.tuana.bank;

public class Main {

    public static void main(String[] args) {
        System.out.println("Bank system starting...");

        Account acc = new Account("A1");
        acc.deposit(100);
        acc.withdraw(1000);

        System.out.println(acc.getBalance());
        System.out.println(acc.getTransactions());
    }
}