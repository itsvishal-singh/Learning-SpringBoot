package com.vishal.notification;

public class PopUpNotificationService implements NotificationService{
    @Override
    public void sendNotification() {
        System.out.println("POP-UP notification sent");
    }

}
