package date;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TesteData {
   public static void main(String[] args) {
      
      DateTimeFormatter frmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

      Scanner input = new Scanner(System.in);

      System.out.println("Digite uma data: (dd/MM/yyyy)");
      String dateString = input.nextLine();

      LocalDate date = LocalDate.parse(dateString, frmt1);

      System.out.println("Data: " + frmt1.format(date));
      System.out.println("Day of Month: " + date.getDayOfMonth());
      System.out.println("Day of Year: " + date.getDayOfYear());
      System.out.println("Month: " + date.getMonthValue());
      System.out.println("Year: " + date.getYear());

      input.close();
   }
}
