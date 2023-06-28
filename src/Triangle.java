//to display the type of triangle with respect to angles
import java.util.*;

public class Triangle
{
    public static void main(String[] args)
    {
        Scanner in= new Scanner(System.in);
        int a,b,c;
        System.out.println("ENTER THREE ANGLES OF A TRIANGLE");
        a=in.nextInt();
        b=in.nextInt();
        c=in.nextInt();
        if((a>0&&a<180)&&(b>0&&b<180)&&(c>0&&c<180)&&(a+b+c==180))
        {
            System.out.println("Triangle is possible");
                    if((a>0&&a<90)&&(b>0&&b<90)&&(c>0&&c<90))
                        System.out.println("it is an acute angled triangle");
                    else if((a>90)||(b>90)||(c>90))
                        System.out.println("it is an obtuse angled triangle");
                    else
                        System.out.println("it is a right angled triangle");

        }
        else{
            System.out.println("triangle is not possible, the sum of all 3 angles shud be 180 degrees");
        }


    }
}
