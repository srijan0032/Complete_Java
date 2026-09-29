package org.example;

import org.example.notification.*;

public class App 
{
    public static void main( String[] args )
    {
        NotificationService notification = new PopupService();
        //OrderService order = new OrderService(notification);
        OrderService order = new OrderService();
        order.setNotification(notification);
        order.placeOrder();
    }
}

//A class should ask what it needs, and not build everything itself.
