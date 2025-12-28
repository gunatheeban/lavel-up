package SOLID.SubscriptionService;

public class MySqlBillingRepository implements Repository {

  @Override
  public void save(Object o) {
    System.out.println(o);
  }
}
