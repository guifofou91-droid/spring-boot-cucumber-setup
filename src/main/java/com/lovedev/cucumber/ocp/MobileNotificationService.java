package com.lovedev.cucumber.ocp;

public class MobileNotificationService implements NotificationService{
    @Override
    public void sendOTP(String medium) {
        //write the logic to send opt to mobile
        //twilio API
    }

    @Override
    public void sendTransactionalReport(String medium) {
        //write the logic to implement with mobile
    }
}
