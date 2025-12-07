import AbstractionProblems.PaymentProcessingSystem.BankTransferPayment;
import AbstractionProblems.PaymentProcessingSystem.CreditCardPayment;
import AbstractionProblems.PaymentProcessingSystem.Payment;
import AbstractionProblems.PaymentProcessingSystem.PaymentReceipt;
import AbstractionProblems.PaymentProcessingSystem.PaypalPayment;
import AbstractionProblems.ShapeAreaCalculator.Circle;
import AbstractionProblems.ShapeAreaCalculator.Rectangle;
import AbstractionProblems.ShapeAreaCalculator.Triangle;
import InheritanceProblems.VehicleHierarchy.ElectricCar;
import AbstractionProblems.ShapeAreaCalculator.Shape;
import java.util.Arrays;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    List<Payment> payments = Arrays.asList(
        new BankTransferPayment("USD", "123123123123"),
        new CreditCardPayment("USD", "1234123412341234"),
        new PaypalPayment("LKR", "123456"));

    for (Payment payment: payments) {
      System.out.println("----------------------");
      PaymentReceipt pay = payment.pay(100);
      System.out.println(pay.toString());
      System.out.println("----------------------");
      System.out.println();
    }

  }
}

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