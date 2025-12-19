package SOLID;

import java.time.Instant;

public class PaymentService {

//  public double processPayment(String paymentType, double amount) {
//
//    if ("CREDIT_CARD".equals(paymentType)) {
//      return amount + (amount * 0.02); // 2% fee
//
//    } else if ("PAYPAL".equals(paymentType)) {
//      return amount + 5.0; // flat fee
//
//    } else if ("BANK_TRANSFER".equals(paymentType)) {
//      return amount; // no fee
//    }
//
//    throw new IllegalArgumentException("Unsupported payment type");
//  }

  public double processPayment(PaymentType paymentType, double amount) {
    if (paymentType != null) {
      return paymentType.calculate(amount);
    }
    throw new IllegalArgumentException("Unsupported payment type");
  }
}

