package SOLID.UserService;

public class UserService {

  private final UserValidationHelper userValidationHelper;
  private final UserRepo userRepo;
  private final Notification notification;
  private final Audit audit;

  public UserService(UserValidationHelper userValidationHelper, UserRepo userRepo,
      Notification notification, Audit audit) {
    this.userValidationHelper = userValidationHelper;
    this.userRepo = userRepo;
    this.notification = notification;
    this.audit = audit;
  }

  public void registerUser(String email, String password) {
    // 1. Validation
    userValidationHelper.validateUser(email, password);
    // 2. Save user
    userRepo.save();
    // 3. Send email
    notification.send(email);
    // 4. Audit log
    audit.log();
  }

}
