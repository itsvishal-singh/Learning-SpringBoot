package com.vishal;

import com.vishal.notification.EmailService;
import com.vishal.notification.FakeNotificationService;
import com.vishal.notification.NotificationService;
import com.vishal.notification.SmsService;

public class Main {
    public static void main(String[] args) {
        NotificationService notification = new FakeNotificationService();
        OrderService order = new OrderService(notification);
        order.placeOrder();
    }
}

// A class should ask what it needs, and not build everything itself