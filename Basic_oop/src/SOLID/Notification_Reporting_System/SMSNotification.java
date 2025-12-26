package SOLID.Notification_Reporting_System;

import java.time.LocalDateTime;

public class SMSNotification extends Notification implements DeliveryReport {

  @Override
  public void send(String message) {
    System.out.println("SMS sent: " + message);
  }

  @Override
  public void schedule(String message, LocalDateTime time) {
    throw new UnsupportedOperationException("SMS scheduling not supported");
  }

  @Override
  public void generateDeliveryReport() {
    System.out.println("SMS delivery report generated");
  }
}
