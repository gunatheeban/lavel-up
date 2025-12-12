package oop.AbstractionProblems.SubscriptionManagementSystem;

import java.math.BigDecimal;

public class FinalBillDto {

  private PlanType planType;
  private int deviceCount;
  private double storage;
  private BigDecimal total;
  private BillStatus billStatus;
  private String reason;

  public FinalBillDto success(PlanType planType, int deviceCount, double storage, BigDecimal total) {
    this.planType = planType;
    this.deviceCount = deviceCount;
    this.storage = storage;
    this.total = total;
    this.billStatus = BillStatus.SUCCESS;
    return this;
  }

  public FinalBillDto failed(PlanType planType, int deviceCount, String reason) {
    this.planType = planType;
    this.deviceCount = deviceCount;
    this.billStatus = BillStatus.FAILED;
    this.reason = reason;
    return this;
  }

  @Override
  public String toString() {
    return "FinalBillDto{" +
        "planType=" + planType +
        ", deviceCount=" + deviceCount +
        ", storage=" + storage +
        ", total=" + total +
        ", billStatus=" + billStatus +
        ", reason='" + reason + '\'' +
        '}';
  }
}
