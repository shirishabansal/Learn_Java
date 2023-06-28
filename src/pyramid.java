import java.util.Scanner;
public class pyramid {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the height of the pyramid");
        int n=in.nextInt();
        pyramidPattern(n);
    }
    public static void pyramidPattern(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=n;j>i;j--)
                System.out.print(" ");
            int flag=0;
            for(int k=1; k<=i;k++)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
