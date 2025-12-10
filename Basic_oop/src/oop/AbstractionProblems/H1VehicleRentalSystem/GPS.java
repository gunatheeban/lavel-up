package oop.AbstractionProblems.H1VehicleRentalSystem;

public class GPS implements AddOn{

  private final double dailyPrice;
  private String breakdown;

  private GPS(double dailyPrice) {
    this.dailyPrice = dailyPrice;
  }

  @Override
  public String name() {
    return "GPS";
  }

  @Override
  public double priceFor(Vehicle v, int days) {
    breakdown = days +" * "+ dailyPrice;
    return days * dailyPrice;
  }

  @Override
  public String breakdown() {
    return breakdown;
  }
}
