package org.server.domain.notificationChannels;

import org.server.domain.models.Notification;

public interface NotificationChannel {

  public String getName();
  public void send(Notification notification);
}
