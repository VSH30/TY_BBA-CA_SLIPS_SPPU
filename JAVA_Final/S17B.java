import java.util.Scanner;

public class S17B{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = s.nextInt();
        Product p[] = new Product[n];
        for(int i = 0; i < n; i++){
            System.out.println("--------------------------------");
            System.out.print("Enter P Name: ");
            s.nextLine();
            String pname = s.nextLine();
            System.out.print("Enter PID: ");
            int pid = s.nextInt();
            System.out.print("Enter Price: ");
            int price = s.nextInt();
            p[i] = new Product(pname,pid,price);
        }
        int total = 0;
        for(int i = 0; i < n; i++){
            p[i].disp();
            total += p[i].price;
        }
        System.out.println("------------- Total Amount = "+total+" -------------");
        s.close();
    }
}

class Product{
    int pid,price;
    String pname;
    Product(String pname, int pid, int price){
        this.pname = pname;
        this.pid = pid;
        this.price = price;
    }
    public void disp(){
        //System.out.println("---------------------------------");
        System.out.println("PID = "+pid+" Pname = "+pname+" Price = "+price);
    }
}