package AbstractionProblems.H1VehicleRentalSystem;

public class Loyalty extends Discount {

  private int yearsWithCompany;

  public Loyalty(double discountPercentage, double subTotal, Customer customer) {
    super(subTotal, discountPercentage);
    this.yearsWithCompany = customer.getYearsWithCompany();
  }

  @Override
  public double discountAmount() {
    return yearsWithCompany >= 2 ? (super.getSubTotal() / 100) * super.getDiscountPercentage() : 0 ;
  }
}
