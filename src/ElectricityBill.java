//to find the bill as per tariff
import java.io.*;
public class ElectricityBill
{
    public static void main(String args[]) throws IOException
    {InputStreamReader read=new InputStreamReader(System.in);
    BufferedReader in= new BufferedReader(read);
        System.out.println("Enter no of units");
    double n=Double.parseDouble(in.readLine());
    double bill;
    if (n<=100&&n>=0)
        bill= 4.80*n;
    else if(n>100&&n<=300)
            bill=480+(5.50*(n-100));
    else if(n>300&&n<=600)
            bill=1580+(6.80*(n-300));
    else if(n>600)
        bill=3620+(7.50*(n-600));
    else
    {
        bill=0.0;
        System.out.println("Please enter a valid value");

    }
        System.out.println("bill "+bill);
    }
}
