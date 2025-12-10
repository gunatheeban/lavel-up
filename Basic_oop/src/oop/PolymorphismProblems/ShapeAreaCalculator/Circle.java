package oop.PolymorphismProblems.ShapeAreaCalculator;

public class Circle extends Shape{

  private int r;

  public Circle(int r) {
    this.r = r;
  }

  @Override
  int area() {
    return super.calculateArea(this.r);
  }
}
