package oop.AbstractionProblems.PaymentProcessingSystem;

public class BankTransferPayment extends Payment {

  private String accountNumber;

  public BankTransferPayment(String currency, String accountNumber) {
    super(currency);
    this.accountNumber = accountNumber;
  }

  @Override
  public PaymentReceipt pay(double amount) {
    if (super.isValidAmount(amount)) {
      PaymentReceipt paymentReceipt = new PaymentReceipt("BankTransfer", amount, super.getCurrency());
      System.out.println("accountNumber : " + accountNumber);
      return paymentReceipt;
    }
    return new PaymentReceipt();
  }
}
