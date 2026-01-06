package com.lovedev.cucumber.dip.solution;

public class CreditCardService implements BankCardService {
    @Override
    public void doTransaction(long amount) {
        System.out.println("Do transaction with credit card");
    }
}
