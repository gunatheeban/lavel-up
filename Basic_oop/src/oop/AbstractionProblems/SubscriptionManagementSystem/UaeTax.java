package oop.AbstractionProblems.SubscriptionManagementSystem;

public class UaeTax implements Tax {

  @Override
  public Country getCountry() {
    return Country.US;
  }

  @Override
  public double taxPercentage() {
    return 5;
  }
}
