import java.util.*;
public class S15A {
    static int searchName(String[] l, String s){
        for(int i=0;i<l.length;i++)
            if(s.equals(l[i]))
                return i;
        return -1;
    }
    public static void main(String[] args) {
        String[] names = {"VSH","Adnan","Shabaz","Saniya"};
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Name to Search: ");
        String n = s.nextLine();
        int z = searchName(names,n);
        if(z == -1)
            System.out.println("Name "+n+" is not present!!!");
        else
            System.out.println("Name "+n+" is present at index "+z);
        s.close();
    }
}
