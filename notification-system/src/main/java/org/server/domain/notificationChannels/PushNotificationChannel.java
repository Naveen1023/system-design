package org.server.domain.notificationChannels;

import org.server.domain.models.Notification;

public class PushNotificationChannel implements NotificationChannel{

  @Override
  public String getName() {
    return this.getClass().getName();
  }

  @Override
  public void send(Notification notification) {
//    TODO : Firebase API
    System.out.println("Notification is sent through "+this.getName()+" for user :"+notification.getUserId());
  }
}
