public class Account {
   private String name; // variavel de instancia
   private double balance; // 0.0 é o seu valor padrão

   public Account(String name, double balance) {
      this.name = name;

      if(balance > 0.0) {
         this.balance = balance;
      }
   }

   public double getBalance() {
      return balance;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getName() {
      return name;
   }

   public void deposit(double depositAmount) {
      if(depositAmount > 0.0) {
         balance += depositAmount;
      }
   }
}  
