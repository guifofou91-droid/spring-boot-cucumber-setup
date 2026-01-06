package com.lovedev.cucumber.ocp;

public class EmailNotificationService implements NotificationService {
    @Override
    public void sendOTP(String medium) {
        //write logic to send OTP to email
    }

    @Override
    public void sendTransactionalReport(String medium) {
        //write logic to implement with email
    }
}
