//to take all datatypes as input in buffer
import java.io.*;
public class Input_inBuffer {
    public static void main(String[] args)throws IOException {
        InputStreamReader read= new InputStreamReader(System.in);
        BufferedReader in= new BufferedReader(read);
        char ch='$';
        System.out.println("Enter an Integer: ");
        int i= Integer.parseInt(in.readLine());
        System.out.println("Enter a String: ");
        String s=in.readLine();
        //System.out.println("Enter a Character: ");
        //ch=(char)(in.read());
        System.out.println("Enter a Double: ");
        double d=Double.parseDouble(in.readLine());
        System.out.println("Enter a Float: ");
        float f=Float.parseFloat(in.readLine());
        System.out.println("Enter a Long: ");
        long l= Long.parseLong(in.readLine());
        System.out.println("Enter a Boolean: ");
        boolean b=Boolean.parseBoolean(in.readLine());
        System.out.println("integer "+i+"\nstring "+s+"\ncharacter "+ch+"\ndouble "+d+"\nfloat "+f+"\nlong "+l+"\nboolean "+b);
    }
}
