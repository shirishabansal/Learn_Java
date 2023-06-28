//W.A.P. to find the S.I. and C.I
import java.io.*;
import java.io.BufferedReader;

public class buffer_input{
    public static void main(String args[])throws IOException{
        InputStreamReader read= new InputStreamReader(System.in);
        BufferedReader in= new BufferedReader(read);
        double p=1000.0, r=10.0, t=1.0, s;
        double a,c=0.0;
        String name;
        System.out.println("Enter the name ");
        name= in.readLine();
        s=(p*r*t)/100;
        a=(p*Math.pow(1+r/100,t));
        c=a-p;
        System.out.println(s);
        System.out.println(c);
        System.out.println(name);
    }
}