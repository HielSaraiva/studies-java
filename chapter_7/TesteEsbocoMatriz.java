import java.util.ArrayList;

public class TesteEsbocoMatriz {
   public static void main(String[] args) {
      ArrayList<Integer> vlrs1 = new ArrayList<>();
      for(int i = 25; i > 0; i += -4) {
         vlrs1.add(i);
      }

      ArrayList<Integer> vlrs2 = new ArrayList<>();
      for(int i = 50; i > 0; i += -7) {
         vlrs2.add(i);
      }

      EsbocoMatriz matriz = new EsbocoMatriz("Matriz Primaria", vlrs1);

      System.out.println(matriz.toString());
      System.out.println(matriz.getValores());
      System.out.println();
      matriz.ordernarMatriz();
      System.out.println(matriz);

      matriz.setValores(vlrs2);
      System.out.println(matriz.toString());
      System.out.println(matriz.getValores());
      System.out.println();
      matriz.ordernarMatriz();
      System.out.println(matriz);
   }
}