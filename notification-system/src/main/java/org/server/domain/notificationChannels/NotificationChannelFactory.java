package org.server.domain.notificationChannels;

import org.server.domain.models.NotificationType;

public class NotificationChannelFactory {

  public NotificationChannel getNotificationChannel(NotificationType type) {
    NotificationChannel notificationChannel =
      switch (type) {
        case EMAIL -> new EmailNotificationChannel();
        case SMS -> new SMSNotificationChannel();
        case PUSH -> new PushNotificationChannel();
        default -> throw new IllegalArgumentException("Unsupported Notification Type: " + type);
      };
    return notificationChannel;
  }
}
