//Twenty tosses head and tail
 import java.util.Scanner;
public class Toss
{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Lets Play");
        int s1=0,s2=0;
        for(int i=1;i<=20;i++) {
            double d = Math.random() * 2;
            int c = (int) d;
            if (c == 1)
            {  s1 = s1 + 1;
            System.out.println("Head wins");}
            else
            { s2 = s2 + 1;
            System.out.println("Tails wins");}

        }
        System.out.println("The number of heads is "+s1);
        System.out.println("The number of tails is "+s2);
        if(s1>s2)
            System.out.println("The winner is heads");
        if(s2>s1)
            System.out.println("The winner is tails");

        }
    }

