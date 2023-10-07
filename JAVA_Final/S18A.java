import java.util.*;

public class S18A {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter Side of Square: ");
        int sqside = s.nextInt();
        System.out.print("Enter Height of Triangle: ");
        int h = s.nextInt();
        System.out.print("Enter Base of Triangle: ");
        int b = s.nextInt();
        System.out.print("Enter Radius of Circle: ");
        double r = s.nextInt();

        System.out.println("Area of Square = "+area(sqside));
        System.out.println("Area of Triangle = "+area(h,b));
        System.out.println("Area of Circle = "+area(r));

        s.close();
    }
    static double area(int s){
        return s*s;
    }
    static double area(int h, int b){
        return (h*b)/2;
    }
    static double area(double x){
        return 3.14*x*x;
    }
}
