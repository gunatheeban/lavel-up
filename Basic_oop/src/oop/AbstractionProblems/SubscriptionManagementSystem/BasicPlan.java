package oop.AbstractionProblems.SubscriptionManagementSystem;

import java.math.BigDecimal;

public class BasicPlan extends Plan {

  private int deviceCount;

  public BasicPlan(BigDecimal monthlyPrice, int maxDevices, double storageLimitGB,
      Tax taxRate, int deviceCount) {
    super(monthlyPrice, maxDevices, storageLimitGB, taxRate);
    this.deviceCount = deviceCount;
  }

  @Override
  protected PlanType getType() {
    return PlanType.BASIC;
  }

  protected boolean isValid() {
    return deviceCount < super.getMaxDevices();
  }
}
