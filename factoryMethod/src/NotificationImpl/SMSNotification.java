package NotificationImpl;

import inferfaces.Notification;

public class SMSNotification implements Notification {

  @Override
  public void notifyUser() {
    System.out.println("Sending SMS");
  }
}
