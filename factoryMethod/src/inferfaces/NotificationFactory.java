package inferfaces;

import NotificationImpl.EmailNotification;
import NotificationImpl.PushNotitfication;
import NotificationImpl.SMSNotification;

public class NotificationFactory {


  public Notification createNotification(String notifyType) {

    switch (notifyType){
      case "SMS": return new SMSNotification();
      case "Push": return new PushNotitfication();
      case "Email": return new EmailNotification();
    }

    return null;
  }
}
