package AbstractionProblems.H1VehicleRentalSystem;

public class VehicleSpecific extends Discount {

  private VehicleType vehicleType;

  public VehicleSpecific(double discountPercentage, double subTotal, VehicleType vehicleType) {
    super(subTotal, discountPercentage);
    this.vehicleType = vehicleType;
  }

  @Override
  public double discountAmount() {
    VehicleType vehicleType1 = vehicleType;
    return switch (vehicleType1) {
      case CAR -> super.getSubTotal() / 100 * 5;
      case TRUCK -> super.getSubTotal() / 100 * 2;
      case MOTOR_BIKE -> super.getSubTotal() / 100 * 1;
      default -> 0.0;
    };
  }
}
