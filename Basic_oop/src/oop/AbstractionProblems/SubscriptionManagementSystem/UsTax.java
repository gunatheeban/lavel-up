package oop.AbstractionProblems.SubscriptionManagementSystem;

public class UsTax implements Tax {

  @Override
  public Country getCountry() {
    return Country.US;
  }

  @Override
  public double taxPercentage() {
    return 10;
  }
}
