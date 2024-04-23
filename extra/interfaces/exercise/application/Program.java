package interfaces.exercise.application;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import interfaces.exercise.entities.Contract;
import interfaces.exercise.entities.Installment;
import interfaces.exercise.services.ContractService;
import interfaces.exercise.services.PaypalService;

public class Program {
   public static void main(String[] args) throws ParseException {

      Locale.setDefault(Locale.US);
      Scanner sc = new Scanner(System.in);

      DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

      System.out.println("Enter contract details: ");
      System.out.print("Number: ");
      int number = sc.nextInt();
      System.out.print("Date (dd/MM/yyyy): ");
      LocalDate date = LocalDate.parse(sc.next(), fmt);
      System.out.print("Value of contract: ");
      double totalValue = sc.nextDouble();

      Contract contract = new Contract(number, date, totalValue);

      System.out.print("Enter the number of installments: ");
      int n = sc.nextInt();

      ContractService contractService = new ContractService(new PaypalService());

      contractService.processContract(contract, n);

      System.out.println("Installments: ");
      for (Installment installment : contract.getInstallments()) {
         System.out.println(installment);
      }

      sc.close();
   }
}
