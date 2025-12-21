package SOLID.OrderService;

public class Card extends PaymentProcessor {

  @Override
  protected PaymentType getPaymentType() {
    return PaymentType.CARD;
  }

  @Override
  protected String pay(double amount) {
    return "Paid " + amount + " using CARD";
  }
}
