import java.util.ArrayList;
import java.util.Collections;

public class EsbocoMatriz {
   private String nomeMatriz;
   private ArrayList<Integer> valores;
   
   public EsbocoMatriz(String nomeMatriz, ArrayList<Integer> valores) {
      this.nomeMatriz = nomeMatriz;
      this.valores = valores;
   }

   public String getNomeMatriz() {
      return this.nomeMatriz;
   }

   public void setNomeMatriz(String nomeMatriz) {
      this.nomeMatriz = nomeMatriz;
   }

   public ArrayList<Integer> getValores() {
      ArrayList<Integer> str = new ArrayList<>();
      for(int valor : valores) {
         str.add(valor);
      }
      return str;
   }

   public void setValores(ArrayList<Integer> valores) {
      this.valores = valores;
   }

   public void ordernarMatriz() {
      Collections.sort(this.valores);
   }

   public String toString() {
      String str = "";
      str += "nomeMatriz: " + nomeMatriz + "\n";
      str += "valores: " + getValores();
      return str;
   }
}