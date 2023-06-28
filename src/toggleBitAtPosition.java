//Write a program to toggle a bit a position = “pos” in a number “n”.
import java.util.Scanner;
public class toggleBitAtPosition {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the number and the index(position) of the number to be toggled respectively");
        //we make the number 1 if its 0 and vice versa
        int num=in.nextInt();
        int pos=in.nextInt();
        int bitMask=1<<pos;
        int x= (bitMask ^ num);
        System.out.println(x);
    }
}
