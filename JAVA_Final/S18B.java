import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class S18B{
    public static void main (String[] args) throws IOException{
        FileInputStream Fin = new FileInputStream("S18B.java");
        FileOutputStream Fout = new FileOutputStream("S18B.txt");
        int i;
        char c;

        do{
            i = Fin.read();
            c = (char)i;
            if(i != -1){
                if(Character.isDigit(c)){
                    Fout.write('*');
                }else if(Character.isUpperCase(c)){
                    Fout.write(Character.toLowerCase(c));
                }else if(Character.isLowerCase(c)){
                    Fout.write(Character.toUpperCase(c));
                }else{
                    Fout.write(c);
                }
            }
        }while(i!=-1);
        System.out.println("Copied the data from one file into another file, while copying change the case of characters in target file and replaces all digits by '*' symbol");
        
        Fin.close();
        Fout.close();
    }
}
