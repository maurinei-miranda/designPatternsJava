package inferfaces;

public class NotificationFactory {


  public Notification createNotification(String notificationType) {
    NotificationType notType = Enum.valueOf(NotificationType.class, notificationType);
    return notType.getNotificationImpl();
  }
}
