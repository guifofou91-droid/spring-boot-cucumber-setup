package com.lovedev.cucumber.ocp;

public interface NotificationService {

    public void sendOTP(String medium);

    public void sendTransactionalReport(String medium);
}
