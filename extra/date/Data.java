package date;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Data {
   public static void main(String[] args) {

      LocalDate d04 = LocalDate.parse("2022-07-20");
      LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
      Instant d06 = Instant.parse("2022-07-20T01:30:26Z");

      LocalDate pastWeekLocalDate = d04.minusWeeks(1);

      System.out.println(d04 + " e " + pastWeekLocalDate);

      DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

      System.out.println(fmt1.format(pastWeekLocalDate));

      LocalDateTime pastWeekLocalDateTime = d05.minusDays(7);
      LocalDateTime nextWeekLocalDateTime = d05.plusDays(7);

      Duration t1 = Duration.between(pastWeekLocalDateTime, d05);

      System.out.println("t1 dias = " + t1.toDays());

   }
}