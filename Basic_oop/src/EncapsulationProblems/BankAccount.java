package EncapsulationProblems;

public class BankAccount {

  private long accountNumber;
  private double balance;

  public BankAccount (long accountNumber, double balance) {
    this.accountNumber = accountNumber;
    this.balance = balance;
  }

  public void deposit(double amount) {
    if (amount > 0) {
      this.balance += amount;
    }
    System.out.println("Latest balance is "+ this.balance);
  }

  public void withdraw(double amount) {
    if (amount > 0 && (this.balance - amount) > 0) {
      this.balance -= amount;
    }
    System.out.println("Latest balance is "+ this.balance);
  }

  public double getBalance() {
    return this.balance;
  }

}
