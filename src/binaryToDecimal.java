//W.A.P to convert a number from binary to decimal without bit manipulation
import java.io.*;
//import java.util.*;
public class binaryToDecimal {
    public static void main(String[] args)throws IOException {
        InputStreamReader fish = new InputStreamReader(System.in);
        BufferedReader sc = new BufferedReader(fish);
        System.out.println("Enter the BINARY number to get its decimal representation");
        int binaryNumber=Integer.parseInt(sc.readLine());
        int l=(int)(Math.log10(binaryNumber)+1);
        int base=1, decimalNumber=0;
        for(int i=0;i<l;i++)
        {
            decimalNumber+= base*(binaryNumber%10);
            binaryNumber/=10;
            base*=2;
        }
        System.out.print(decimalNumber);
    }
}
