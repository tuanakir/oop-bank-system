package com.tuana.bank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Account{
    private final String id;
    private double balance;
    private final List<Transaction> transactions;

    public Account(String id){
        this.id = id;
        this.balance = 0;
        this.transactions = new ArrayList<>();
    }

    public void deposit(double amount){
        if (amount<=0){
            throw new IllegalArgumentException("Deposit amount must be positive");
        }

        balance +=amount;

        Transaction transaction = new Transaction(TransactionType.DEPOSIT,amount);
        transactions.add(transaction);

    }

    public void withdraw(double amount){
        if (amount<=0){
            throw new IllegalArgumentException("Withdraw amount must be positive");
        }
        if (balance<amount){
            throw new IllegalArgumentException("Insufficient balance");
        }

        balance -=amount;

        Transaction transaction = new Transaction(TransactionType.WITHDRAW,amount);
        transactions.add(transaction);
    }

    public String getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public List<Transaction> getTransactions() {
        return Collections.unmodifiableList(transactions);
    }
}
