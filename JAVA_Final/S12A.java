import java.util.*;
public class S12A {
    String s1 = "Hello All";
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of Strings: ");
        int n = s.nextInt();
        String[] arr = new String[n];
        s.nextLine();
        for(int i=0;i<n;i++){
            System.out.println("String number "+(i+1)+" : ");
            arr[i] = s.nextLine();
        }
        System.out.println("------------Reversed------------");
        for(int i=0;i<n;i++){
            arr[i] = revString(arr[i]);
            System.out.println((i+1)+" = "+arr[i]);
        }
    }
    static String revString(String s){
        int len = s.length();
        char[] carr = s.toCharArray();
        for(int i=0,j=len-1;i<=(len/2);i++,j--){
            char c = carr[i];
            carr[i] = carr[j];
            carr[j] = c; 
        }
        s = new String(carr);
        return s;
    }
}
