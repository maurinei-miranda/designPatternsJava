package NotificationImpl;

import inferfaces.Notification;

public class PushNotitfication implements Notification {
  @Override
  public void notifyUser() {
    System.out.println("Sending push notification!");
  }
}
