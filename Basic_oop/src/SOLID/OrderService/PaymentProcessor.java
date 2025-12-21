package SOLID.OrderService;

public abstract class PaymentProcessor {

  protected abstract PaymentType getPaymentType();

  protected abstract String pay(double amount);

}
