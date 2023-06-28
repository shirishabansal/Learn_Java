import java.util.Scanner;
public class fibon
{
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the number of terms");
        int n= in.nextInt();
        fibonacci(n);

    }
    public static void fibonacci(int n){
        int a=0,b=1;

        if(n>2) {
            System.out.print(a+ " ");
            System.out.print(b+ " ");

            for (int i = 3; i <= n; i++) {
                int c = a + b;
                a = b;
                b = c;

                System.out.print(c+ " ");
            }
        }
        else
        {
            System.out.println("enter atleast 3 terms to get series!!!");
        }
    }
}
