package SOLID.Notification_Reporting_System;

import java.time.LocalDateTime;

public abstract class Notification {

  public abstract void send(String message);

  public abstract void schedule(String message, LocalDateTime time);

}