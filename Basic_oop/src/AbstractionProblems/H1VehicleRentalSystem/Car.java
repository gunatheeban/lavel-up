package AbstractionProblems.H1VehicleRentalSystem;

import java.util.UUID;

public class Car extends Vehicle{

  public int seats;
  public boolean isLuxury;

  public Car(UUID id, String brand) {
    super(id, brand);
  }

  @Override
  double baseDailyRate() {
    return 10;
  }

  @Override
  VehicleType getType() {
    return VehicleType.CAR;
  }
}
