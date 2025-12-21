package SOLID.oc;

public class Paypal implements PaymentType {

  @Override
  public double calculate(double amount) {
    return amount + 5.0;
  }
}
