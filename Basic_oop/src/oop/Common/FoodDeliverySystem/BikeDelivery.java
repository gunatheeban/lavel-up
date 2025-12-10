package oop.Common.FoodDeliverySystem;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BikeDelivery extends Delivery {

  public BikeDelivery(double distance, double baseCost, int costIncreaseBy) {
    super(distance, baseCost);
  }

  @Override
  protected BigDecimal totalCost() {
    return new BigDecimal(super.getDistance() * super.getBaseCost()).setScale(2,
        RoundingMode.HALF_UP);
  }

  @Override
  protected DeliveryType getDeliveryType() {
    return DeliveryType.BIKE;
  }
}
