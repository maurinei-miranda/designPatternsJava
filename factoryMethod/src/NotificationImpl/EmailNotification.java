package NotificationImpl;

import inferfaces.Notification;

public class EmailNotification implements Notification {
  @Override
  public void notifyUser() {
    System.out.println("Sending email notification!");
  }
}
