package SOLID.oc;

public class CreditCard implements PaymentType {

  @Override
  public double calculate(double amount) {
    return amount + (amount * 0.02);
  }
}
