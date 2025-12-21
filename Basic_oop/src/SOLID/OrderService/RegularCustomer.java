package SOLID.OrderService;

public class RegularCustomer implements DiscountPolicy {

  private double discountPercentage;

  public RegularCustomer(double discountPercentage) {
    this.discountPercentage = discountPercentage;
  }

//  @Override
//  public CustomerType getType() {
//    return CustomerType.REGULAR;
//  }

  @Override
  public double calculateDiscount(double amount) {
    return amount * this.discountPercentage;
  }
}
