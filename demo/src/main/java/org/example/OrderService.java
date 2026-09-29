package org.example;

import org.example.notification.EmailService;
import org.example.notification.NotificationService;
import org.example.notification.SmsService;
import org.example.notification.PopupService;

public class OrderService {

    NotificationService notification ;

    //1.Constructor injection
    // public OrderService(NotificationService notification ){
    //     this.notification = notification;
    // }

    public OrderService(){

    }
    
    public void placeOrder(){
        System.out.println("Order Placed");
        notification.sendNotification();
    }

    //2.Setter injection
    public void setNotification(NotificationService notification){
        this.notification= notification;
    }
}
