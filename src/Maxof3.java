import java.util.*;
public class Maxof3
{
        public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter 3 numbers");
        int a= in.nextInt();
        int b= in.nextInt();
        int c= in.nextInt();
        int max;
        max= a>b?a>c?a:c:b>c?b:c;
        System.out.println("The answer is "+max);
    }

}
