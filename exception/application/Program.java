package application;

import java.util.Locale;
import java.util.Scanner;

import entities.*;
import exceptions.*;

public class Program {
   public static void main(String[] args) {

      Locale.setDefault(Locale.US);
      Scanner sc = new Scanner(System.in);

      System.out.println("Enter account data");
      System.out.print("Number: ");
      Integer number = sc.nextInt();

      System.out.print("Holder: ");
      sc.nextLine();
      String name = sc.nextLine();

      System.out.print("Initial balance: ");
      Double balance = sc.nextDouble();

      System.out.print("Withdraw limit: ");
      Double limit = sc.nextDouble();

      Account acc = new Account(number, name, balance, limit);

      System.out.println();
      System.out.print("Enter an amount for withdraw: ");
      Double amount1 = sc.nextDouble();

      try {
         acc.withdraw(amount1);
         System.out.println("New balance: " + String.format("%.2f%n", acc.getBalance()));
      } catch (BusinessException e) {
         System.out.println(e.getMessage());
      }

      System.out.println();
      System.out.print("Enter an amount for deposit: ");
      Double amount2 = sc.nextDouble();

      try {
         acc.deposit(amount2);
         System.out.println("New balance: " + String.format("%.2f%n", acc.getBalance()));
      } catch (BusinessException e) {
         System.out.println(e.getMessage());
      }

      sc.close();
   }
}
