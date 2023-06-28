//to find the max number of 3 entered by user usinf ternary operator
import java.io.*;
public class Max {
    public static void main(String[] args)throws IOException {
        InputStreamReader read= new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(read);
        System.out.println("enter 3 numbers to find max");
        int a=Integer.parseInt(br.readLine());
        int b=Integer.parseInt(br.readLine());
        int c=Integer.parseInt(br.readLine());
        int max=(a>c)?(a>b)?a:b:(c>b)?c:b;
        System.out.println(max);
    }
}
