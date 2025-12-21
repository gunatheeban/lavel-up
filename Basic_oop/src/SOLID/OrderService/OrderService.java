package SOLID.OrderService;

public class OrderService {

  public void placeOrder(DiscountPolicy customer, double amount, PaymentProcessor paymentProcessor) {

    double discount = customer.calculateDiscount(amount);

//    if (customerType.equals("REGULAR")) {
//      discount = amount * 0.05;
//    } else if (customerType.equals("PREMIUM")) {
//      discount = amount * 0.10;
//    }

    double finalAmount = amount - discount;

    String pay = paymentProcessor.pay(finalAmount);
    System.out.println(pay);

//    if (paymentType.equals("CARD")) {
//      System.out.println("Paid " + finalAmount + " using CARD");
//    } else if (paymentType.equals("UPI")) {
//      System.out.println("Paid " + finalAmount + " using UPI");
//    } else if (paymentType.equals("CASH")) {
//      System.out.println("Paid " + finalAmount + " using CASH");
//    }

    System.out.println("Order placed successfully");
  }
}
