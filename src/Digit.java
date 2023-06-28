//To find whether a number is even or odd by using input statement
import java.io.*;
public class Digit
{
    public static void main(String[] args)throws IOException
    {
int a;
InputStreamReader read = new InputStreamReader(System.in);
BufferedReader in = new BufferedReader(read);
        System.out.println("Enter your no.");
    a=Integer.parseInt(in.readLine());
    if (a%2==0)
        System.out.println("The number is even");
    else
        System.out.println("The number is odd");
    }
}
