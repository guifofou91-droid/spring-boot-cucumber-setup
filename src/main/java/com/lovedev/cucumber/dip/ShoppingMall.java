package com.lovedev.cucumber.dip;

import com.lovedev.cucumber.dip.solution.BankCardService;
import com.lovedev.cucumber.dip.solution.DebitCardService;

public class ShoppingMall {
    private DebitCard debitCard;
    private CreditCard creditCard;
    public ShoppingMall(DebitCard debitCard) {
        this.debitCard = debitCard;
    }
    public ShoppingMall(CreditCard creditCard) {
        this.creditCard = creditCard;
    }
    // Solution
    private BankCardService bankCardService;
    public ShoppingMall(BankCardService bankCardService) {
        this.bankCardService = bankCardService;
    }

    public void doPurchageSomething(long amount){
        bankCardService.doTransaction(amount);
    }

    public static void main(String[] args) {
        DebitCard debitCard = new DebitCard();
        //CreditCard creditCard = new CreditCard();
        ShoppingMall shoppingMall = new ShoppingMall(debitCard);
        //shoppingMall = new ShoppingMall(creditCard);
        shoppingMall.doPurchageSomething(5000);

        // Solution
        BankCardService card = new DebitCardService(); // use the concrete class here
        ShoppingMall shoppingMall2 = new ShoppingMall(card);
        shoppingMall.doPurchageSomething(5000);

    }
}
