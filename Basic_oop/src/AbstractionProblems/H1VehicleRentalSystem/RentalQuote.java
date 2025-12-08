package AbstractionProblems.H1VehicleRentalSystem;

import java.util.Date;
import java.util.List;
import java.util.UUID;

public class RentalQuote {

  private UUID transactionId;
  private String vehicleId;
  private String vehicleType;
  private String days;
  private String baseAmount;
  private String addOnAmount;
  private String discountAmount;
  private String taxAmount;
  private String totalAmount;
  private String timestamp;
  private List<String> message;

  public RentalQuote() {}

  private RentalQuote(UUID transactionId, String vehicleId, String vehicleType, String days,
      String baseAmount, String addOnAmount, String discountAmount, String taxAmount,
      String totalAmount, String timestamp, List<String> message) {
    this.transactionId = transactionId;
    this.vehicleId = vehicleId;
    this.vehicleType = vehicleType;
    this.days = days;
    this.baseAmount = baseAmount;
    this.addOnAmount = addOnAmount;
    this.discountAmount = discountAmount;
    this.taxAmount = taxAmount;
    this.totalAmount = totalAmount;
    this.timestamp = timestamp;
    this.message = message;
  }

  public RentalQuote success(String vehicleId, String vehicleType, String days,
      String baseAmount, String addOnAmount, String discountAmount, String taxAmount,
      String totalAmount) {
    return new RentalQuote(UUID.randomUUID(), vehicleId, vehicleType, days, baseAmount, addOnAmount,
        discountAmount, taxAmount, totalAmount, new Date().toString(),
        List.of("Success fully calculated the quote"));
  }

  public RentalQuote failed(String vehicleId, String vehicleType, String days,
      String baseAmount, String addOnAmount, String discountAmount, String taxAmount,
      String totalAmount, List<String> message) {
    return new RentalQuote(UUID.randomUUID(), vehicleId, vehicleType, days, baseAmount, addOnAmount,
        discountAmount, taxAmount, totalAmount, new Date().toString(), message);
  }

}
