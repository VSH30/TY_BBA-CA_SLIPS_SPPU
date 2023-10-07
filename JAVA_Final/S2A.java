import java.util.Scanner;
public class S2A {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String str = s.nextLine();
        for(char c : str.toCharArray()){
            switch(c){
                case 'a':
                case 'A':
                case 'e':
                case 'E':
                case 'i':
                case 'I':
                case 'o':
                case 'O':
                case 'u':
                case 'U':
                    System.out.println(c);
                    break;
                default:
            }
        }
    }
}
