package oop.Common.DigitalLibrary;

public abstract class LibraryItem {

  private int id;
  private String title;

  public LibraryItem(int id, String title) {
    this.id = id;
    this.title = title;
  }

  public abstract void calculate_late_fee(int days);

  public int getId() {
    return id;
  }

  public String getTitle() {
    return title;
  }
}
