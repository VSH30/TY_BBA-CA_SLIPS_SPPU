import java.util.Scanner;
public class S3A {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = s.nextInt();
        if(checkArmstrong(n))
            System.out.println(n+" Is Armstrong");
        else
            System.out.println(n+" Is not Armstrong");
    }
    public static boolean checkArmstrong(int x){
        int arm = 0;
        for(int i = x; i != 0 ; i = i/10){
            int z = i%10;
            arm += z*z*z;
        }
        if(arm == x)
            return true;
        else
            return false;
    }
}
