//to display area,perimeter or diagonal of a rectangle as per user's choice
import java.util.Scanner;
public class Menu
{
    public static void main(String[] args)
    { Scanner in= new Scanner(System.in);
        System.out.println("Enter the length and breadth");
        int l= in.nextInt();
        int b= in.nextInt();
        double d= Math.sqrt(l*l+b*b);
        System.out.println("Enter 1 for area,2 for perimeter and 3 for diagonal");
        System.out.println("Enter the value");
        int n=in.nextInt();
        switch(n)
        {
            case 1:
                System.out.println("the area is "+l*b);
                break;
            case 2:
                System.out.println("The perimeter is "+(2*(l+b)));
                break;
            case 3:
                System.out.println("The diagonal is "+ d);
        break;
            default:
                System.out.println("Invalid ");}
    }
}
