package AbstractionProblems.H1VehicleRentalSystem;

import java.util.UUID;

public class MotorBike extends Vehicle{

  private long engineCc;

  public MotorBike(UUID id, String brand) {
    super(id, brand);
  }

  @Override
  double baseDailyRate() {
    return 7;
  }

  @Override
  VehicleType getType() {
    return VehicleType.MOTOR_BIKE;
  }
}
