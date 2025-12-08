package AbstractionProblems.H1VehicleRentalSystem;

public class Customer {

  private String id;
  private String name;
  private int yearsWithCompany;

  public Customer(String id, String name, int yearsWithCompany) {
    this.id = id;
    this.name = name;
    this.yearsWithCompany = yearsWithCompany;
  }

  public int getYearsWithCompany() {
    return yearsWithCompany;
  }
}
