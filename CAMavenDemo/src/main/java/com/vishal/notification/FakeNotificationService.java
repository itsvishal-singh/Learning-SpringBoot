package com.vishal.notification;

public class FakeNotificationService implements NotificationService{
    @Override
    public void sendNotification(){
        System.out.println("Dummy Notification Sent");
    }
}
