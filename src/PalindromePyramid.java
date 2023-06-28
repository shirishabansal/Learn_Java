import java.util.Scanner;
public class PalindromePyramid {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the height of the pyramid");
        int n=in.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=i;j<n;j++)
                System.out.print("  ");
            for(int k=i;k>0;k--)
                System.out.print(k+" ");
            for(int l=2;l<=i;l++)
            //multiple conditions in java for loop cannot happen and we have to use operators
            //however multiple intializations and iterations can happen with the help of a comma ","
                System.out.print(l+" ");
            System.out.println();
        }
    }
}
