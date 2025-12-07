package AbstractionProblems.ShapeAreaCalculator;

public class Circle extends Shape {

  private double radios;

  public Circle(double radios) {
    this.radios = radios;
  }

  @Override
  public double area() {
    return Math.PI * this.radios;
  }
}
