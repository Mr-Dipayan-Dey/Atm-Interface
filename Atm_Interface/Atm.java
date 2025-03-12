// package AtmInterface;

import java.util.Scanner;

public class Atm {
  double Ballance;
  int PIN = 2006;
  Scanner sc = new Scanner(System.in);

  void checkpin() {
    System.out.print("Enter the PIN : ");
    int Curr_PIN = sc.nextInt();
    if (Curr_PIN == PIN) {
      menu();
    } else {
      System.out.println("Enter A Valid PIN ");
    }
  }

  void menu() {
    System.out.println("1. Check A/C Ballance : \n 2. Withdraw Money : \n 3. Deposit Money : \n 4. Exit.");
    System.out.println("Enter your choise: ");
    int ch = sc.nextInt();
    while (true) {

      switch (ch) {
        case 1:
          checkballance();
          break;
        case 2:
          withdraw();
          break;
        case 3:
          deposit();
          break;
        case 4:
          break;
        default:
          System.out.println("Enter A Valid Choise");
          break;
      }
    }
  }

  void checkballance() {
    System.out.println("Your Ballance Is : " + Ballance);
    menu();
  }

  void withdraw() {
    System.out.print("Enter The Amout : ");
    float amount = sc.nextFloat();
    if (amount < Ballance) {
      System.out.println("Insufficient Ballance.");
      // checkballance();
    } else {
      Ballance = Ballance - amount;
      System.out.println("Withdrawl Successfully...");
    }
    menu();
  }

  void deposit() {
    System.out.print("Enter The Amout : ");
    float deposit_amount = sc.nextFloat();
    Ballance = Ballance + deposit_amount;
    System.out.println(deposit_amount + " Is Successfully Deposited");
    menu();
  }


  public static void main(String[] args) {
  Atm obj=new Atm();
  obj.checkpin();
  }
}
