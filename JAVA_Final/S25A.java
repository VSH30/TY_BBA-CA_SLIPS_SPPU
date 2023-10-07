import java.util.*;

public class S25A {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = s.nextLine();
        if(strpalindrome(str))
            System.out.println("Given String is Palindrome");
        else
            System.out.println("Given String is not Palindrome");
        s.close();
    }
    static boolean strpalindrome(String s){
        for(int i=0,j=(s.length()-1); i<(s.length()/2);i++,j--)
            if(s.charAt(i) != s.charAt(j))
                return false;
        return true;
    }
}
