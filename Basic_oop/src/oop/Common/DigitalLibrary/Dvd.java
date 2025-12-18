package oop.Common.DigitalLibrary;

public class Dvd extends LibraryItem {
  private double duration;

  public Dvd(int id, String title, double duration) {
    super(id, title);
    this.duration = duration;
  }

  @Override
  public void calculate_late_fee(int days) {
    System.out.println(getId());
    System.out.println(getTitle());
    System.out.println(days * 2);
  }
}
