package oop.AbstractionProblems.PaymentProcessingSystem;

public abstract class Payment {

  private String currency;

  public Payment(String currency) {
    this.currency = currency;
  }

  public abstract PaymentReceipt pay(double amount);

  public boolean isValidAmount(double amount) {
    return amount > 0;
  }

  public String getCurrency() {
    return currency;
  }
}


