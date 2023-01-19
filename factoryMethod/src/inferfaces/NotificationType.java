package inferfaces;

import NotificationImpl.EmailNotification;
import NotificationImpl.PushNotitfication;
import NotificationImpl.SMSNotification;

public enum NotificationType {
  SMS("SMS") {
    public Notification getNotificationImpl() {
      return new SMSNotification();
    }
  },

  EMAIL("EMAIL") {
    public Notification getNotificationImpl() {
      return new EmailNotification();
    }
  },

  PUSH("PUSH") {
    public Notification getNotificationImpl() {
      return new PushNotitfication();
    }
  };

  NotificationType(String name) {
  }

  public abstract Notification getNotificationImpl();
}
