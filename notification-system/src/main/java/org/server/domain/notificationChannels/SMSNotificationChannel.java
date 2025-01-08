package org.server.domain.notificationChannels;

import org.server.domain.models.Notification;

public class SMSNotificationChannel implements NotificationChannel{

  @Override
  public String getName() {
    return this.getClass().getName();
  }

  @Override
  public void send(Notification notification) {
//    TODO : Twilio API
    System.out.println("Notification is sent through "+this.getName()+" for user :"+notification.getUserId());
  }
}
