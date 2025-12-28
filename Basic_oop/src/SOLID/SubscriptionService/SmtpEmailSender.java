package SOLID.SubscriptionService;

public class SmtpEmailSender extends Notification {

  private String type;
  private double amount;

  public SmtpEmailSender(String type, double amount) {
    this.type = type;
    this.amount = amount;
  }

  @Override
  void send() {
    System.out.println(type + "Charged: " + amount);
  }
}
