import java.util.*;
public class S14A {
    static int powww(int x,int y){
        if(y == 0)  return 1;
        else    return x*powww(x, y-1);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = s.nextInt();
        System.out.print("Enter pow: ");
        int p = s.nextInt();
        System.out.println(n+"^"+p+" = "+powww(n,p));
        s.close();
    }
}
