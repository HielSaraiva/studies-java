public class Main {
   public static void main(String[] args) {
      int multi = 1;
      for(int cont = 1; cont <= 15; cont++) {
         if(cont % 2 == 1) {
            multi *= cont;
         }
      }
      System.out.println(multi);
   }
}
