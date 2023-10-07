import java.util.*;

public class S17A {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0; i<(args.length); i++){
            int t = Integer.parseInt(args[i]);
            if(armstrong(t)){
               arr.add(t);
            }
        }
        System.out.println(arr);
    }
    static boolean armstrong(int x){
        int s = 0;
        int t = x;
        while(t>0){
            int r = t%10;
            s += r*r*r;
            t /= 10;
        }
        if(s == x)
            return true;
        else
            return false;
    }
}
