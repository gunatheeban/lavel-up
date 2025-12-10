package oop.AbstractionProblems.H1VehicleRentalSystem;

public class LongStay extends Discount {

  private int days;

  public LongStay(double discountPercentage, double subTotal, int days) {
    super(subTotal, discountPercentage);
    this.days = days;
  }

  @Override
  public double discountAmount() {
    return days >=3 ? (super.getSubTotal() / 100) * super.getDiscountPercentage() : 0 ;
  }
}
