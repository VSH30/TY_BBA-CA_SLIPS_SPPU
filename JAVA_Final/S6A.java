class NumIsZeroException extends Exception{
    NumIsZeroException(String z){
        super(z);
    }
}
public class S6A {
    static int SumOfFL(int x){
        int s = 0;
        s += x%10;
        while(x>0){
            x /= 10;
            if(x/10<=0)
                s += x;
        }
        return s;
    }
    public static void main(String[] args) {
        try{
            int x = Integer.parseInt(args[0]);
            if(x == 0)
                throw new NumIsZeroException("Number is Zero");
            else
                System.out.println("Sum of 1st and last = "+SumOfFL(x));
        }catch(NumberFormatException z){
            System.out.println("Number is Invalid");
        }catch(NumIsZeroException z){
            System.out.println(z.getMessage());
        }
    }
}
