package oop.PolymorphismProblems.ShapeAreaCalculator;

abstract class Shape {

  abstract int area();
  
  public int calculateArea(int r) {
    return 22/7 * r;
  }
  
  public int calculateArea(int width, int height) {
    return width * height;
  }
}
