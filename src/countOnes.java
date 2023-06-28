//Write a program to count the number of 1’s in a binary representation of the number.
//we just check the number till its greater than zero, left shift and count the 1's with get bit command.
import java.util.Scanner;
public class countOnes {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the number");
        int n= in.nextInt();
        int pos=0,count=0;
        int bitMask = 1;
        for(int i=0;n>0;i++){
            if((n & bitMask)>0)
                count++;
            n=n>>1;
        }
        System.out.println("the number of 1's is "+count);
    }
}
//another way to do this would be if the digit divided by 2 is giving integer value
//and then changing the last digit to it math.floor, for example 33 would be 100001, so 33 by 2, we have a 1,
//but 16 by 2, a zero, 8 by 2 a zero, 4 by 2, a zero, 2 by 2, a zero and 1 by 2 a 1.