package oop.InheritanceProblems.EmployeeHierarchy;

public class Employee {

  private String name;
  private double salary;

  public Employee (String name, double salary){
    this.name = name;
    this.salary = salary;
  }

  public String getDetails() {
    return "Name " + this.name +
        "Salary " + this.salary;
  }
}
