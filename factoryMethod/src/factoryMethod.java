import NotificationImpl.SMSNotification;
import inferfaces.Notification;
import inferfaces.NotificationFactory;

public class factoryMethod {
  public static void main(String[] args) {

    NotificationFactory notificationFactory = new NotificationFactory();

    Notification sms = notificationFactory.createNotification("SMS");
    sms.notifyUser();


  }
}
