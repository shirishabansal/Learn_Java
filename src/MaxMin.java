//to find maxmin
import java.util.Scanner;
public class MaxMin
{
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int m, max=0, min= 0;
        System.out.println("Enter the number of numbers to be checked");
        int n=in.nextInt();
        System.out.println("Enter the first number");
        m=in.nextInt();
        max=m; min=m;
        System.out.println("Enter the rest of the numbers");
    for(int i=1;i<n;i++)
    { int p=in.nextInt();
    if (p>max) max=p;
    if(p<min) min=p;
    }
        System.out.println("The max is "+max);
        System.out.println("The min is "+min);
}
}
