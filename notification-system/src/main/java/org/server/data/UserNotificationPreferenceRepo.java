package org.server.data;

import org.server.domain.models.NotificationType;
import org.server.domain.models.UserNotificationPreference;

public class UserNotificationPreferenceRepo {

  public UserNotificationPreference getPreferenceById(String id) {
    return new UserNotificationPreference("100", NotificationType.SMS, true);
  }
}
