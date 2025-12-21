package SOLID.OrderService;

public class Upi extends PaymentProcessor {

  @Override
  protected PaymentType getPaymentType() {
    return PaymentType.UPI;
  }

  @Override
  protected String pay(double amount) {
    return "Paid " + amount + " using UPI";
  }
}
