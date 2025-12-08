package AbstractionProblems.H1VehicleRentalSystem;

import java.util.UUID;

public class Truck extends Vehicle{

  public int maxLoadKg;

  public Truck(UUID id, String brand) {
    super(id, brand);
  }

  @Override
  double baseDailyRate() {
    return 12;
  }

  @Override
  VehicleType getType() {
    return VehicleType.TRUCK;
  }
}
