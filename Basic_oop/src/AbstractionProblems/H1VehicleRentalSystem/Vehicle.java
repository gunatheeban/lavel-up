package AbstractionProblems.H1VehicleRentalSystem;

import java.util.UUID;

public abstract class Vehicle {

  private final UUID id;
  private final String brand;

  public Vehicle(UUID id, String brand) {
    this.id = id;
    this.brand = brand;
  }

  public UUID getId() {
    return id;
  }

  public String getBrand() {
    return brand;
  }

  abstract double baseDailyRate();

  abstract VehicleType getType();
}
