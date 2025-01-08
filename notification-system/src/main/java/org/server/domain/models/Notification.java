package org.server.domain.models;

public class Notification {
  private String id;
  private String userId;
  private String title;
  private String message;
  private NotificationType notificationType;
  private boolean isRealtime;

  public Notification(String id, String userId, String title, String message, NotificationType notificationType, boolean isRealtime) {
    this.id = id;
    this.userId = userId;
    this.title = title;
    this.message = message;
    this.notificationType = notificationType;
    this.isRealtime = isRealtime;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public NotificationType getNotificationType() {
    return notificationType;
  }

  public void setNotificationType(NotificationType notificationType) {
    this.notificationType = notificationType;
  }

  public boolean isRealtime() {
    return isRealtime;
  }

  public void setRealtime(boolean realtime) {
    isRealtime = realtime;
  }
}
