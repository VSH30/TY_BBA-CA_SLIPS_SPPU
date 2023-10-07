import java.io.File;

public class S8B { 
    static boolean checkTxt(String x){
        int i = x.lastIndexOf('.');
        String t;
        if(i>0) 
            t = x.substring(i+1);
        else
            return false;
        if(t.equals("txt"))
            return true;
        return false;
    }
    public static void main(String[] args) {
        File f = new File(".");
        
        String[] files = f.list();
        for(String x:files){
            if(checkTxt(x))
                System.out.println(x);
        }
    }
}
