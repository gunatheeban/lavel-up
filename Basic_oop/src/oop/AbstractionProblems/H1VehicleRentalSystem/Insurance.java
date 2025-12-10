package oop.AbstractionProblems.H1VehicleRentalSystem;

public class Insurance implements AddOn{

  private boolean isPerDay;
  private double amount;
  private String breakdown;

  @Override
  public String name() {
    return "Insurance";
  }

  @Override
  public double priceFor(Vehicle v, int days) {
    if (isPerDay) {
      breakdown = days + " * " + amount;
      return days * amount;
    }
    double v1 = v.baseDailyRate() / 100;
    breakdown = v1 + " * " +amount;
    return v1 * amount;
  }

  @Override
  public String breakdown() {
    return breakdown;
  }
}
