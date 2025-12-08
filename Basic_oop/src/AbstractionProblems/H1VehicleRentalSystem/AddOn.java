package AbstractionProblems.H1VehicleRentalSystem;

public interface AddOn {

  String name();
  double priceFor(Vehicle v, int days);
  String breakdown();
}
