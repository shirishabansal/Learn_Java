//W.A.P. to display the pattern
//this just inherited pyramid class, it is soo cool!! first real inheritance!
import java.util.*;
public class BLUEJ {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
       pyramid obj1=new pyramid();
       obj1.pyramidPattern(7);

        int a,b;
        String str;
        System.out.println("Enter the word to print pattern");
        str=in.next();
        b=str.length();
        for(a=1;a<=b;a++)
        {
            System.out.println(str.substring(0,a));
        }
    }
}
