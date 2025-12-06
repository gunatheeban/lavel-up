import InheritanceProblems.VehicleHierarchy.ElectricCar;

public class Main {

  public static void main(String[] args) {
//    BankAccount bankAccount = new BankAccount(1, 100);
//    bankAccount.deposit(50);
//    bankAccount.withdraw(160);
//    System.out.println(bankAccount.getBalance());

    ElectricCar electricCar = new ElectricCar();
    electricCar.start();
    electricCar.playMusic();
    electricCar.charge();

  }
}