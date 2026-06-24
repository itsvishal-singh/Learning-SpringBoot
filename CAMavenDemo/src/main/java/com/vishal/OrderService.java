package com.vishal;

import com.vishal.notification.EmailService;
import com.vishal.notification.NotificationService;

public class OrderService {
    NotificationService notification;
    public OrderService(NotificationService notification){
        this.notification = notification;
    }
    public void placeOrder(){
        System.out.println("Order Placed");
        // Actual Business Logic...
        notification.sendNotification();
    }
}
