package oop.InheritanceProblems.VehicleHierarchy;

public class ElectricCar extends Car {

  @Override
  public void start() {
    System.out.println("ElectricCar start");
  }

  @Override
  public void playMusic() {
    System.out.println("ElectricCar playMusic");
  }

  public void charge() {
    System.out.println("ElectricCar charge");
  }

}
