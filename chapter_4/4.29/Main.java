import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      long num;
      Scanner entrada = new Scanner(System.in);

      do {
         System.out.print("Digite um valor entre [0, 20]: ");
         num = entrada.nextLong();
         if(!(num >= 0 && num <= 20)) {
            System.out.println("Digite um valor válido e tente novamente!\n");
         }
      } while (!(num >= 0 && num <= 20));

      System.out.println("Logo o fatorial de " + num + " é: " + fatorial(num));

   }

   public static long fatorial(long num) {
      if(num == 0 || num == 1) {
         return 1;
      } else {
         return num * fatorial(num - 1);
      }
   }
}