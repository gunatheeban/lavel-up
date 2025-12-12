package oop.AbstractionProblems.SubscriptionManagementSystem;

import java.math.BigDecimal;

public class StandardPlan extends Plan {

  private int deviceCount;

  public StandardPlan(BigDecimal monthlyPrice, int maxDevices, double storageLimitGB,
      Tax taxRate, int deviceCount) {
    super(monthlyPrice, maxDevices, storageLimitGB, taxRate);
    this.deviceCount = deviceCount;
  }

  @Override
  protected PlanType getType() {
    return PlanType.STANDARD;
  }

  protected BigDecimal extraCharges() {
    BigDecimal extraCharge = BigDecimal.ZERO;
    if (deviceCount > super.getMaxDevices()) {
      int count  = deviceCount - super.getMaxDevices();
      extraCharge = extraCharge.add(BigDecimal.valueOf(count * 5L));
    }

//    todo extra GB

    return extraCharge;
  }
}
