package oop.AbstractionProblems.ShapeAreaCalculator;

public class Triangle extends Shape{

  private double base;
  private double height;

  public Triangle(double base, double height) {
    this.base = base;
    this.height = height;
  }

  @Override
  public double area() {
    return (this.height * this.base) / 2;
  }
}
