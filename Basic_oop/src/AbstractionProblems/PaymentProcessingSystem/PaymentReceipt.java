package AbstractionProblems.PaymentProcessingSystem;

import java.util.Date;
import java.util.Random;

public class PaymentReceipt {

  private final String transactionId = "TN:" + new Random().nextLong();
  private String paymentType;
  private double amount;
  private String currency;
  private final Date timestamp = new Date();;

  public PaymentReceipt() {
  }

  public PaymentReceipt(String paymentType, double amount, String currency) {
    this.paymentType = paymentType;
    this.amount = amount;
    this.currency = currency;
  }

  public String toString() {
    return "TransactionId : " + transactionId +
        "\nPaymentType : " + paymentType +
        "\nAmount : " + amount +
        "\nCurrency : " + currency +
        "\nTimestamp : " + timestamp;
  }
}
