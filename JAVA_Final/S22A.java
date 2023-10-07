import java.util.*;
public class S22A {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = s.nextInt();
        System.out.println("Factorial of n = "+fact(n));
        s.close();
    }
    static int fact(int x){
        if(x == 0)
            return 1;
        else
            return x*fact(x-1);
    }
}
