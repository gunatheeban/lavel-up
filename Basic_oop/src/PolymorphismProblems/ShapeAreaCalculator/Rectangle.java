package PolymorphismProblems.ShapeAreaCalculator;

public class Rectangle extends Shape{

  private int width;
  private int height;

  public Rectangle(int width, int height) {
    this.width = width;
    this.height = height;
  }

  @Override
  int area() {
    return super.calculateArea(this.width, this.height);
  }
}
