import java.util.Scanner;
//Write a program to find if a number is a power of 2 or not.
public class bitTwoPower {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        //power of 2 are always like 1000.... so, if 1000=8 is taken then,
        //1000-1=0111 and 1000 & 0111 is always going to give zero, unless number was zero. so,
        int n=sc.nextInt();
        if(n!=0 && ((n & (n-1))==0))
            System.out.println("The number is a power of two");
        else
            System.out.println("The number is not a power of two");
    }
}