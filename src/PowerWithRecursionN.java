//to find x^n with stack height n. Approximately n works in such questions.
import java.util.Scanner;
public class PowerWithRecursionN {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the base and the power");
        int x=in.nextInt();
        int n=in.nextInt();
        int answer=calPower(x,n);
        System.out.println(answer);
    }
    public static int calPower(int x,int n){
        //till n==0
        if(n==0)
            return 1;
        if(x==0)
            return 0;
        int pow=x* calPower(x,n-1);
        return pow;

    }
}
