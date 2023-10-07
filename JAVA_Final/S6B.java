import java.util.*;
public class S6B {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter rows : ");
        int r = s.nextInt();
        System.out.print("Enter cols : ");
        int c = s.nextInt();

        int[][] m = new int[r][c];
        
        for(int row = 0; row<r; row++){
            for(int col = 0; col<c; col++){
                System.out.print("Enter value of ["+row+"]["+col+"] : ");
                m[row][col] = s.nextInt();
            }
        }
        
        System.out.println("Transpose:");
        for(int row = 0; row<c; row++){
            for(int col = 0; col<r; col++){
                System.out.print(m[col][row]+" ");
            }
            System.out.println();
        }
        s.close();
    }
}