package SOLID.OrderService;

public class PremiumCustomer implements DiscountPolicy {

  private double discountPercentage;

  public PremiumCustomer(double discountPercentage) {
    this.discountPercentage = discountPercentage;
  }

//  @Override
//  public CustomerType getType() {
//    return CustomerType.PREMIUM;
//  }

  @Override
  public double calculateDiscount(double amount) {
    return amount * this.discountPercentage;
  }
}
