package SOLID.Notification_Reporting_System;

import java.time.LocalDateTime;

public class PushNotification extends Notification implements DeliveryReport {

  @Override
  public void send(String message) {
    System.out.println("Push sent: " + message);
  }

  @Override
  public void schedule(String message, LocalDateTime time) {
    throw new UnsupportedOperationException("Push scheduling not supported");
  }

  @Override
  public void generateDeliveryReport() {
    throw new UnsupportedOperationException("No delivery report for push");
  }
}
