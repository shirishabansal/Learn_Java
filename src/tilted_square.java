//import java.util.Scanner;
public class tilted_square {
    public static void main(String[] args) {
        //Scanner sc=new Scanner(System.in);
        for(int i=0;i<5;i++){
            for(int j=4-i;j>=0;j--)
                System.out.print(" ");
            for(int k=0;k<5;k++)
                System.out.print("#");
            System.out.println();
        }
    }
}
