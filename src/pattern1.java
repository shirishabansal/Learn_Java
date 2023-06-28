import java.util.Scanner;
public class pattern1 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int i, j;
        for (i = 1; i < 6; i++) {
            for(j = 1; j <= i; j++)
                System.out.print(j + " ");
            System.out.println();
        }

    }
}
