package SOLID.Notification_Reporting_System;

import java.time.LocalDateTime;

public class EmailNotification extends Notification implements DeliveryReport {

  @Override
  public void send(String message) {
    System.out.println("Email sent: " + message);
  }

  @Override
  public void schedule(String message, LocalDateTime time) {
    System.out.println("Email scheduled at " + time);
  }

  @Override
  public void generateDeliveryReport() {
    System.out.println("Email delivery report generated");
  }
}
