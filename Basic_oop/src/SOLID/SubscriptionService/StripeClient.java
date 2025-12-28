package SOLID.SubscriptionService;

import java.util.UUID;

public class StripeClient extends PaymentClient {

  private UUID tokenId;

  public StripeClient() {
    this.tokenId = new UUID(1, 100);
  }

  @Override
  void charge(double amount) {
    System.out.println( this.tokenId + " - " + amount + "Paid");
  }
}
