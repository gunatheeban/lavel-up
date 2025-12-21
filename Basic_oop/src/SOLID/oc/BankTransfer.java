package SOLID.oc;

public class BankTransfer implements PaymentType {

  @Override
  public double calculate(double amount) {
    return amount;
  }
}
