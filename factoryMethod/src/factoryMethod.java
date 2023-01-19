import NotificationImpl.SMSNotification;
import inferfaces.Notification;
import inferfaces.NotificationFactory;
import inferfaces.NotificationType;

public class factoryMethod {
  public static void main(String[] args) {

    NotificationFactory notificationFactory = new NotificationFactory();
    Notification sms = notificationFactory.createNotification("SMS");
    Notification email = notificationFactory.createNotification("EMAIL");
    sms.notifyUser();
    email.notifyUser();

  }
}
