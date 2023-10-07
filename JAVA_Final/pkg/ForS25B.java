package pkg;
public class ForS25B{
    int x;
    public ForS25B(int z){
        x = z;
    }
    public void fib(){
        int a = 0, b = 1;
        System.out.print("Fibo till "+x+" = "+a+" "+b+" ");
        for(int i = 0; i < (x-2);i++){
            int c = a + b;
            System.out.print(c+" ");
            a = b;
            b = c;
        }
        System.out.println();
    }
    public void cube(){
        System.out.print("Cube till "+x+" = ");
        for(int i=1; i<=x; i++)
            System.out.print(i*i*i+" ");
        System.out.println();
    }
    public void square(){
        System.out.print("Square till "+x+" = ");
        for(int i=1;i<=x;i++)
            System.out.print(i*i+" ");
        System.out.println();
    }
}