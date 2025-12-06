/**
 *
 */

public class Car {

  private String model;
  private String color;
  private int doors;

  public Car(String model, String color, int doors) {
    this.model = model;
    this.color = color;
    this.doors = doors;
  }

  public String getModel() {
    return model;
  }

  public String getColor() {
    return color;
  }

  public int getDoors() {
    return doors;
  }

  public String toString() {
    return "Model " + model + "\n"+
        "Color " + color + "\n"+
        "Doors " + doors;
  }
}
