package oop.InheritanceProblems.EmployeeHierarchy;

public class Developer extends Employee {

  private String programmingLanguage;

  public Developer(String name, double salary, String programmingLanguage) {
    super(name, salary);
    this.programmingLanguage = programmingLanguage;
  }

  public void writeCode() {
    System.out.println("writeCode using " + this.programmingLanguage);
  }

  @Override
  public String getDetails() {
    return super.getDetails() + "programmingLanguage " + this.programmingLanguage;
  }

}
