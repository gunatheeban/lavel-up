package SOLID.OrderService;

public class Cash extends PaymentProcessor {

  @Override
  protected PaymentType getPaymentType() {
    return PaymentType.CASH;
  }

  @Override
  protected String pay(double amount) {
    return "Paid " + amount + " using CASH";
  }
}
