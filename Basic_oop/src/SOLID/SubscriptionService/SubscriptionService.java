package SOLID.SubscriptionService;

public class SubscriptionService {

  public void billUser(User user) {

    double amount = 100;

    // Business rule
    if (user.getPlan().equals("PREMIUM")) {
      amount = amount * 0.8;
    }

    // Payment
//    StripeClient stripe = new StripeClient();
//    stripe.charge(user.getCardToken(), amount);

    // Persistence
//    MySqlBillingRepository repo = new MySqlBillingRepository();
//    repo.save(user.getId(), amount);

    // Notification
//    SmtpEmailSender emailSender = new SmtpEmailSender();
//    emailSender.send(user.getEmail(), "Charged: " + amount);
  }
}