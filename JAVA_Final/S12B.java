//import java.util.Collection;
import java.util.Hashtable;
import java.util.Scanner;

public class S12B {
    public static void main(String[] args) {
        Hashtable<String,Integer> h = new Hashtable<>(10, 10);
        h.put("Pune", 4);
        h.put("Mumbai",5);
        
        h.forEach((x,y)->System.out.println(x+" = "+y));

        Scanner s = new Scanner(System.in);
        System.out.print("Enter City Name: ");
        String st = s.nextLine();

        if(h.containsKey(st))
            System.out.println(h.get(st));
        else
            System.out.println("City Name is Invalid!!!");
        s.close();
    }
}
