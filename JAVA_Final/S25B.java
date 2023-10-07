import pkg.ForS25B;
import java.util.Scanner;
public class S25B {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = s.nextInt();
        
        ForS25B obj = new ForS25B(n);
        obj.fib();
        obj.cube();
        obj.square();

        s.close();
    }
}
