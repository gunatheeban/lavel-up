package SOLID.UserService;

public class UserValidationHelper {

  public void validateUser(String email, String password) {
    if (email == null || !email.contains("@")) {
      throw new IllegalArgumentException("Invalid email");
    }

    if (password.length() < 8) {
      throw new IllegalArgumentException("Weak password");
    }
  }

}
