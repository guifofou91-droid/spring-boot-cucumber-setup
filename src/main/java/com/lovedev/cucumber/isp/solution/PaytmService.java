package com.lovedev.cucumber.isp.solution;

public class PaytmService implements UPTPayment, CashBackManagement {
    @Override
    public void payMoney() {

    }

    @Override
    public void getScratchCard() {

    }

    @Override
    public void getCashBackAsCreditBalance() {
        //not applicable
    }
}
