package org.server;

import org.server.domain.models.Notification;
import org.server.domain.models.NotificationType;
import org.server.domain.models.User;
import org.server.domain.notificationService.NotificationService;

import java.util.Scanner;

public class NotificationSystem {
  public static void main(String[] args) {
    System.out.println("Notification System Server Starting...");

    System.out.println("Press 1 to test notification-system");
    Scanner scan = new Scanner(System.in);
    int temp = scan.nextInt();

    if(temp != 1) {
      System.out.println("Exiting system...");
      return;
    }

    Notification smsNotification = new Notification("2000", "100", "Order Update", "You order is dispatched", NotificationType.SMS, false);
    Notification emailNotification = new Notification("2000", "100", "Order Update", "You order is dispatched", NotificationType.EMAIL, false);
    Notification pushNotification = new Notification("2000", "100", "Order Update", "You order is dispatched", NotificationType.PUSH, false);

    NotificationService notificationService = new NotificationService();

    notificationService.sendNotification(smsNotification);
    notificationService.sendNotification(emailNotification);
    notificationService.sendNotification(pushNotification);
  }
}
