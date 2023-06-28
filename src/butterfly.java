import java.util.Scanner;

public class butterfly {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        for(int i=1;i<9;i++)
        {
            for(int j=1;j<9;j++)
            {
                if(i<=4) {
                    if (j <= i || j >= 9 - i)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
                else{
                    if(j>=i || j<=9-i)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}