package com.lovedev.cucumber.dip.solution;

public class DebitCardService implements BankCardService {
    @Override
    public void doTransaction(long amount) {
        System.out.println("Do transaction with debit card");
    }
}
