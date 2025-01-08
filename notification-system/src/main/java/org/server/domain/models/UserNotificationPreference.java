package org.server.domain.models;

public class UserNotificationPreference {
  private String userId;
  private NotificationType preference;
  private boolean isOptedIn;

  public UserNotificationPreference(String userId, NotificationType preference, boolean isOptedIn) {
    this.userId = userId;
    this.preference = preference;
    this.isOptedIn = isOptedIn;
  }

  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public NotificationType getPreference() {
    return preference;
  }

  public void setPreference(NotificationType preference) {
    this.preference = preference;
  }

  public boolean isOptedIn() {
    return isOptedIn;
  }

  public void setOptedIn(boolean optedIn) {
    isOptedIn = optedIn;
  }
}
