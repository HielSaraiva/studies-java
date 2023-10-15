import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      int quantNum;
      int num1;
      int num2;
      int menorNum = 0;
      int cont = 0;

      System.out.print("Digite quantos números serão digitados: ");

      Scanner input = new Scanner(System.in);
      quantNum = input.nextInt();

      System.out.print("Digite o " + (++cont) + "º dígito: ");
      num1 = input.nextInt();

      while (cont < quantNum) {
         System.out.print("Digite o " + (++cont) + "º dígito: ");
         num2 = input.nextInt();

         if (num2 >= num1) {
            menorNum = num1;
         } else {
            menorNum = num2;
         }

         num1 = menorNum;
      }
      System.out.println("O menor dígito é: " + menorNum + "!\n");
   }
}