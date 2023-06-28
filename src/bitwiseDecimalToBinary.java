//a program to convert decimal to binary through bitwise manipulations

import java.io.*;
public class bitwiseDecimalToBinary {
    public static void main(String[] args) throws IOException{
        //as read in InputStreamReader read was an iobject we can give it any other name as well, like thai here
        InputStreamReader thai= new InputStreamReader(System.in);
        BufferedReader br= new BufferedReader(thai);
        System.out.println("Enter DECIMAL whole number TO find it BINARY");
        int n=Integer.parseInt(br.readLine());
        //its just get a bit-mask and bit-mask every integer from the start and print 0 and 1 resp.
        //I would be taking just an 8-bit representaion.
        int bitMask;
        for(int i=7;i>=0;i--)
        {
            bitMask=n>>i;
            if((1 & bitMask)>0)
                System.out.print("1");
            else
                System.out.print("0");
        }
    }
}
