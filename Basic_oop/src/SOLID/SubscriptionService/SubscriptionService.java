package SOLID.SubscriptionService;

public class SubscriptionService {

  private final PaymentClient paymentClient;
  private final Notification notification;
  private final Repository repository;

  public SubscriptionService(PaymentClient paymentClient, Notification notification,
      Repository repository) {
    this.paymentClient = paymentClient;
    this.notification = notification;
    this.repository = repository;
  }

  public void billUser(User user) {

    double amount = 100;

    // Business rule
    if (user.getPlan().equals("PREMIUM")) {
      amount = amount * 0.8;
    }

    paymentClient.charge(amount);
    repository.save();
    notification.send();
  }
}