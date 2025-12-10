package oop.InheritanceProblems.EmployeeHierarchy;

public class Manager extends Employee {

  private int teamSize;

  public Manager(String name, double salary, int teamSize) {
    super(name, salary);
    this.teamSize = teamSize;
  }

  @Override
  public String getDetails() {
    return super.getDetails() + "teamSize " + this.teamSize;
  }

}
