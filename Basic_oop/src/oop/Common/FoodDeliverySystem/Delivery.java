package oop.Common.FoodDeliverySystem;

import java.math.BigDecimal;

public abstract class Delivery {

  private double distance;
  private double baseCost;

  public Delivery(double distance, double baseCost) {
    this.baseCost = baseCost;
    this.distance = distance;
  }

  public final DeliveryDetails costCalculation() {
    DeliveryDetails deliveryDetails = new DeliveryDetails();
    deliveryDetails.setDeliveryType(this.getDeliveryType());
    deliveryDetails.setDistance(this.distance);
    deliveryDetails.setTotalCost(isValid() ? this.totalCost() : new BigDecimal(0));
    deliveryDetails.setStatus(isValid() ? "Success" : "Failed");
    return deliveryDetails;
  }

  protected abstract BigDecimal totalCost();

  protected boolean isValid() {
    return true;
  }

  protected abstract DeliveryType getDeliveryType();

  public double getBaseCost() {
    return baseCost;
  }

  public double getDistance() {
    return distance;
  }
}
