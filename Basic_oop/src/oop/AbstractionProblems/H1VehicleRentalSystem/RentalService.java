package oop.AbstractionProblems.H1VehicleRentalSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class RentalService {

  private final int TEX = 5;

  public final RentalQuote getQuote(Vehicle v, int days, List<AddOn> addOns, Customer customer) {
    double subTotal = 0;
    
    // 1. validate inputs
    List<String> messages = validate(v, days, customer);
    if (!messages.isEmpty()) {
      return new RentalQuote().failed(null, null, null, null, null, null, null, null,
          messages);
    }

    // 2. compute base = computeBase(v, days)  // call subclass hook
    BaseAmount baseAmount = computeBase(v, days);
    subTotal += baseAmount.getBase();

    // 3. compute addOnCost = sum of add-on costs
    double addOnSum = 0;
    StringBuilder addOnBreakdown = new StringBuilder();
    for (AddOn addOn: addOns) {
      double v1 = addOn.priceFor(v, days);
      addOnSum += v1;
      addOnBreakdown.append(addOn.name()).append("(").append(addOn.breakdown()).append(")").append(" = ").append(v1);
    }
    subTotal += addOnSum;

    // 4. apply discounts (loyalty, long-stay, vehicle-specific)
    BaseAmount discount = computeDiscounts(5, subTotal, customer, days, v.getType());
    subTotal += discount.getBase();

    // 5. compute taxes and fees
    double computeTax = computeTax(subTotal);
    subTotal += computeTax;

    // 6. produce and return RentalQuote object
    return new RentalQuote().success(
        v.getId().toString(),
        v.getType().name(),
        String.valueOf(days),
        baseAmount.getBreakdown(),
        addOnBreakdown.toString(),
        discount.getBreakdown(),
        String.valueOf(computeTax),
        String.valueOf(subTotal));
  }

  private BaseAmount computeBase(Vehicle v, int days) {
    double base = days * v.baseDailyRate();
    String breakdown = days + " * " + v.baseDailyRate();

    return new BaseAmount(breakdown, base);
  }

  protected BaseAmount computeDiscounts(int discountPercentage, double subTotal, Customer customer, int days, VehicleType vehicleType) {
    List<Discount> discounts = List.of(
        new Loyalty(discountPercentage, subTotal, customer),
        new LongStay(discountPercentage, subTotal, days),
        new VehicleSpecific(discountPercentage, subTotal, vehicleType));
    double maxDiscount = 0;
    String breakdown = "";
    for (Discount discount: discounts) {
      double v = discount.discountAmount();
      if (maxDiscount < v) {
        maxDiscount = v;
        breakdown = discount.getClass().getName() + " -" + v;
      }
    }

    return new BaseAmount(breakdown,maxDiscount);
  }

  private static List<String> validate(Vehicle v, int days, Customer customer) {
    List<String> errorMessages = new ArrayList<>();
    if (Objects.isNull(v)) {
      errorMessages.add("Vehicle can't be empty");
    } else {
      if (v.baseDailyRate() <= 0) {
        errorMessages.add("Add a valid base rate!");
      }
    }

    if (days <= 0) {
      errorMessages.add("Add a valid days count");
    }

    if (Objects.isNull(customer)) {
      errorMessages.add("Customer can't be empty");
    }
    return errorMessages;
  }

  protected double computeTax(double subtotal) {
    return (subtotal / 100) * TEX;
  }

}

