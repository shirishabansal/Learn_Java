//to find odd even
import java.util.Scanner;
public class OddEven
{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number");
        int a=in.nextInt();
        if (a%2==0)
            System.out.println("The number is even");
        else
            System.out.println("odd");
    }
}
