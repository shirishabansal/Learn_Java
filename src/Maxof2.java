//to find max of two numbers using two numbers
import java.util.Scanner;
public class Maxof2
{
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        int a= in.nextInt();
        int b= in.nextInt();
        int max;
        max= a>b?a:b;
        System.out.println("The answer is "+max);
    }
}
