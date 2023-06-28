import java.util.Scanner;
public class GetBit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number and the position of the bit respectively");
        //in bit manipulation bits are counted from the right side with index 0
        int n =sc.nextInt();
        int pos=sc.nextInt();
        //if we want bit at index 3(position 3)
        int bitMask=1<<pos;
        if((bitMask & n) ==0)
            System.out.println("the bit is zero");
        else
            System.out.println("the bit is one");
    }
}
