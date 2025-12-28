package SOLID.SubscriptionService;

import java.util.UUID;

public class User {
  private UUID id;
  private String name;
  private String email;

  public User(String name, String email) {
    this.id = new UUID(1, 100);
    this.name = name;
    this.email = email;
  }

  public UUID getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public String getEmail() {
    return email;
  }
}
