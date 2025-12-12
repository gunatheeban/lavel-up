package oop.AbstractionProblems.SubscriptionManagementSystem;

import java.math.BigDecimal;

public abstract class Plan {

  private BigDecimal monthlyPrice;
  private int maxDevices;
  private double storageLimitGB;
  Tax taxRate;

  public Plan(BigDecimal monthlyPrice, int maxDevices, double storageLimitGB, Tax taxRate) {
    this.monthlyPrice = monthlyPrice;
    this.maxDevices = maxDevices;
    this.storageLimitGB = storageLimitGB;
    this.taxRate = taxRate;
  }

  public final FinalBillDto calculateBill() {

    FinalBillDto finalBillDto = new FinalBillDto();
    PlanType type = this.getType();
    int devices = this.maxDevices;
    if (this.isValid()) {
      BigDecimal baseAmount = monthlyPrice.multiply(BigDecimal.valueOf(12));
      BigDecimal taxPercent = this.getTax();
      BigDecimal discountPercent = this.discount();
      BigDecimal extraCharges = this.extraCharges();

      BigDecimal total = baseAmount.add(extraCharges);

      BigDecimal tax = total.multiply(taxPercent)
          .divide(BigDecimal.valueOf(100));

      BigDecimal discount = total.multiply(discountPercent)
          .divide(BigDecimal.valueOf(100));

      total = total.add(tax).subtract(discount);

      finalBillDto.success(type, devices, this.storageLimitGB, total);
    } else {
      finalBillDto.failed(type, devices, "Exceeded device limit");
    }

    return finalBillDto;
  }


  protected abstract PlanType getType();
  protected BigDecimal getTax() {
    return BigDecimal.valueOf(this.taxRate.taxPercentage());
  };
  protected boolean isValid() {
    return true;
  }

  protected BigDecimal discount() {
    return BigDecimal.ZERO;
  }

  protected BigDecimal extraCharges() {
    return BigDecimal.ZERO;
  }

  public int getMaxDevices() {
    return maxDevices;
  }

  public double getStorageLimitGB() {
    return storageLimitGB;
  }

  public Tax getTaxRate() {
    return taxRate;
  }
}
