import java.util.Scanner;

public class AccountTest {
   public static void main(String[] args) {
      Account conta1 = new Account("Hiel Saraiva", 1200.50);
      Account conta2 = new Account("Gerardina Geni", -5.23);

      System.out.println(conta1.getName() + ": " + "$" + conta1.getBalance());
      System.out.println(conta2.getName() + ": " + "$" + conta2.getBalance());

      Scanner input = new Scanner(System.in);

      System.out.print("Digite o valor do depósito para conta1: ");
      double depositAmount1 = input.nextDouble();

      System.out.println("Depositando $" + depositAmount1 + " na conta1\n");
      conta1.deposit(depositAmount1);

      System.out.println(conta1.getName() + ": " + "$" + conta1.getBalance());
      System.out.println(conta2.getName() + ": " + "$" + conta2.getBalance());

      System.out.print("Digite o valor do depósito para conta2: ");
      double depositAmount2 = input.nextDouble();

      System.out.println("Depositando $" + depositAmount2 + " na conta2\n");
      conta2.deposit(depositAmount2);

      System.out.println(conta1.getName() + ": " + "$" + conta1.getBalance());
      System.out.println(conta2.getName() + ": " + "$" + conta2.getBalance());
   }
}
