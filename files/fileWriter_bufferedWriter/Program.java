package files.fileWriter_bufferedWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {

   public static void main(String[] args) {

      String[] lines = new String[] { "Good Morning", "Good afternoon", "Good night" };

      String path = "/Users/hielsaraiva_/Projects/Java_Deitel/extra/files/fileWriter_bufferedWriter/out.txt";

      try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, false))) {
         for (String line : lines) {
            bw.write(line);
            bw.newLine();
         }
      } catch (IOException e) {
         e.printStackTrace();
      }
   }
}