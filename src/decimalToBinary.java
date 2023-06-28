/*converting DECIMAL to binary without bitwise manipulations
i.e., 7 to 0111, we keep dividing the number and then the quotients by 2 resp.
and collect the remainders in an array and display the from last to first index till n>0**/

import java.util.Scanner;
public class decimalToBinary {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the DECIMAL whole number to find it's BINARY representation");
        int n = in.nextInt();
        int i;
        int r[]=new int[32];
        for(i=0;n>0;i++)
        {
            r[i]=n%2;
            n/=2;
        }
        System.out.println("the BINARY is ");
        //m printing an extra zero at the start coz it looks good
        //can remove that filling i=i-1;
        for(;i>=0;i--)
        {
            System.out.print(r[i]);
        }
    }
}
