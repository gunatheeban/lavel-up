package AbstractionProblems.PaymentProcessingSystem;

public class CreditCardPayment extends Payment {

  private String creditCardNumber;

  public CreditCardPayment(String currency, String creditCardNumber) {
    super(currency);
    this.creditCardNumber = creditCardNumber;
  }

  @Override
  public PaymentReceipt pay(double amount) {
    if (super.isValidAmount(amount)) {
      PaymentReceipt paymentReceipt = new PaymentReceipt("CreditCard", amount, super.getCurrency());
      System.out.println("CreditCardNumber : " + creditCardNumber.substring(0, 4).concat("************"));
      return paymentReceipt;
    }
    return new PaymentReceipt();
  }
}
