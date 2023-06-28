//W.A.P. to make pattern
import java.util.Scanner;
public class PATTERN2
{
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int a,b,n;
        for(a=1;a<=5;a++)
        {
            n=1;
            for(b=1;b<=a;b++)
            {

                if(n==1) {
                    System.out.print(n);
                    n = 0;
                }
                else
                {
                    System.out.print(n);
                    n = 1;
                }


            }
            System.out.println("");
        }

    }
}
