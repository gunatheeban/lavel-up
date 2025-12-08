package AbstractionProblems.H1VehicleRentalSystem;

public abstract class Discount {

  private double discountPercentage;
  private double subTotal;

  public Discount(double subTotal, double discountPercentage) {
    this.discountPercentage = discountPercentage;
    this.subTotal = subTotal;
  }

  public abstract double discountAmount();

  public double getDiscountPercentage() {
    return discountPercentage;
  }

  public void setDiscountPercentage(double discountPercentage) {
    this.discountPercentage = discountPercentage;
  }

  public double getSubTotal() {
    return subTotal;
  }

  public void setSubTotal(double subTotal) {
    this.subTotal = subTotal;
  }
}
