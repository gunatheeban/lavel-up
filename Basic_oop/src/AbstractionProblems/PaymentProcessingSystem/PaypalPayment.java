package AbstractionProblems.PaymentProcessingSystem;

public class PaypalPayment extends Payment {

  private String paypalId;

  public PaypalPayment(String currency, String paypalId) {
    super(currency);
    this.paypalId = paypalId;
  }

  @Override
  public PaymentReceipt pay(double amount) {
    if (super.isValidAmount(amount)) {
      PaymentReceipt paymentReceipt = new PaymentReceipt("Paypal", amount, super.getCurrency());
      System.out.println("paypalId : " + paypalId);
      return paymentReceipt;
    }
    return new PaymentReceipt();
  }
}
