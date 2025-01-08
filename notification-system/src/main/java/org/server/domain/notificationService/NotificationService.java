package org.server.domain.notificationService;

import org.server.data.UserNotificationPreferenceRepo;
import org.server.data.UserRepo;
import org.server.domain.models.Notification;
import org.server.domain.models.User;
import org.server.domain.models.UserNotificationPreference;
import org.server.domain.notificationChannels.NotificationChannel;
import org.server.domain.notificationChannels.NotificationChannelFactory;
import org.server.domain.notificationChannels.SMSNotificationChannel;

public class NotificationService {

  private UserRepo userRepo = new UserRepo();
  private UserNotificationPreferenceRepo userNotificationPreferenceRepo = new UserNotificationPreferenceRepo();

  public void sendNotification(Notification notification) {
    User user = userRepo.getUserById(notification.getUserId());
    UserNotificationPreference userPref = userNotificationPreferenceRepo.getPreferenceById(user.getId());

    if(userPref.isOptedIn()) {
      if(notification.isRealtime()){
//          TODO: call the realtime notification processor here....
      }
      else {
        NotificationChannel notificationChannel = new NotificationChannelFactory().getNotificationChannel(notification.getNotificationType());
        notificationChannel.send(notification);
      }
    }
    else {
      System.out.println("User opted out of this notification...");
    }
  }
}
