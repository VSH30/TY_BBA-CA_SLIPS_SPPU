import java.util.*;

public class S16A {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = s.nextInt();
        System.out.println("Sum of Digits of "+n+" = "+SumOfDigits(n));
        
        s.close();
    }
    static int SumOfDigits(int x){
            if(x==0)
                return 0;
            else
                return x%10 + SumOfDigits(x/10);
    }
}
