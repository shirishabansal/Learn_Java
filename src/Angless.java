import java.util.Scanner;
public class Angless {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int a, b, i, p, gcd = 0;
        System.out.println("Enter the two numbers");
        a = in.nextInt();
        b = in.nextInt();
        p = a * b;
        for (i = 1; i < p; i++)
        {
            if ((a % i == 0) && (b % i == 0))
                gcd = i;
        }
        System.out.println("The gcd is " +gcd);
    }
}