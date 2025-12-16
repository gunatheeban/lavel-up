import java.math.BigDecimal;
import java.util.Arrays;
import oop.AbstractionProblems.ReportGenerationFramework.CsvReportGenerator;
import oop.AbstractionProblems.ReportGenerationFramework.DataSource;
import oop.AbstractionProblems.ReportGenerationFramework.ExcelReportGenerator;
import oop.AbstractionProblems.ReportGenerationFramework.PdfReportGenerator;
import oop.AbstractionProblems.ReportGenerationFramework.Report;
import oop.AbstractionProblems.ReportGenerationFramework.ReportGenerator;
import java.util.List;
import java.util.Map;
import oop.AbstractionProblems.SubscriptionManagementSystem.BasicPlan;
import oop.AbstractionProblems.SubscriptionManagementSystem.Plan;
import oop.AbstractionProblems.SubscriptionManagementSystem.StandardPlan;
import oop.AbstractionProblems.SubscriptionManagementSystem.Tax;
import oop.AbstractionProblems.SubscriptionManagementSystem.UaeTax;
import oop.AbstractionProblems.SubscriptionManagementSystem.UsTax;
import oop.Common.FoodDeliverySystem.BikeDelivery;
import oop.Common.FoodDeliverySystem.CarDelivery;
import oop.Common.FoodDeliverySystem.Delivery;
import oop.Common.FoodDeliverySystem.DeliveryDetails;
import oop.Common.FoodDeliverySystem.DroneDelivery;
import oop.Common.Notification.EmailNotification;
import oop.Common.Notification.Notification;
import oop.Common.Notification.PushNotification;
import oop.Common.Notification.SMSNotification;

public class Main {

  public static void main(String[] args) {
//    Tax Us = new UsTax();
//    Plan plan = new StandardPlan(BigDecimal.valueOf(10), 2, 10, Us, 4);
//
//    System.out.println(plan.calculateBill());

    List<Notification> notifications = List.of(
        new EmailNotification("user@email.com", "Hello!"),
        new SMSNotification("+94771234567", "OTP 1234"),
        new PushNotification("deviceId-8899", "New message received")
    );

    for (Notification n : notifications) {
      n.send();
    }

  }
}

//List<Delivery> deliverys =List.of(
//    new BikeDelivery(25.25, 5, 5),
//    new CarDelivery(30, 10, 10),
//    new DroneDelivery(40, 20, 20),
//    new DroneDelivery(6, 20, 20));
//
//    for (Delivery delivery: deliverys) {
//    System.out.println(delivery.costCalculation());
//    }

//    BankAccount bankAccount = new BankAccount(1, 100);
//    bankAccount.deposit(50);
//    bankAccount.withdraw(160);
//    System.out.println(bankAccount.getBalance());

//    ElectricCar electricCar = new ElectricCar();
//    electricCar.start();
//    electricCar.playMusic();
//    electricCar.charge();

//Shape[] shapes = {new Circle(5), new Triangle(2, 3), new Rectangle(4,6)};
//
//    for (Shape shape: shapes) {
//    System.out.println(shape.area());
//    }

//  List<Payment> payments = Arrays.asList(
//      new BankTransferPayment("USD", "123123123123"),
//      new CreditCardPayment("USD", "1234123412341234"),
//      new PaypalPayment("LKR", "123456"));
//
//    for (Payment payment: payments) {
//    System.out.println("----------------------");
//    PaymentReceipt pay = payment.pay(100);
//    System.out.println(pay.toString());
//    System.out.println("----------------------");
//    System.out.println();
//  }
//
//}

//  List<ReportGenerator> generators = List.of(
//      new PdfReportGenerator(),
//      new ExcelReportGenerator(),
//      new CsvReportGenerator()
//  );
//
//  DataSource dataSource = new DataSource(
//      "users",
//      Map.of(
//          "country", "US",
//          "status", "ACTIVE",
//          "minAge", 21,
//          "maxAge", 60
//      )
//  );
//
//
//    for ( ReportGenerator generator: generators) {
//    Report report = generator.generate(dataSource);
//    System.out.println("Generated: " + report.getType());
//    System.out.println("Generated at: " + report.getGeneratedAt());
//    System.out.println("Size: " + report.getContent().length + " bytes");
//  }
//}