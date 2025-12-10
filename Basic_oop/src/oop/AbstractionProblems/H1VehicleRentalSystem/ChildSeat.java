package oop.AbstractionProblems.H1VehicleRentalSystem;

public class ChildSeat implements AddOn {

  private boolean isDaily;
  private double price;
  private String breakdown;

  @Override
  public String name() {
    return "ChildSeat";
  }

  @Override
  public double priceFor(Vehicle v, int days) {
    if (isDaily) {
      breakdown = days + " * "+ price;
      return days * price;
    }
    breakdown = String.valueOf(price);
    return price;
  }

  @Override
  public String breakdown() {
    return breakdown;
  }
}
