package oop.Common.Notification;

public abstract class Notification {
  private String recipient;
  private String message;

  public Notification(String recipient, String message) {
    this.recipient = recipient;
    this.message = message;
  }

  public abstract void send();

  public String getRecipient() {
    return recipient;
  }

  public String getMessage() {
    return message;
  }
}
