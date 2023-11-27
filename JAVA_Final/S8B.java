import java.io.File;
import java.io.IOException;
public class S5B1 {
   public static void main(String args[]) throws IOException {
      File P = new File(".");
      String c[] = P.list();
      System.out.println("List of files and directories in the specified directory:");
      for(int i=0; i<c.length; i++) {
         System.out.println(c[i]);
      }
   }
}
