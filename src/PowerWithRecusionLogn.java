//W.A.P to find x to the power of n with stack height as log(n) to the base of 2.
import java.util.Scanner;
public class PowerWithRecusionLogn{
    public static int calPower(int x, int n){
        //int ans=1;
        if(n==1)
            return x;
        //if(x==0)
            //return 0;
        if(n%2==0) {

            return  (calPower(x, n / 2) * calPower(x, n / 2));
        }
        else {
            return (x * calPower(x, n / 2) * calPower(x, n / 2));
            //return ans;
        }
        //return ans;
    }
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the base and the power");
        int x=in.nextInt();
        int n=in.nextInt();
        int pow=calPower(x,n);
        System.out.println(pow);
    }

}
