package AbstractionProblems.H1VehicleRentalSystem;

public class BaseAmount {
  private String breakdown;
  private double base;

  public BaseAmount(String breakdown, double base) {
    this.breakdown = breakdown;
    this.base = base;
  }

  public String getBreakdown() {
    return breakdown;
  }

  public double getBase() {
    return base;
  }
}
