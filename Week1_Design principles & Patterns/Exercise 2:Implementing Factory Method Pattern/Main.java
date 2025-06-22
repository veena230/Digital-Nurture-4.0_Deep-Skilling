package com.notification;
public class Main {
	public static void main(String[] args) {
		Notification notification1 = NotificationFactory.createNotification("EMAIL");
        notification1.notifyUser();

        Notification notification2 = NotificationFactory.createNotification("SMS");
        notification2.notifyUser();

        Notification notification3 = NotificationFactory.createNotification("PUSH");
        notification3.notifyUser();
    }
}
