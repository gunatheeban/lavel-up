package oop.Common.DigitalLibrary;

public class Books extends LibraryItem {
  private String author;

  public Books(int id, String title, String author) {
    super(id, title);
    this.author = author;
  }

  @Override
  public void calculate_late_fee(int days) {
    System.out.println(getId());
    System.out.println(getTitle());
    System.out.println(days * 0.50);
  }
}
