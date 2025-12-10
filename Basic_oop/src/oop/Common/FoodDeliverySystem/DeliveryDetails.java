package oop.Common.FoodDeliverySystem;

import java.math.BigDecimal;

public class DeliveryDetails {

  private DeliveryType deliveryType;
  private double distance;
  private BigDecimal totalCost;
  private String status;

  public DeliveryType getDeliveryType() {
    return deliveryType;
  }

  public void setDeliveryType(DeliveryType deliveryType) {
    this.deliveryType = deliveryType;
  }

  public double getDistance() {
    return distance;
  }

  public void setDistance(double distance) {
    this.distance = distance;
  }

  public BigDecimal getTotalCost() {
    return totalCost;
  }

  public void setTotalCost(BigDecimal totalCost) {
    this.totalCost = totalCost;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  @Override
  public String toString() {
    return "DeliveryDetails{" +
        "deliveryType=" + deliveryType +
        ", distance=" + distance +
        ", totalCost=" + totalCost +
        ", status='" + status + '\'' +
        '}';
  }
}
