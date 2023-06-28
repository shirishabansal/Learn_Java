//W.A.P. to calculate sum of positive even and negative odd with zero to quit,
// using while loop and display odd and even sum as result
import java.util.Scanner;
public class Choice
{
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int s1=0,s2=0;
        System.out.println("Enter the number of numbers");
        int no= in.nextInt();
        System.out.println("Enter the numbers");
        for(int i=1;i<=no;i++) {
            int p = in.nextInt();

            if (p % 2 == 0 && p > 0) {
                s1 = s1 + p;
            }
            if (p % 2!=0 && p < 0) {
                s2 = s2 + p;
            }
        }
        System.out.println("The sum of positive even numbers is "+s1);
        System.out.println("The sum of negative odd numbers is "+s2);
    }
}
