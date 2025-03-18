package files.file;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadingFiles {

   public static void main(String[] args) {
      
      File file = new File("/Users/hielsaraiva_/Projects/Java_Deitel/extra/files/file/in.txt");
      Scanner sc = null;

      try {
         sc = new Scanner(file);
         while(sc.hasNextLine()) {
            System.out.println(sc.nextLine());
         }

      } catch (IOException e) {
         System.out.println("Error: " + e.getMessage());
      } finally {
         if (sc != null)
            sc.close();
      }
   }
}